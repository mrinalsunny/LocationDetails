package com.cgi.location.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.cgi.location.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	public User findByUsername(String username);

}
