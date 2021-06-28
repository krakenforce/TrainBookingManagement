package com.krakenforce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakenforce.app.entity.TrainSchedule;

@Repository
public interface TrainScheduleRepository extends JpaRepository<TrainSchedule, Integer> {
	
}
