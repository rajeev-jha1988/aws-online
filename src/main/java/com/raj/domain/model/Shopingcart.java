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
public class Shopingcart implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    
    private Date dateCreated;

    private Date dateUpdated;

    private BigDecimal totalAmt;
    
    private Users usersid;
    
    private Set<ShopingCartItem> shopingCartItemSet;
    
    private boolean active;
    
    private String orderNum;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Shopingcart() {
    }

    public Shopingcart(Integer id) {
        this.id = id;
    }

    public Shopingcart(Integer id, Date dateCreated, Date dateUpdated, BigDecimal totalAmt) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.totalAmt = totalAmt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    public Users getUsersid() {
        return usersid;
    }

    public void setUsersid(Users usersid) {
        this.usersid = usersid;
    }

    public Set<ShopingCartItem> getShopingCartItemSet() {
        return shopingCartItemSet;
    }

    public void setShopingCartItemSet(Set<ShopingCartItem> shopingCartItemSet) {
        this.shopingCartItemSet = shopingCartItemSet;
    }

   

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result
				+ ((dateCreated == null) ? 0 : dateCreated.hashCode());
		result = prime * result
				+ ((dateUpdated == null) ? 0 : dateUpdated.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		
		result = prime * result
				+ ((totalAmt == null) ? 0 : totalAmt.hashCode());
		result = prime * result + ((usersid == null) ? 0 : usersid.hashCode());
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
		Shopingcart other = (Shopingcart) obj;
		if (active != other.active)
			return false;
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
		if (totalAmt == null) {
			if (other.totalAmt != null)
				return false;
		} else if (!totalAmt.equals(other.totalAmt))
			return false;
		if (usersid == null) {
			if (other.usersid != null)
				return false;
		} else if (!usersid.equals(other.usersid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shopingcart [id=" + id + ", totalAmt=" + totalAmt
				+ ", usersid=" + usersid + ", shopingCartItemSet="
				+ shopingCartItemSet + "]";
	}

    
    
}
