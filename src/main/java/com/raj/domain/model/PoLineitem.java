/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raj.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author WhiteWolf
 */
public class PoLineitem implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private int qty;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
    private Date dateCreated;
    private Date dateUpdated;
    private MedicineStore medicineStoreid;
    private PurchaseOrder purchaseorderorderId;

    public PoLineitem() {
    }

    public PoLineitem(Integer id) {
        this.id = id;
    }

    public PoLineitem(Integer id, int qty, BigDecimal unitPrice, BigDecimal totalPrice, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public MedicineStore getMedicineStoreid() {
        return medicineStoreid;
    }

    public void setMedicineStoreid(MedicineStore medicineStoreid) {
        this.medicineStoreid = medicineStoreid;
    }

    public PurchaseOrder getPurchaseorderorderId() {
        return purchaseorderorderId;
    }

    public void setPurchaseorderorderId(PurchaseOrder purchaseorderorderId) {
        this.purchaseorderorderId = purchaseorderorderId;
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
        if (!(object instanceof PoLineitem)) {
            return false;
        }
        PoLineitem other = (PoLineitem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raj.model.PoLineitem[ id=" + id + " ]";
    }
    
}
