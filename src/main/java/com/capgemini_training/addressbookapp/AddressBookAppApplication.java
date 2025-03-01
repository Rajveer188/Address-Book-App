package com.capgemini_training.addressbookapp;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class AddressBookAppApplication {
    private static final Logger logger = LoggerFactory.getLogger(AddressBookAppApplication.class);
	public static void main(String[] args) {
		//create a logger
		logger.info("application starting.................");
		SpringApplication.run(AddressBookAppApplication.class, args);
	}
}
