package com.ruben.springcloudmysql.repository;

import com.ruben.springcloudmysql.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository
        extends JpaRepository<Contact, Long> { }
