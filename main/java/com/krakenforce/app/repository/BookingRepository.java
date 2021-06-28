package com.krakenforce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakenforce.app.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
