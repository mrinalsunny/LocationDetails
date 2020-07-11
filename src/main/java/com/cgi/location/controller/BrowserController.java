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
import org.springframework.web.client.RestTemplate;

import com.cgi.location.model.Browser;
import com.cgi.location.service.BrowserService;

@RestController
@RequestMapping("/api/v1/browser")
public class BrowserController {

	@Autowired
	BrowserService browserService;
	
	@Autowired
	RestTemplate resttemplate;

	@GetMapping("/get/all")
	public List<Browser> getAll() {
//		resttemplate.getForObject("http://localhost:8080/kafka/publish/get", Browser.class);
		return browserService.findAll();
	}

	@GetMapping("/get/{id}")
	public Browser getById(@PathVariable("id") String id) {
		return browserService.findById(id);
	}

	@PostMapping("/add")
	public Browser save(@RequestBody Browser browser) {
		return browserService.save(browser);
	}

	@PutMapping("update/{id}")
	public Browser update(@PathVariable("id") String id, @RequestBody Browser browser) {
		return browserService.update(id, browser);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") String id) {
		browserService.delete(id);
	}
}
