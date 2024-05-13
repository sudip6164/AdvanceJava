package com.advancejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.advancejava.model.ContactForm;

@Repository
public interface ContactFormRepository extends JpaRepository<ContactForm, Integer> {

}
