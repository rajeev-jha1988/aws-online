/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raj.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;



/**
 *
 * @author raj007
 */
public class PurchaseOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer orderId;
    
    private String orderNumber;
    
    private Date orderDate;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal totalPrice;
    
    private Date dateCreated;
    
    private Date dateUpdated;
    
    private OrderStatusLookup orderStatuslookupid;
    
    private Users usersid;
    
    private Set<PoShiping> poShipingSet;
    
    private Set<PoLineitem> poLineitemSet;

    public PurchaseOrder() {
    }

    public PurchaseOrder(Integer orderId) {
        this.orderId = orderId;
    }

    public PurchaseOrder(Integer orderId, String orderNumber, Date orderDate, BigDecimal totalPrice, Date dateCreated, Date dateUpdated) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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

    public OrderStatusLookup getOrderStatuslookupid() {
        return orderStatuslookupid;
    }

    public void setOrderStatuslookupid(OrderStatusLookup orderStatuslookupid) {
        this.orderStatuslookupid = orderStatuslookupid;
    }

    public Users getUsersid() {
        return usersid;
    }

    public void setUsersid(Users usersid) {
        this.usersid = usersid;
    }

    public Set<PoShiping> getPoShipingSet() {
        return poShipingSet;
    }

    public void setPoShipingSet(Set<PoShiping> poShipingSet) {
        this.poShipingSet = poShipingSet;
    }

    public Set<PoLineitem> getPoLineitemSet() {
        return poLineitemSet;
    }

    public void setPoLineitemSet(Set<PoLineitem> poLineitemSet) {
        this.poLineitemSet = poLineitemSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseOrder)) {
            return false;
        }
        PurchaseOrder other = (PurchaseOrder) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raj.model.PurchaseOrder[ orderId=" + orderId + " ]";
    }
    
}
