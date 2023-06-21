package com.ContactFormAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service
public class EmailService {
    private final  JavaMailSender Mail;

    @Autowired
    public EmailService(JavaMailSender Mail){
        this.Mail = Mail;

    }

    public void sendEmail(String to, String subject, String Body){
        SimpleMailMessage message = new SimpleMailMessage();
        try{
        message.setFrom("Emmanuel@mailtrap.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(Body);
        Mail.send(message);
        }catch(MailException e){
            System.out.println("failed to send email " + e.getMessage());

        }
    }

    


    
}
