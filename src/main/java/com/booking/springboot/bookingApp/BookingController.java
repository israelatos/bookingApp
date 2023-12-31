package com.booking.springboot.bookingApp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;


@RestController
public class BookingController {
    // http://localhost:8080/booking
    //
    // Booking Information: booking ID, name, and destination.
//    map url for /bookings
    @RequestMapping("/bookings")
    public List<Booking> retrieveAllBookings() {
        return Arrays.asList(
                new Booking(1, "Basic", "Accra Mall"),
                new Booking(2, "Luxury", "Spintex"),
                new Booking(3, "Economy", "Ashanti")
        );
    }
}
