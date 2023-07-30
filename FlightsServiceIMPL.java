package com.springbootproject.SpringREST.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootproject.SpringREST.dao.BookingsDAO;
import com.springbootproject.SpringREST.entities.Booking;


@Service
public class FlightsServiceIMPL implements Flights {

	@Autowired
	private final BookingsDAO bd;
	//List<Booking> list;
	
	public FlightsServiceIMPL(BookingsDAO bookingsdao) {
    bd=bookingsdao;
	}


	@Override
	public List<Booking> getbookings() {
    return bd.findAll();
	}

	@Override
	public Booking getFlight(long flightId) {
     return bd.getReferenceById(flightId);	
	}

	@Override
	public Booking postFlight(Booking b) {
      bd.save(b);
      return b;
	}

	@Override
	public Booking updateFlight(Booking b) {   
		bd.save(b);
		return b;
	    }

	@Override
	public void deleteFlight(long parseLong) {
		bd.deleteById(parseLong);
	}

}
