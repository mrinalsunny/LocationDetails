package com.cgi.location.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.location.model.Controller;
import com.cgi.location.repo.ControllerRepository;

@Service
public class ControllerService {

	@Autowired
	ControllerRepository repository;

	public List<Controller> findAll() {
		return repository.findAll();
	}

	public Controller findById(String id) {
		return repository.findById(id).get();
	}

	public Controller save(Controller controller) {
		controller.setCreateDate(new Date());
		controller.setModifiedDate(new Date());
		return repository.save(controller);
	}

	public Controller update(String id, Controller controller) {
		Controller toUpdate = repository.findById(id).get();
		System.out.println(toUpdate);
		toUpdate.setApp(controller.getApp());
		toUpdate.setHost(controller.getHost());
		toUpdate.setUsername(controller.getUsername());
		toUpdate.setPassword(controller.getPassword());
		toUpdate.setOwner(controller.getOwner());
		toUpdate.setModifiedDate(new Date());
		return repository.save(toUpdate);
	}

	public void delete(String id) {
		repository.deleteById(id);
	}
}
