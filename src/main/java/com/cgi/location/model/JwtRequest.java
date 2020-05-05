package com.cgi.location.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JwtRequest implements Serializable{
	private static final long serialVersionUID = 9179358501110605921L;
	
	private String username;
	private String password;
}
