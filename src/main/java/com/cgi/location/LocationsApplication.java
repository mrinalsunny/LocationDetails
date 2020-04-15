package com.cgi.location;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cgi.location.model.Browser;
import com.cgi.location.repo.BrowserRepository;

@SpringBootApplication
public class LocationsApplication implements CommandLineRunner {

	@Autowired
	BrowserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(LocationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of browsers
		repository.save(new Browser("158.234.207.101", "tomcat8", "banana12", "mrinal",new Date()));
		repository.save(new Browser("158.234.207.102", "tomcat8", "banana12", "sunny",new Date()));

		// fetch all browsers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Browser browser : repository.findAll()) {
			System.out.println(browser);
		}
		System.out.println();

		// fetch an individual browsers
		System.out.println("Customer found with findByOwner('mrinal'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByOwner("mrinal"));

		System.out.println("Customers found with findByUsername('tomcat8'):");
		System.out.println("--------------------------------");
		for (Browser browser : repository.findByUsername("tomcat8")) {
			System.out.println(browser);
		}

	}

}
