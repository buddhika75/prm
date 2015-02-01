/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdhs.prm.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Buddhika
 */
@Entity
public class BillItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Bill bill;
    
    @ManyToOne
    Item item;
    double quentity;
    @ManyToOne
    MeasurmentUnit quentityUnit;
    double grossRate;
    double billDiscountRate;
    double itemDiscountRate;
    double expenseRate;
    double adjustmentRate;
    double netRate;
    
    double grossRateCost;
    double billDiscountRateCost;
    double itemDiscountRateCost;
    double expenseRateCost;
    double adjustmentRateCost;
    double netRateCost;
    
    
    double freeQuentity;
    @ManyToOne
    MeasurmentUnit freeUnit;
    

    @ManyToOne
    BillItem cancelledBillItem;
    @OneToMany
    List<BillItem> returnedBillItems;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getQuentity() {
        return quentity;
    }

    public void setQuentity(double quentity) {
        this.quentity = quentity;
    }

    public MeasurmentUnit getQuentityUnit() {
        return quentityUnit;
    }

    public void setQuentityUnit(MeasurmentUnit quentityUnit) {
        this.quentityUnit = quentityUnit;
    }

    public double getGrossRate() {
        return grossRate;
    }

    public void setGrossRate(double grossRate) {
        this.grossRate = grossRate;
    }

    public double getBillDiscountRate() {
        return billDiscountRate;
    }

    public void setBillDiscountRate(double billDiscountRate) {
        this.billDiscountRate = billDiscountRate;
    }

    public double getItemDiscountRate() {
        return itemDiscountRate;
    }

    public void setItemDiscountRate(double itemDiscountRate) {
        this.itemDiscountRate = itemDiscountRate;
    }

    public double getExpenseRate() {
        return expenseRate;
    }

    public void setExpenseRate(double expenseRate) {
        this.expenseRate = expenseRate;
    }

    public double getAdjustmentRate() {
        return adjustmentRate;
    }

    public void setAdjustmentRate(double adjustmentRate) {
        this.adjustmentRate = adjustmentRate;
    }

    public double getNetRate() {
        return netRate;
    }

    public void setNetRate(double netRate) {
        this.netRate = netRate;
    }

    public double getGrossRateCost() {
        return grossRateCost;
    }

    public void setGrossRateCost(double grossRateCost) {
        this.grossRateCost = grossRateCost;
    }

    public double getBillDiscountRateCost() {
        return billDiscountRateCost;
    }

    public void setBillDiscountRateCost(double billDiscountRateCost) {
        this.billDiscountRateCost = billDiscountRateCost;
    }

    public double getItemDiscountRateCost() {
        return itemDiscountRateCost;
    }

    public void setItemDiscountRateCost(double itemDiscountRateCost) {
        this.itemDiscountRateCost = itemDiscountRateCost;
    }

    public double getExpenseRateCost() {
        return expenseRateCost;
    }

    public void setExpenseRateCost(double expenseRateCost) {
        this.expenseRateCost = expenseRateCost;
    }

    public double getAdjustmentRateCost() {
        return adjustmentRateCost;
    }

    public void setAdjustmentRateCost(double adjustmentRateCost) {
        this.adjustmentRateCost = adjustmentRateCost;
    }

    public double getNetRateCost() {
        return netRateCost;
    }

    public void setNetRateCost(double netRateCost) {
        this.netRateCost = netRateCost;
    }

    public double getFreeQuentity() {
        return freeQuentity;
    }

    public void setFreeQuentity(double freeQuentity) {
        this.freeQuentity = freeQuentity;
    }

    public MeasurmentUnit getFreeUnit() {
        return freeUnit;
    }

    public void setFreeUnit(MeasurmentUnit freeUnit) {
        this.freeUnit = freeUnit;
    }

    public BillItem getCancelledBillItem() {
        return cancelledBillItem;
    }

    public void setCancelledBillItem(BillItem cancelledBillItem) {
        this.cancelledBillItem = cancelledBillItem;
    }

    public List<BillItem> getReturnedBillItems() {
        return returnedBillItems;
    }

    public void setReturnedBillItems(List<BillItem> returnedBillItems) {
        this.returnedBillItems = returnedBillItems;
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
        if (!(object instanceof BillItem)) {
            return false;
        }
        BillItem other = (BillItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdhs.prm.entity.BillItem[ id=" + id + " ]";
    }

}
