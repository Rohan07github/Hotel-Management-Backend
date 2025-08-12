package com.rohan.dev.rohanhotel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohan.dev.rohanhotel.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

 Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
    
}
