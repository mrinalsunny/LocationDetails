package com.cgi.location.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Browser {

	@Id
	private String id;

	private String host;
	private String username;
	private String password;
	private String owner;
	private Boolean isEditable;
	private Date modifiedDate;

	public String getId() {
		return id;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Boolean getIsEditable() {
		return isEditable;
	}

	public void setIsEditable(Boolean isEditable) {
		this.isEditable = isEditable;
	}

	public Browser() {
	}

	public Browser(String host, String username, String password, String owner, Boolean isEditable, Date modifiedDate) {
		super();
		this.host = host;
		this.username = username;
		this.password = password;
		this.owner = owner;
		this.isEditable = isEditable;
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "Browser [id=" + id + ", host=" + host + ", username=" + username + ", password=" + password + ", owner="
				+ owner + ", isEditable=" + isEditable + ", modifiedDate=" + modifiedDate + "]";
	}

	
}
