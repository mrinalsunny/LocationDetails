package com.cgi.location;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cgi.location.model.Browser;
import com.cgi.location.model.Controller;
import com.cgi.location.model.User;
import com.cgi.location.repo.BrowserRepository;
import com.cgi.location.repo.ControllerRepository;
import com.cgi.location.repo.UserRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LocationsApplication implements CommandLineRunner {

	@Autowired
	BrowserRepository browserRepository;
	@Autowired
	ControllerRepository controllerRepository;
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(LocationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		browserRepository.deleteAll();
		controllerRepository.deleteAll();
		userRepository.deleteAll();

		// save a browsers
		browserRepository.save(new Browser(null,"DB847-sanity","158.234.207.101", "tomcat8", "banana12", "mrinal",new Date(),new Date()));
		// save a controller
		controllerRepository.save(new Controller(null,"PB848","158.234.207.102", "tomcat8", "banana12", "sunny",new Date(),new Date()));
		
		Map<String,String> qa = new HashMap<>();
		qa.put("what is your pet name?","sandy");

		//save a user
		userRepository.save(new User(null,"Mrinal","Guchait","mrinal.guchait","mrinal.guchait@gmail.com","banana12",qa,new Date(),new Date()));
		
		// fetch all browsers
		System.out.println();
		System.out.println("Customers found with findAll() by lambda:");
		browserRepository.findAll().forEach(System.out::println);
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Browser browser : browserRepository.findAll()) {
			System.out.println(browser);
		}
		System.out.println();

		// fetch an individual browsers

		System.out.println("Customer found with findByOwner('mrinal'):");
		System.out.println("--------------------------------");
		System.out.println(browserRepository.findByOwner("mrinal"));

		System.out.println("Customers found with findByUsername('tomcat8'):");
		System.out.println("--------------------------------");
		for (Browser browser : browserRepository.findByUsername("tomcat8")) {
			System.out.println(browser);
		}

	}

}
