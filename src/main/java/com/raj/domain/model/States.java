/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raj.domain.model;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author raj007
 */
public class States implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    
    private String name;
    
    private Set<UserAddress> userAddressSet;
    
    private Countries countriesId;

    public States() {
    }

    public States(Integer id) {
        this.id = id;
    }

    public States(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserAddress> getUserAddressSet() {
        return userAddressSet;
    }

    public void setUserAddressSet(Set<UserAddress> userAddressSet) {
        this.userAddressSet = userAddressSet;
    }

    public Countries getCountriesId() {
        return countriesId;
    }

    public void setCountriesId(Countries countriesId) {
        this.countriesId = countriesId;
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
        if (!(object instanceof States)) {
            return false;
        }
        States other = (States) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.onlinemedicine.model.States[ id=" + id + " ]";
    }
    
}
