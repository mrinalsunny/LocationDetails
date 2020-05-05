package com.cgi.location.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cgi.location.model.Browser;

public interface BrowserRepository extends MongoRepository<Browser, String> {

	public List<Browser> findByOwner(String owner);

	public List<Browser> findByUsername(String username);

}
