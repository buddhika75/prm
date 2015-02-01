/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdhs.prm.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import pdhs.prm.enums.BillCategory;
import pdhs.prm.enums.BillType;

/**
 *
 * @author Buddhika
 */
@Entity
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date billedAt;
    @ManyToOne
    WebUser billedUser;
    @Lob
    String description;
    @OneToMany
    List<ItemEntity> descriptions;

    @OneToMany(mappedBy = "bill")
    List<BillItem> billItems;
    @Enumerated(EnumType.STRING)
    BillCategory billCategory;
    @Enumerated(EnumType.STRING)
    BillType billType;

    double grossTotal;
    double netTotal;
    double billDiscount;
    double adjustments;
    double itemDiscount;
    double expensesTotal;

    double grossTotalEstimate;
    double netTotalEstimate;
    double billDiscountEstimate;
    double adjustmentsEstimate;
    double itemDiscountEstimate;
    double expensesTotalEstimate;

    double grossTotalCost;
    double netTotalCost;
    double billDiscountCost;
    double adjustmentsCost;
    double itemDiscountCost;
    double expensesTotalCost;

    @ManyToOne
    Bill cancelBill;
    @OneToMany
    List<Bill> returnBills;

    @ManyToOne
    Institution institution;
    @ManyToOne
    Institution parentInstitution;
    @ManyToOne
    Area area;
    @ManyToOne
    Area parentArea;

    @ManyToOne
    Institution fromInstitution;
    @ManyToOne
    Institution fromParentInstitution;
    @ManyToOne
    Area fromArea;
    @ManyToOne
    Area fromParentArea;

    @ManyToOne
    Institution toInstitution;
    @ManyToOne
    Institution toParentInstitution;
    @ManyToOne
    Area toArea;
    @ManyToOne
    Area toParentArea;

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

    public Date getBilledAt() {
        return billedAt;
    }

    public void setBilledAt(Date billedAt) {
        this.billedAt = billedAt;
    }

    public WebUser getBilledUser() {
        return billedUser;
    }

    public void setBilledUser(WebUser billedUser) {
        this.billedUser = billedUser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ItemEntity> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<ItemEntity> descriptions) {
        this.descriptions = descriptions;
    }

    public List<BillItem> getBillItems() {
        return billItems;
    }

    public void setBillItems(List<BillItem> billItems) {
        this.billItems = billItems;
    }

    public BillCategory getBillCategory() {
        return billCategory;
    }

    public void setBillCategory(BillCategory billCategory) {
        this.billCategory = billCategory;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public double getGrossTotal() {
        return grossTotal;
    }

    public void setGrossTotal(double grossTotal) {
        this.grossTotal = grossTotal;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }

    public double getBillDiscount() {
        return billDiscount;
    }

    public void setBillDiscount(double billDiscount) {
        this.billDiscount = billDiscount;
    }

    public double getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(double adjustments) {
        this.adjustments = adjustments;
    }

    public double getItemDiscount() {
        return itemDiscount;
    }

    public void setItemDiscount(double itemDiscount) {
        this.itemDiscount = itemDiscount;
    }

    public double getExpensesTotal() {
        return expensesTotal;
    }

    public void setExpensesTotal(double expensesTotal) {
        this.expensesTotal = expensesTotal;
    }

    public double getGrossTotalEstimate() {
        return grossTotalEstimate;
    }

    public void setGrossTotalEstimate(double grossTotalEstimate) {
        this.grossTotalEstimate = grossTotalEstimate;
    }

    public double getNetTotalEstimate() {
        return netTotalEstimate;
    }

    public void setNetTotalEstimate(double netTotalEstimate) {
        this.netTotalEstimate = netTotalEstimate;
    }

    public double getBillDiscountEstimate() {
        return billDiscountEstimate;
    }

    public void setBillDiscountEstimate(double billDiscountEstimate) {
        this.billDiscountEstimate = billDiscountEstimate;
    }

    public double getAdjustmentsEstimate() {
        return adjustmentsEstimate;
    }

    public void setAdjustmentsEstimate(double adjustmentsEstimate) {
        this.adjustmentsEstimate = adjustmentsEstimate;
    }

    public double getItemDiscountEstimate() {
        return itemDiscountEstimate;
    }

    public void setItemDiscountEstimate(double itemDiscountEstimate) {
        this.itemDiscountEstimate = itemDiscountEstimate;
    }

    public double getExpensesTotalEstimate() {
        return expensesTotalEstimate;
    }

    public void setExpensesTotalEstimate(double expensesTotalEstimate) {
        this.expensesTotalEstimate = expensesTotalEstimate;
    }

    public double getGrossTotalCost() {
        return grossTotalCost;
    }

    public void setGrossTotalCost(double grossTotalCost) {
        this.grossTotalCost = grossTotalCost;
    }

    public double getNetTotalCost() {
        return netTotalCost;
    }

    public void setNetTotalCost(double netTotalCost) {
        this.netTotalCost = netTotalCost;
    }

    public double getBillDiscountCost() {
        return billDiscountCost;
    }

    public void setBillDiscountCost(double billDiscountCost) {
        this.billDiscountCost = billDiscountCost;
    }

    public double getAdjustmentsCost() {
        return adjustmentsCost;
    }

    public void setAdjustmentsCost(double adjustmentsCost) {
        this.adjustmentsCost = adjustmentsCost;
    }

    public double getItemDiscountCost() {
        return itemDiscountCost;
    }

    public void setItemDiscountCost(double itemDiscountCost) {
        this.itemDiscountCost = itemDiscountCost;
    }

    public double getExpensesTotalCost() {
        return expensesTotalCost;
    }

    public void setExpensesTotalCost(double expensesTotalCost) {
        this.expensesTotalCost = expensesTotalCost;
    }

    public Bill getCancelBill() {
        return cancelBill;
    }

    public void setCancelBill(Bill cancelBill) {
        this.cancelBill = cancelBill;
    }

    public List<Bill> getReturnBills() {
        return returnBills;
    }

    public void setReturnBills(List<Bill> returnBills) {
        this.returnBills = returnBills;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Institution getParentInstitution() {
        return parentInstitution;
    }

    public void setParentInstitution(Institution parentInstitution) {
        this.parentInstitution = parentInstitution;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Area getParentArea() {
        return parentArea;
    }

    public void setParentArea(Area parentArea) {
        this.parentArea = parentArea;
    }

    public Institution getFromInstitution() {
        return fromInstitution;
    }

    public void setFromInstitution(Institution fromInstitution) {
        this.fromInstitution = fromInstitution;
    }

    public Institution getFromParentInstitution() {
        return fromParentInstitution;
    }

    public void setFromParentInstitution(Institution fromParentInstitution) {
        this.fromParentInstitution = fromParentInstitution;
    }

    public Area getFromArea() {
        return fromArea;
    }

    public void setFromArea(Area fromArea) {
        this.fromArea = fromArea;
    }

    public Area getFromParentArea() {
        return fromParentArea;
    }

    public void setFromParentArea(Area fromParentArea) {
        this.fromParentArea = fromParentArea;
    }

    public Institution getToInstitution() {
        return toInstitution;
    }

    public void setToInstitution(Institution toInstitution) {
        this.toInstitution = toInstitution;
    }

    public Institution getToParentInstitution() {
        return toParentInstitution;
    }

    public void setToParentInstitution(Institution toParentInstitution) {
        this.toParentInstitution = toParentInstitution;
    }

    public Area getToArea() {
        return toArea;
    }

    public void setToArea(Area toArea) {
        this.toArea = toArea;
    }

    public Area getToParentArea() {
        return toParentArea;
    }

    public void setToParentArea(Area toParentArea) {
        this.toParentArea = toParentArea;
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
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdhs.prm.entity.Bill[ id=" + id + " ]";
    }

}
