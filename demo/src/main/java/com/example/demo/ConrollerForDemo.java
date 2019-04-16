package com.example.demo;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConrollerForDemo {

	
	
	
	@Autowired
    SystemRepository systemRepository;
	
	
	 @RequestMapping(value ="/home")
	 @ResponseBody
	 
	   public Optional<User_details> printHello() {
		 
		Optional<User_details> details= systemRepository.findById(60);
	       return details;
	   }
	
}
