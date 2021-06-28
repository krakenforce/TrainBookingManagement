package com.krakenforce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakenforce.app.entity.Station;


@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {

}
