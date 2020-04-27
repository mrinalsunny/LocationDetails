package com.cgi.location.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.cgi.location.model.Browser;
import com.cgi.location.repo.BrowserRepository;

@Service
public class BrowserService {

	@Autowired
	BrowserRepository repository;
	@Autowired
	MongoTemplate mongoTemplate;

	public List<Browser> findAll() {
		return repository.findAll();
	}

	public Browser findById(String id) {
		return repository.findById(id).get();
	}

	public Browser save(Browser browser) {
		browser.setModifiedDate(new Date());
		return repository.save(browser);
	}

	public Browser update(String id, Browser browser) {
		Browser toUpdateBrowser = repository.findById(id).get();
		System.out.println(toUpdateBrowser);
		toUpdateBrowser.setHost(browser.getHost());
		toUpdateBrowser.setUsername(browser.getUsername());
		toUpdateBrowser.setPassword(browser.getPassword());
		toUpdateBrowser.setOwner(browser.getOwner());
		toUpdateBrowser.setModifiedDate(new Date());
		return repository.save(toUpdateBrowser);
	}
}
