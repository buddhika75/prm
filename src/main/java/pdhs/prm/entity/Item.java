/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdhs.prm.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @author Buddhika
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Item extends ItemEntity implements Serializable {
    @OneToMany
    List<MeasurmentUnit> measurmentUnits;
    MeasurmentUnit measurmentUnit;

    public MeasurmentUnit getMeasurmentUnit() {
        return measurmentUnit;
    }

    public void setMeasurmentUnit(MeasurmentUnit measurmentUnit) {
        this.measurmentUnit = measurmentUnit;
    }
    
    
    
    public List<MeasurmentUnit> getMeasurmentUnits() {
        return measurmentUnits;
    }

    public void setMeasurmentUnits(List<MeasurmentUnit> measurmentUnits) {
        this.measurmentUnits = measurmentUnits;
    }
    
    
}
