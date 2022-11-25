package com.amenitiesreservation.experiencems.service;

import com.amenitiesreservation.experiencems.enums.*;
import com.amenitiesreservation.experiencems.response.AmenitiesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;


@FeignClient(name = "amenity-reservation", url = "${config.rest.service.addAmenityReservationUrl}")
public interface AmenitiesInterface {

    @GetMapping("/analysis")
    public String analyseAmenityReservation(@RequestHeader String userUuid, @RequestParam AmenitiesEnum userAmenity, @RequestParam Date userDate, @RequestParam TimeEnum userTime);

    @PostMapping("/create")
    public String createAmenityReservation(@RequestHeader CountryCodeEnum userCountry, @RequestHeader String userUuid, @RequestParam String userName, @RequestParam AmenitiesEnum userAmenity, @RequestParam Date userDate, @RequestParam TimeEnum userTime, @RequestParam GenderEnum userGender, @RequestParam Integer userAge);

    @GetMapping("/retrieve")
    public AmenitiesResponse getAmenityReservation(@RequestHeader String userUuid, @RequestParam Long retrieveId);

    @PutMapping("/update")
    public String updateAmenityReservation(@RequestHeader CountryCodeEnum userCountry, @RequestHeader String userUuid, @RequestParam Long userId , @RequestParam String userName, @RequestParam AmenitiesEnum userAmenity, @RequestParam Date userDate, @RequestParam TimeEnum userTime, @RequestParam GenderEnum userGender, @RequestParam Integer userAge);

//    @DeleteMapping("/delete")
//    public String deleteAmenityReservation(@RequestParam Long userId);


}
