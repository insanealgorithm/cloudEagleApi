package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceLayer;

@RestController
public class HomeController {
	
	private final ServiceLayer serviceLayer;
	
	@Autowired
	public HomeController(ServiceLayer serviceLayer) {
		this.serviceLayer = serviceLayer;
	}
	
	@GetMapping("/")
	public String getData() {
		//return serviceLayer.consumeAPI();
		
		 String partnerId = "aa_surajkadam9892_gmail_com";
		 String partnerSecret = "e12d5245a1d52edc9b5a575d4d1c5a4ef1d97096";
	     return serviceLayer.fetchData(partnerId,partnerSecret);
	      //return serviceLayer.fetchData(partnerId);
	}

}
