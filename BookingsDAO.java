package com.springbootproject.SpringREST.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootproject.SpringREST.entities.Booking;

public interface BookingsDAO extends JpaRepository<Booking, Long> {

}
