/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raj.domain.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;



/**
 *
 * @author raj007
 */
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;

	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String userId;
	
	private String emailId;
	
	private int mobile;
	
	private Date dateCreated;
	
	private Date dateUpdated;
	
	private Set<Shopingcart> shopingcartSet;
	private Set<PurchaseOrder> purchaseOrderSet;
	private Set<UserAddress> userAddressSet;
	
	private String password;
	
	
	public static enum ProviderType{
		FACEBOOK("Facebook"),GOOGLE("Google"),LOCAL("Local");
		private String value;
		private ProviderType(String value){
			this.value=value;
		}
		public static ProviderType fromStr(String value){
			switch (value) {
			case "Facebook":
				return FACEBOOK;
			case "google":
				return GOOGLE;
			default:
				return LOCAL;
			}

		}
	}
	
	private ProviderType providerType;
	
	private String roles;
	
	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Users() {
	}

	public Users(Integer id) {
		this.id = id;
	}

	public Users(Integer id, String firstName, String middleName, String lastName, String userId, String emailId, int mobile, Date dateCreated, Date dateUpdated) {
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.userId = userId;
		this.emailId = emailId;
		this.mobile = mobile;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public Set<Shopingcart> getShopingcartSet() {
		return shopingcartSet;
	}

	public void setShopingcartSet(Set<Shopingcart> shopingcartSet) {
		this.shopingcartSet = shopingcartSet;
	}

	public Set<PurchaseOrder> getPurchaseOrderSet() {
		return purchaseOrderSet;
	}

	public void setPurchaseOrderSet(Set<PurchaseOrder> purchaseOrderSet) {
		this.purchaseOrderSet = purchaseOrderSet;
	}

	public Set<UserAddress> getUserAddressSet() {
		return userAddressSet;
	}

	public void setUserAddressSet(Set<UserAddress> userAddressSet) {
		this.userAddressSet = userAddressSet;
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
		if (!(object instanceof Users)) {
			return false;
		}
	Users other = (Users) object;
	if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
		return false;
	}
	return true;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", userId=" + userId
				+ ", emailId=" + emailId + ", mobile=" + mobile
				+ ", providerType=" + providerType + ", roles=" + roles + "]";
	}

	public ProviderType getProviderType() {
		return providerType;
	}

	public void setProviderType(ProviderType providerType) {
		this.providerType = providerType;
	}

}
