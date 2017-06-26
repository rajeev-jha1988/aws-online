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
public class Manufacturer implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String mafName;
    private String mafId;
    private Set<MedicineStore> medicineStoreSet;

    public Manufacturer() {
    }

    public Manufacturer(Integer id) {
        this.id = id;
    }

    public Manufacturer(Integer id, String mafName, String mafId) {
        this.id = id;
        this.mafName = mafName;
        this.mafId = mafId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMafName() {
        return mafName;
    }

    public void setMafName(String mafName) {
        this.mafName = mafName;
    }

    public String getMafId() {
        return mafId;
    }

    public void setMafId(String mafId) {
        this.mafId = mafId;
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
        if (!(object instanceof Manufacturer)) {
            return false;
        }
        Manufacturer other = (Manufacturer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raj.model.Manufacturer[ id=" + id + " ]";
    }
    
}
