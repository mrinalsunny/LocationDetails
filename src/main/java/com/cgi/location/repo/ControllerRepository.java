package com.cgi.location.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cgi.location.model.Controller;

public interface ControllerRepository extends MongoRepository<Controller, String> {

	public List<Controller> findByOwner(String owner);

	public List<Controller> findByUsername(String username);

}
