package com.rohan.dev.rohanhotel.service.interfac;

import com.rohan.dev.rohanhotel.dto.Response;
import com.rohan.dev.rohanhotel.model.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
