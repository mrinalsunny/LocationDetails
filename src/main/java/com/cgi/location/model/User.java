package com.cgi.location.model;

import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "User")
public class User {

	@Id
	private String id;

	private String firstName;
	private String lastName;
	private String username;
	private String emailId;
	private String password;
	private Map<String,String> securityQA;
	private Date createdDate;
	private Date modifiedDate;

}
