package com.cgi.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.location.model.Browser;
import com.cgi.location.service.BrowserService;

@RestController
@RequestMapping("/api/browser")
public class BrowserController {

	@Autowired
	BrowserService browserService;

	@GetMapping("/get/all")
	public List<Browser> getAllBrowsers() {
		return browserService.getAll();
	}
	
	@PostMapping("/add")
	public Browser saveBrowser(@RequestBody Browser browser) {
		return browserService.save(browser);
	}
	
	@PostMapping("update/{id}")
	public Browser updateBrowser(@PathVariable("id") String id, @RequestBody Browser browser) {
		return browserService.update(id, browser);
	}
}
