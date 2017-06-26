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
public class ShipStatusLookup implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private int name;
    private Set<PoShiping> poShipingSet;

    public ShipStatusLookup() {
    }

    public ShipStatusLookup(Integer id) {
        this.id = id;
    }

    public ShipStatusLookup(Integer id, int name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Set<PoShiping> getPoShipingSet() {
        return poShipingSet;
    }

    public void setPoShipingSet(Set<PoShiping> poShipingSet) {
        this.poShipingSet = poShipingSet;
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
        if (!(object instanceof ShipStatusLookup)) {
            return false;
        }
        ShipStatusLookup other = (ShipStatusLookup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raj.model.ShipStatusLookup[ id=" + id + " ]";
    }
    
}
