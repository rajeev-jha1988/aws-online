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
 * @author WhiteWolf
 */
public class Countries implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    
    private String sortname;
    
    private String name;
    
    private int phonecode;
    
    private Set<UserAddress> userAddressSet;
    
    private Set<States> statesSet;

    public Countries() {
    }

    public Countries(Integer id) {
        this.id = id;
    }

    public Countries(Integer id, String sortname, String name, int phonecode) {
        this.id = id;
        this.sortname = sortname;
        this.name = name;
        this.phonecode = phonecode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSortname() {
        return sortname;
    }

    public void setSortname(String sortname) {
        this.sortname = sortname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonecode() {
        return phonecode;
    }

    public void setPhonecode(int phonecode) {
        this.phonecode = phonecode;
    }

    public Set<UserAddress> getUserAddressSet() {
        return userAddressSet;
    }

    public void setUserAddressSet(Set<UserAddress> userAddressSet) {
        this.userAddressSet = userAddressSet;
    }

    public Set<States> getStatesSet() {
        return statesSet;
    }

    public void setStatesSet(Set<States> statesSet) {
        this.statesSet = statesSet;
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
        if (!(object instanceof Countries)) {
            return false;
        }
        Countries other = (Countries) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.onlinemedicine.model.Countries[ id=" + id + " ]";
    }
    
}
