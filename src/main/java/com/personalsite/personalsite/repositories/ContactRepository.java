package com.personalsite.personalsite.repositories;

import com.personalsite.personalsite.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
