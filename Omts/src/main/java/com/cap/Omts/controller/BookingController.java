package com.cap.Omts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.Omts.entity.Booking;
import com.cap.Omts.service.BookingService;

import com.cap.Omts.Exceptions.IdNotFoundException;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {
//This class BookingController is responsible for front end mapping
	@Autowired
	private BookingService bookingService;

	
	@PostMapping(value = "/booking/doBooking", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Booking addBooking(@RequestBody Booking booking) 
	{
		// This method is used for adding booking  
		return bookingService.addBooking(booking);
	}

	@DeleteMapping("/delete/bookingId/{bookingId}")
	public ResponseEntity<String> deletebookingById(@PathVariable("bookingId") int bookingId)
	{
		//This method is used for deleting booking
		System.out.println(bookingId);
		if (bookingService.deletebookingbyId(bookingId))
			return new ResponseEntity<String>("Cancelled tickets successfully", new HttpHeaders(), HttpStatus.OK);
		else
			throw new IdNotFoundException("Booking id does not exist");

	}

	@GetMapping("/getDetails")
	public ResponseEntity<List<Booking>> getDetails()
	{
		//This  method is used for getting booking details

		List<Booking> getBookedDetails = bookingService.getDetails();
		return new ResponseEntity<>(getBookedDetails, HttpStatus.OK);
	}

}
