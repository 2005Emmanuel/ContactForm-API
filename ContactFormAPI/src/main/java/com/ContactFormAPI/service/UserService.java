package com.ContactFormAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ContactFormAPI.model.UserTb;
import com.ContactFormAPI.repository.UserInterface;

@Service
public class UserService {
    @Autowired
    UserInterface Userinterface;

    public ResponseEntity<UserTb> addUserDetails(UserTb Usertb){
        Userinterface.save(Usertb);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
    
}
