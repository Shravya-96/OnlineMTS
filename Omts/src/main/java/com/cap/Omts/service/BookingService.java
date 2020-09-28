package com.cap.Omts.service;

import java.util.List;

import com.cap.Omts.entity.Booking;

public interface BookingService {
	//This is an Interface where all methods are declared
	public Booking addBooking (Booking booking);
	boolean deletebookingbyId(int bookingId);
	public List<Booking> getDetails();

}
