package com.practice.cabbookingkafkadriver.controller;

import com.practice.cabbookingkafkadriver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {
        int range = 100;
        while (range > 0) {
            var location = Math.random() + " , " + Math.random();
            cabLocationService.updateLocation(location);
            Thread.sleep(1000);

            range--;
        }

        return new ResponseEntity<>(Map.of("message", "Location Updated"), HttpStatus.OK);
    }

}
