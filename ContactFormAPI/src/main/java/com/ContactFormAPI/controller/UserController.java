package com.ContactFormAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ContactFormAPI.model.UserTb;
import com.ContactFormAPI.service.EmailService;
import com.ContactFormAPI.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("contents")
public class UserController {
private final  EmailService emailService;

@Autowired
UserService Service;


@Autowired
public UserController(EmailService emailService){
    this.emailService = emailService;

}


@Operation(summary="Client fill")
@ApiResponses(value={
    @ApiResponse(responseCode = "201", description="client Data sent succesfully",
    content = @Content)

})
    @PostMapping("/save-content")
    public ResponseEntity<UserTb> addDetails(@RequestBody UserTb userTb){
        emailService.sendEmail( "hilaryemmanuel841@gmail.com", "Email", "A User has enquired");
        return Service.addUserDetails(userTb);

    }
 


    
}
