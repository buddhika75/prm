/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdhs.prm.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import pdhs.prm.enums.AreaType;

/**
 *
 * @author Buddhika
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Area extends ItemEntity implements Serializable {

    @Enumerated(EnumType.STRING)
    AreaType areaType;
    @ManyToOne
    Area parentArea;
    @ManyToOne
    Area superParentArea;
    @ManyToOne
    Person headOfArea;

    public AreaType getAreaType() {
        return areaType;
    }

    public void setAreaType(AreaType areaType) {
        this.areaType = areaType;
    }

    public Area getParentArea() {
        return parentArea;
    }

    public void setParentArea(Area parentArea) {
        this.parentArea = parentArea;
    }

    public Area getSuperParentArea() {
        return superParentArea;
    }

    public void setSuperParentArea(Area superParentArea) {
        this.superParentArea = superParentArea;
    }

    public Person getHeadOfArea() {
        return headOfArea;
    }

    public void setHeadOfArea(Person headOfArea) {
        this.headOfArea = headOfArea;
    }


    
    
  
}
