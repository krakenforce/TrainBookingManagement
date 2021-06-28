package com.krakenforce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakenforce.app.entity.SeatClass;

@Repository
public interface SeatClassRepository extends JpaRepository<SeatClass, Integer> {

}
