package com.mvc.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.reservation.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
