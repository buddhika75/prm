/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdhs.prm.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Buddhika
 */
@Entity
public class MeasurmentUnitRelationships implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    MeasurmentUnit measurmentUnitLeft;
    @ManyToOne
    MeasurmentUnit measurmentUnitRight;
    double unitRatio;
    @ManyToOne
    Item item;

    
    @ManyToOne
    WebUser creater;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date createdAt;
    @ManyToOne
    WebUser retirer;
    boolean retired;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date retitredAt;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MeasurmentUnit getMeasurmentUnitLeft() {
        return measurmentUnitLeft;
    }

    public void setMeasurmentUnitLeft(MeasurmentUnit measurmentUnitLeft) {
        this.measurmentUnitLeft = measurmentUnitLeft;
    }

    public MeasurmentUnit getMeasurmentUnitRight() {
        return measurmentUnitRight;
    }

    public void setMeasurmentUnitRight(MeasurmentUnit measurmentUnitRight) {
        this.measurmentUnitRight = measurmentUnitRight;
    }

    public double getUnitRatio() {
        return unitRatio;
    }

    public void setUnitRatio(double unitRatio) {
        this.unitRatio = unitRatio;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public WebUser getCreater() {
        return creater;
    }

    public void setCreater(WebUser creater) {
        this.creater = creater;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public WebUser getRetirer() {
        return retirer;
    }

    public void setRetirer(WebUser retirer) {
        this.retirer = retirer;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public Date getRetitredAt() {
        return retitredAt;
    }

    public void setRetitredAt(Date retitredAt) {
        this.retitredAt = retitredAt;
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MeasurmentUnitRelationships)) {
            return false;
        }
        MeasurmentUnitRelationships other = (MeasurmentUnitRelationships) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdhs.prm.entity.MeasurmentUnitRelationships[ id=" + id + " ]";
    }
    
}
