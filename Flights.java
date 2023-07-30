package com.springbootproject.SpringREST.services;

import java.util.List;

import com.springbootproject.SpringREST.entities.Booking;

public interface Flights {

	public List<Booking> getbookings();

	public Booking getFlight(long flightId);
	
	public Booking postFlight(Booking b);
	
	public Booking updateFlight(Booking b);

	public void deleteFlight(long parselong);

}
