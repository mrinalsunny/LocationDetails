package com.cgi.location.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = 4941234011276626104L;

	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
