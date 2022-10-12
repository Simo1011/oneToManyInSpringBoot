package com.emonics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emonics.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	

}
