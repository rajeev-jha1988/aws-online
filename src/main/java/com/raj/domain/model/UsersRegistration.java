/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raj.domain.model;

import java.io.Serializable;

/**
 *
 * @author raj007
 */
public class UsersRegistration implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String fname;
    private String lname;
    private String mname;
    private String password;
    private String confirmpassword;
    private String emailId;
    private int mobile;

    public UsersRegistration() {
    }

    public UsersRegistration(Integer id) {
        this.id = id;
    }

    public UsersRegistration(Integer id, String fname, String lname, String password, String confirmpassword, String emailId, int mobile) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.confirmpassword = confirmpassword;
        this.emailId = emailId;
        this.mobile = mobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
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
        if (!(object instanceof UsersRegistration)) {
            return false;
        }
        UsersRegistration other = (UsersRegistration) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raj.onlinemedicine.UsersRegistration[ id=" + id + " ]";
    }
    
}
