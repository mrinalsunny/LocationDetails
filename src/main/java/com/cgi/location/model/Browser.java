package com.cgi.location.model;

import java.util.Date;

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
@Document(collection = "Browser")
public class Browser {

	@Id
	private String id;

	private String app;
	private String host;
	private String username;
	private String password;
	private String owner;
	private Date createDate;
	private Date modifiedDate;

}
