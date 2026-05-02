package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.Booking;
import com.klef.fsad.exam.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking addBooking(Booking booking) {
        if (booking.getBookingId() == null) {
            throw new RuntimeException("Booking ID must not be null");
        }
        return bookingRepository.save(booking);
    }

    public String deleteBooking(Integer id) {
        if (bookingRepository.existsById(id)) {
            bookingRepository.deleteById(id);
            return "Booking deleted successfully";
        } else {
            return "Booking not found";
        }
    }
}
