package com.ContactFormAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserTb {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @JsonIgnore
    Long uid;
    String name;
    String email;
    String message;

    
}
