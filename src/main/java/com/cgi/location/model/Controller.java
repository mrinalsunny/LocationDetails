package com.cgi.location.model;

import org.springframework.data.annotation.Id;

public class Controller {

	@Id
	private String id;

	private String host;
	private String username;
	private String password;
	private String owner;

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

	public Controller() {
	}

	public Controller(String host, String username, String password, String owner) {
		super();
		this.host = host;
		this.username = username;
		this.password = password;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Browser [id=" + id + ", host=" + host + ", username=" + username + ", password=" + password + ", owner="
				+ owner + "]";
	}

}
