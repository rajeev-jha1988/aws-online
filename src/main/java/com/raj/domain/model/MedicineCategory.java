package com.raj.domain.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author WhiteWolf
 */
public class MedicineCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String catName;
    private Set<MedicineStore> medicineStoreSet;

    public MedicineCategory() {
    }

    public MedicineCategory(Integer id) {
        this.id = id;
    }

    public MedicineCategory(Integer id, String catName) {
        this.id = id;
        this.catName = catName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Set<MedicineStore> getMedicineStoreSet() {
        return medicineStoreSet;
    }

    public void setMedicineStoreSet(Set<MedicineStore> medicineStoreSet) {
        this.medicineStoreSet = medicineStoreSet;
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
        if (!(object instanceof MedicineCategory)) {
            return false;
        }
        MedicineCategory other = (MedicineCategory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raj.model.MedicineCategory[ id=" + id + " ]";
    }
    
}
