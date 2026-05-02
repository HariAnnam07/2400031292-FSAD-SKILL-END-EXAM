package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Booking {

    @Id
    private Integer bookingId;

    private String name;
    private LocalDate date;
    private String status;

    public Booking() {}

    public Booking(Integer bookingId, String name, LocalDate date, String status) {
        this.bookingId = bookingId;
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public Integer getBookingId() { return bookingId; }
    public void setBookingId(Integer bookingId) { this.bookingId = bookingId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
