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
 * @author raj007
 */
public class UserAddress implements Serializable {

    private static final long serialVersionUID = 1L;
    private String addressLine1;
    private String addressLine2;

    private String addressLine3;
    private String city;
    private String pincode;
    private Integer id;
    
    private Date dateCreated;
    
    private Date dateUpdated;
    
    
    private String name;
    
    private Countries countriesId;
    
    private States statesId;
    
    private Users usersId;
    
    private boolean active;
    
    
    public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public UserAddress() {
    }

    public UserAddress(Integer id) {
        this.id = id;
    }

    public UserAddress(Integer id, String addressLine1, String addressLine2, String addressLine3, String city, String pincode, String name) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.pincode = pincode;
        this.name = name;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Countries getCountriesId() {
        return countriesId;
    }

    public void setCountriesId(Countries countriesId) {
        this.countriesId = countriesId;
    }

    public States getStatesId() {
        return statesId;
    }

    public void setStatesId(States statesId) {
        this.statesId = statesId;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
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
        if (!(object instanceof UserAddress)) {
            return false;
        }
        UserAddress other = (UserAddress) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.onlinemedicine.model.UserAddress[ id=" + id + " ]";
    }
    
}
