package com.cap.Omts.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cap.Omts.entity.Booking;

//This Spring DataJpaRepository is used to inject all the Jpa and EntityManager objects
@CrossOrigin("http://localhost:4200")
public interface BookingDao extends JpaRepository<Booking, Integer> {
	
}
