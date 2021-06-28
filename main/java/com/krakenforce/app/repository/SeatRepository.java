package com.krakenforce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakenforce.app.entity.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {

}
