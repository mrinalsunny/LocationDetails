package com.cgi.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.location.model.Controller;
import com.cgi.location.service.ControllerService;

@RestController
@RequestMapping("/api/v1/controller")
public class ControllerController {

	@Autowired
	ControllerService controllerService;

	@GetMapping("/get/all")
	public List<Controller> getAll() {
		return controllerService.findAll();
	}

	@GetMapping("/get/{id}")
	public Controller getById(@PathVariable("id") String id) {
		return controllerService.findById(id);
	}

	@PostMapping("/add")
	public Controller save(@RequestBody Controller controller) {
		return controllerService.save(controller);
	}

	@PutMapping("update/{id}")
	public Controller update(@PathVariable("id") String id, @RequestBody Controller controller) {
		return controllerService.update(id, controller);
	}

	@DeleteMapping("delete/{id}")
	public void deleteBrowser(@PathVariable("id") String id) {
		controllerService.delete(id);
	}
}
