package com.example.APIhomework.mycontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flipkart")
public class MyController {

	// it uses for get request
	@RequestMapping(value = "/fashion", method = RequestMethod.GET)
	public String fashion() {
		return " we are giving 50% discount on latest for men's";
	}
	
	// it uses for post request
	@RequestMapping(value = "/electrical", method = RequestMethod.POST)
	public String electric() {
		return "there are home Appliancess";
	}

	// it uses for post request
	@RequestMapping(value = "/mobile", method = RequestMethod.PUT)
	public String mobile() {
		return "there are home 30% discount ";
	}

	// it uses for get request
	@RequestMapping(value = "/replace", method = RequestMethod.DELETE)
	public String replace() {
		return "Order replace successfully.....";
	}
	
}
