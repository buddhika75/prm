/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdhs.prm.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import org.jasypt.util.password.StrongPasswordEncryptor;

/**
 *
 * @author Buddhika
 */
@ManagedBean
@ApplicationScoped
public class CommonController {

    /**
     * Creates a new instance of CommonController
     */
    public CommonController() {
    }

    public static String hashPassword(String passwordToHash) {
        StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
        return passwordEncryptor.encryptPassword(passwordToHash);
    }

    public static boolean passwordMatches(String password, String hashedPassword) {
        StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
        return passwordEncryptor.checkPassword(password, hashedPassword);
    }

}
