package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@AutoConfigurationPackage
@EnableJpaRepositories("com.example.demo")
@EntityScan("com.example.demo")
public class DemoApplication implements CommandLineRunner{
	

    @Autowired
    DataSource dataSource;
 
    @Autowired
    SystemRepository systemRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
	 @Override
	    public void run(String... args) throws Exception {
	        System.out.println("Our DataSource is = " + dataSource);
	        Iterable<com.example.demo.User_details> systemlist = systemRepository.findAll();
	        
	      
}
}

