/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdhs.prm.jsf;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pdhs.prm.entity.Institution;
import pdhs.prm.entity.WebUser;
import pdhs.prm.jsf.util.JsfUtil;
import pdhs.prm.sessionbeans.WebUserFacade;

/**
 *
 * @author Buddhika
 */
@ManagedBean
@SessionScoped
public class SessionController {

    @EJB
    WebUserFacade webUserFacade;

    boolean logged;
    WebUser loggedUser;
    Institution institution;

    String userName;
    String password;
    String user;
    int loginAttempts;

    public String login() {
        if (userName.trim().equals("")) {
            JsfUtil.addSuccessMessage("User name?");
            return "";
        }
        if (password.trim().equals("")) {
            JsfUtil.addSuccessMessage("Password?");
            return "";
        }
        WebUser u;
        if (firstLogin()) {
            if (user.trim().equals("")) {
                JsfUtil.addErrorMessage("User ?");
                return "";
            }
            u = new WebUser();
            u.setName(user);
            u.setUserName(userName);
            u.setPassword(CommonController.hashPassword(password));
            webUserFacade.create(u);
            JsfUtil.addSuccessMessage("New User Added. Logged to the system");

        } else {
            String jpql;
            jpql = "select u from WebUser u where u.retired=false and u.userName=:un";
            Map m = new HashMap();
            m.put("un", userName);
            u = webUserFacade.findFirstBySQL(jpql, m);
            if (u == null) {
                JsfUtil.addErrorMessage("Wrong username or password. Please retry.");
                loginAttempts++;
                return "";
            }
            if (!CommonController.passwordMatches(password, u.getPassword())) {
                JsfUtil.addErrorMessage("Wrong username or password. Please retry.");
                loginAttempts++;
                return "";
            }
        }
        loggedUser = u;
        return "index";
    }

    public boolean firstLogin() {
        String sql = "Select u from Webuser u where u.retired=false";
        return webUserFacade.findBySQL(sql).isEmpty();
    }

    /**
     * Creates a new instance of SessionController
     */
    public SessionController() {
    }

    public boolean isLogged() {
        return logged;
    }
    
    public boolean getLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public WebUser getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(WebUser loggedUser) {
        this.loggedUser = loggedUser;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }
    
    

}
