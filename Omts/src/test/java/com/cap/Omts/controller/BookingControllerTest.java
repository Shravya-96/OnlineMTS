package com.cap.Omts.controller;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import com.cap.Omts.OmtsApplication;
import com.cap.Omts.entity.Booking;
import com.cap.Omts.service.BookingService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes =OmtsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ContextConfiguration(locations= {"classpath*:/spring/test-content.xml"})

public class BookingControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    BookingService bookingservice;

    @LocalServerPort
    private int port;

    private String getRootUrl() {
        return "http://localhost:" + port;
    }
    @Test
    public void contextLoads() {

    }
    
    @Test
    public void testGetDetails()
    {
    	
    	List<Booking> booking=bookingservice.getDetails();
    	
    	assertNotNull(booking);
    	
    }
    
    
    @Test
    public void testdeleteBookingById()
    {
    	int bookingId=1;
    	boolean booking=bookingservice.deletebookingbyId(bookingId);
    	assertNotNull(booking);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}