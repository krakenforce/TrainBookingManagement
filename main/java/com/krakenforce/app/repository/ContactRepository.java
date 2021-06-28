package com.krakenforce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakenforce.app.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
