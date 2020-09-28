package com.cap.Omts.entity;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="bookings")
public class Booking {
	/*This class for creating table bookings with all required attributes
	 * created all getters and setters method
	 * created constructor using fields
	 * Generating toString()*/

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "seqgen")
	
	private int bookingId;
	private String city;
	private int theatreId;
	private int movieId;
	private int showId;
	private int numOfSeat;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime dateandtime;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public int getNumOfSeat() {
		return numOfSeat;
	}
	public void setNumOfSeat(int numOfSeat) {
		this.numOfSeat = numOfSeat;
	}
	public LocalDateTime getDateandtime() {
		return dateandtime;
	}
	public void setDateandtime(LocalDateTime dateandtime) {
		this.dateandtime = dateandtime;
	}
	public Booking(int bookingId, String city, int theatreId, int movieId, int showId, int numOfSeat,
			LocalDateTime dateandtime) {
		super();
		this.bookingId = bookingId;
		this.city = city;
		this.theatreId = theatreId;
		this.movieId = movieId;
		this.showId = showId;
		this.numOfSeat = numOfSeat;
		this.dateandtime = dateandtime;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", city=" + city + ", theatreId=" + theatreId + ", movieId="
				+ movieId + ", showId=" + showId + ", numOfSeat=" + numOfSeat + ", dateandtime=" + dateandtime + "]";
	}
	
	

	

}
