package com.krakenforce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakenforce.app.entity.Carriage;

@Repository
public interface CarriageRepository extends JpaRepository<Carriage, Integer> {

}
