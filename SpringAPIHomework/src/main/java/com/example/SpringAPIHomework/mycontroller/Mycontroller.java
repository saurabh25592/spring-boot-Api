package com.example.SpringAPIHomework.mycontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carwale")
public class Mycontroller {

	@GetMapping("/newcar")
	public String newCar() {
		return "buy new maahendra thar,skoda kylaq,tata nexon,mahendra scarpio..... ";
	}
	
	@PostMapping("/oldcar")
	public String oldCar() {
		return "buy old cars under 5 lakh to 15lakh range..... ";
	}

	@PutMapping("/newCarLoan")
    public  String loan() {
		  return "u can get car loan ";
	} 
	
	@DeleteMapping("/replace")
	private String  Delete() {
		return "you can exchange your car....";
	}
}
