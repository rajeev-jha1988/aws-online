/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raj.domain.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author WhiteWolf
 */
public class PoShiping implements Serializable {

    private static final long serialVersionUID = 1L;
    private String currentPlace;
    private Date dateDelivery;
    private Date expectedDateDelivery;
    private Date dateCreated;
    private Date dateUpdated;
    private Integer id;
    private PurchaseOrder purchaseorderorderId;
    private ShipStatusLookup shipstatuslookupid;

    public PoShiping() {
    }

    public PoShiping(Integer id) {
        this.id = id;
    }

    public PoShiping(Integer id, String currentPlace, Date dateDelivery, Date expectedDateDelivery, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.currentPlace = currentPlace;
        this.dateDelivery = dateDelivery;
        this.expectedDateDelivery = expectedDateDelivery;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public String getCurrentPlace() {
        return currentPlace;
    }

    public void setCurrentPlace(String currentPlace) {
        this.currentPlace = currentPlace;
    }

    public Date getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(Date dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public Date getExpectedDateDelivery() {
        return expectedDateDelivery;
    }

    public void setExpectedDateDelivery(Date expectedDateDelivery) {
        this.expectedDateDelivery = expectedDateDelivery;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PurchaseOrder getPurchaseorderorderId() {
        return purchaseorderorderId;
    }

    public void setPurchaseorderorderId(PurchaseOrder purchaseorderorderId) {
        this.purchaseorderorderId = purchaseorderorderId;
    }

    public ShipStatusLookup getShipstatuslookupid() {
        return shipstatuslookupid;
    }

    public void setShipstatuslookupid(ShipStatusLookup shipstatuslookupid) {
        this.shipstatuslookupid = shipstatuslookupid;
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
        if (!(object instanceof PoShiping)) {
            return false;
        }
        PoShiping other = (PoShiping) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raj.model.PoShiping[ id=" + id + " ]";
    }
    
}
