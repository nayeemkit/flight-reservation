package com.flightreservation.services;

import com.flightreservation.domains.Reservation;
import com.flightreservation.dto.ReservationRequest;


public interface ReservationService {
    public Reservation bookFlight(ReservationRequest reservationRequest);
}
