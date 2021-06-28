package com.krakenforce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakenforce.app.entity.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {

}
