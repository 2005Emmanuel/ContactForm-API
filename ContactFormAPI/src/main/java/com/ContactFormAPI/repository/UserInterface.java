package com.ContactFormAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ContactFormAPI.model.UserTb;

public interface UserInterface extends JpaRepository<UserTb,Long> {
    
}
