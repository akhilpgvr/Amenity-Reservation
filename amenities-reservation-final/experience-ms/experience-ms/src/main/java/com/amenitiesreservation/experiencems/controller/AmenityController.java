package com.amenitiesreservation.experiencems.controller;


import com.amenitiesreservation.experiencems.enums.AmenitiesEnum;
import com.amenitiesreservation.experiencems.enums.CountryCodeEnum;
import com.amenitiesreservation.experiencems.enums.GenderEnum;
import com.amenitiesreservation.experiencems.enums.TimeEnum;
import com.amenitiesreservation.experiencems.service.AmenitiesService;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping("/reservation")
public class AmenityController {

    @Autowired
    AmenitiesService amenitiesService;

    @GetMapping("/analysis")
    public ResponseEntity<?> checkReservation(@RequestHeader String userUuid, @RequestParam AmenitiesEnum userAmenity, @RequestParam Date userDate, @RequestParam TimeEnum userTime) {
        return new ResponseEntity(amenitiesService.analyseReservation(userUuid, userAmenity, userDate, userTime), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<?> setData(@RequestHeader CountryCodeEnum userCountry, @RequestHeader String userUuid, @RequestParam String userName, @RequestParam AmenitiesEnum userAmenity, @RequestParam Date userDate, @RequestParam TimeEnum userTime, @RequestParam GenderEnum userGender, @RequestParam Integer userAge) {
        try {
            return new ResponseEntity(amenitiesService.setReservation(userCountry, userUuid, userName, userAmenity, userDate, userTime, userGender, userAge), HttpStatus.OK);
        } catch (FeignException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/retrieve")
    public ResponseEntity<?> getData(@RequestHeader String userUuid, @RequestParam Long retrieveId) {
        return new ResponseEntity(amenitiesService.getReservation(userUuid, retrieveId), HttpStatus.OK);
    }


    @PutMapping("/update")
    public ResponseEntity<?> updateData(@RequestHeader CountryCodeEnum userCountry, @RequestHeader String userUuid, @RequestParam Long userId, @RequestParam String userName, @RequestParam AmenitiesEnum userAmenity, @RequestParam Date userDate, @RequestParam TimeEnum userTime, @RequestParam GenderEnum userGender, @RequestParam Integer userAge) {
        try {
            return new ResponseEntity(amenitiesService.updateReservation(userCountry, userUuid, userId, userName, userAmenity, userDate, userTime, userGender, userAge), HttpStatus.OK);
        }catch(FeignException e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
    }

}

//    @DeleteMapping("/delete")
//    public ResponseEntity<?> deleteData(@RequestParam Long userId){
//        return new ResponseEntity(amenitiesService.deleteAmenityReservation(userId),HttpStatus.OK);
//    }

}
