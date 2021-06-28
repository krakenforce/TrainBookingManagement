package com.krakenforce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakenforce.app.entity.CustomerType;

@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {

}
