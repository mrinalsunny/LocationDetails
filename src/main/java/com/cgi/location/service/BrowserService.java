package com.cgi.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.location.model.Browser;
import com.cgi.location.repo.BrowserRepository;

@Service
public class BrowserService {

	@Autowired
	BrowserRepository repository;
	
	public List<Browser> getAll() {
		return repository.findAll();
	}

	public Browser save(Browser browser) {
		return repository.save(browser);
	}

	public Browser update(String id, Browser browser) {
		Browser toUpdateBrowser = repository.findById(id).get();
		return null;
	}

}
