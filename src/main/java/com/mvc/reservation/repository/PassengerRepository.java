package com.mvc.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.reservation.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
