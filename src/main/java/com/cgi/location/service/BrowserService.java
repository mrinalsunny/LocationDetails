package com.cgi.location.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.location.model.Browser;
import com.cgi.location.repo.BrowserRepository;

@Service
public class BrowserService {

	@Autowired
	BrowserRepository browserRepository;

	public List<Browser> findAll() {
		return browserRepository.findAll();
	}

	public Browser findById(String id) {
		return browserRepository.findById(id).get();
	}

	public Browser save(Browser browser) {
		browser.setModifiedDate(new Date());
		return browserRepository.save(browser);
	}

	public Browser update(String id, Browser browser) {
		Browser toUpdateBrowser = browserRepository.findById(id).get();
		System.out.println(toUpdateBrowser);
		toUpdateBrowser.setApp(browser.getApp());
		toUpdateBrowser.setHost(browser.getHost());
		toUpdateBrowser.setUsername(browser.getUsername());
		toUpdateBrowser.setPassword(browser.getPassword());
		toUpdateBrowser.setOwner(browser.getOwner());
		toUpdateBrowser.setModifiedDate(new Date());
		return browserRepository.save(toUpdateBrowser);
	}

	public void delete(String id) {
		browserRepository.deleteById(id);
	}
}
