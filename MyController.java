package com.springbootproject.SpringREST.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootproject.SpringREST.entities.Booking;
import com.springbootproject.SpringREST.services.Flights;

@RestController
public class MyController {

	@Autowired
	private final Flights f;
	
	MyController(Flights f){
		this.f=f;
	}
	
	//Testing get request
	@GetMapping("/home")
	public String home()
	{
		return "Welcome";
	}
	
	//get flights data
	@GetMapping("/flights")
	public List<Booking> getbookings()
	{
		return this.f.getbookings();
	}
	
	@GetMapping("/flights/{flightId}")
	public Booking getFlight(@PathVariable String flightId)
	{
		return this.f.getFlight(Long.parseLong(flightId));
	}
	
	@PostMapping("/flights")
	public Booking postFlight(@RequestBody Booking b)
	{
		
		return this.f.postFlight(b);
	}
	
	@PutMapping("/flights")
	public Booking updateFlight(@RequestBody Booking b)
	{
		return this.f.updateFlight(b);
	}
	
	@DeleteMapping("/flights/{flightId}")
	public void deleteFlight(@PathVariable String flightId)
	{
		this.f.deleteFlight(Long.parseLong(flightId));
	}
}
