package com.apps.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class FirstAppController {

    @GetMapping("/")
    public ResponseEntity<String> msg() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy  hh:mm:ss:SSS a"));
        return new ResponseEntity<String>("hello world - " + timestamp, headers, HttpStatus.OK);
    }

}
