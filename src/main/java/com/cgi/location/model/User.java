package com.cgi.location.model;

import java.util.Arrays;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {

	@Id
	private String id;

	private String firstName;
	private String lastName;
	private String username;
	private String emailId;
	private String password;
	private String[] securityQuestions;
	private String[] securityAnswers;
	private Date createdDate;
	private Date modifiedDate;

	public User() {
	}

	public User(String firstName, String lastName, String username, String emailId, String password,
			String[] securityQuestions, String[] securityAnswers) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.emailId = emailId;
		this.password = password;
		this.securityQuestions = securityQuestions;
		this.securityAnswers = securityAnswers;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getSecurityQuestions() {
		return securityQuestions;
	}

	public void setSecurityQuestions(String[] securityQuestions) {
		this.securityQuestions = securityQuestions;
	}

	public String[] getSecurityAnswers() {
		return securityAnswers;
	}

	public void setSecurityAnswers(String[] securityAnswers) {
		this.securityAnswers = securityAnswers;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", emailId=" + emailId + ", password=" + password + ", securityQuestions="
				+ Arrays.toString(securityQuestions) + ", securityAnswers=" + Arrays.toString(securityAnswers)
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + "]";
	}

}
