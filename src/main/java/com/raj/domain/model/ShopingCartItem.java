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
 * @author raj007
 */
public class ShopingCartItem implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    
    private int qty;
    
    private Date dateCreated;
    
    private Date dateUpdated;
    
    private BigDecimal unitPrice;
    
    private MedicineStore medicineStoreid;
    
    private Shopingcart shopingCartid;
    
    private BigDecimal totalPrice;
    
    public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public ShopingCartItem() {
    }

    public ShopingCartItem(Integer id) {
        this.id = id;
    }

    public ShopingCartItem(Integer id, int qty, Date dateCreated, Date dateUpdated, BigDecimal unitPrice) {
        this.id = id;
        this.qty = qty;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.unitPrice = unitPrice;
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

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public MedicineStore getMedicineStoreid() {
        return medicineStoreid;
    }

    public void setMedicineStoreid(MedicineStore medicineStoreid) {
        this.medicineStoreid = medicineStoreid;
    }

    public Shopingcart getShopingCartid() {
        return shopingCartid;
    }

    public void setShopingCartid(Shopingcart shopingCartid) {
        this.shopingCartid = shopingCartid;
    }

   

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateCreated == null) ? 0 : dateCreated.hashCode());
		result = prime * result
				+ ((dateUpdated == null) ? 0 : dateUpdated.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((medicineStoreid == null) ? 0 : medicineStoreid.hashCode());
		result = prime * result + qty;
		result = prime * result
				+ ((shopingCartid == null) ? 0 : shopingCartid.hashCode());
		result = prime * result
				+ ((totalPrice == null) ? 0 : totalPrice.hashCode());
		result = prime * result
				+ ((unitPrice == null) ? 0 : unitPrice.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopingCartItem other = (ShopingCartItem) obj;
		if (dateCreated == null) {
			if (other.dateCreated != null)
				return false;
		} else if (!dateCreated.equals(other.dateCreated))
			return false;
		if (dateUpdated == null) {
			if (other.dateUpdated != null)
				return false;
		} else if (!dateUpdated.equals(other.dateUpdated))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (medicineStoreid == null) {
			if (other.medicineStoreid != null)
				return false;
		} else if (!medicineStoreid.equals(other.medicineStoreid))
			return false;
		if (qty != other.qty)
			return false;
		if (shopingCartid == null) {
			if (other.shopingCartid != null)
				return false;
		} else if (!shopingCartid.getId().equals(other.shopingCartid.getId()))
			return false;
		if (totalPrice == null) {
			if (other.totalPrice != null)
				return false;
		} else if (!totalPrice.equals(other.totalPrice))
			return false;
		if (unitPrice == null) {
			if (other.unitPrice != null)
				return false;
		} else if (!unitPrice.equals(other.unitPrice))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "com.raj.model.ShopingCartItem[ id=" + id + " ]";
    }
    
}
