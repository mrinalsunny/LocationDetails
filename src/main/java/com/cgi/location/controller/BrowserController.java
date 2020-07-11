package com.cgi.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cgi.location.model.Browser;
import com.cgi.location.service.BrowserService;

@RestController
@RequestMapping("/api/v1/browser")
public class BrowserController {

	@Autowired
	BrowserService browserService;
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private static final String TOPIC = "hsbro";

	@GetMapping("/get/all")
	public List<Browser> getAll() {
		List<Browser> browsers = browserService.findAll();
		return browsers;
	}

	@GetMapping("/get/{id}")
	public Browser getById(@PathVariable("id") String id) {
		return browserService.findById(id);
	}

	@PostMapping("/add")
	@Transactional
	public Browser save(@RequestBody Browser browser) {
		Browser addedBrowser = browserService.save(browser);
		kafkaTemplate.send(TOPIC, addedBrowser.toString());
		return addedBrowser;
	}

	@PutMapping("update/{id}")
	@Transactional
	public Browser update(@PathVariable("id") String id, @RequestBody Browser browser) {
		Browser updatedBrowser = browserService.update(id, browser);
		kafkaTemplate.send(TOPIC, updatedBrowser.toString());
		return updatedBrowser;
	}

	@DeleteMapping("delete/{id}")
	@Transactional
	public void delete(@PathVariable("id") String id) {
		browserService.delete(id);
		kafkaTemplate.send(TOPIC, id);
	}
}
