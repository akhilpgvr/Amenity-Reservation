package com.amenitiesreservation.experiencems.service;

import com.amenitiesreservation.experiencems.enums.AmenitiesEnum;
import com.amenitiesreservation.experiencems.enums.CountryCodeEnum;
import com.amenitiesreservation.experiencems.enums.GenderEnum;
import com.amenitiesreservation.experiencems.enums.TimeEnum;
import com.amenitiesreservation.experiencems.response.AmenitiesResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
@Slf4j
@Service
public class AmenitiesService {

    @Autowired
    AmenitiesInterface amenitiesInterface;

    public String analyseReservation(String userUuid, AmenitiesEnum userAmenity, Date userDate, TimeEnum userTime) {
        log.info("Reservation analysis request passed for {}",userUuid);
        return amenitiesInterface.analyseAmenityReservation(userUuid, userAmenity, userDate, userTime);
    }

    public String setReservation(CountryCodeEnum userCountry, String userUuid, String userName, AmenitiesEnum userAmenity, Date userDate, TimeEnum userTime, GenderEnum userGender, Integer userAge) {
        log.info("Reservation creation request send for {}",userUuid);
        return amenitiesInterface.createAmenityReservation(userCountry, userUuid, userName, userAmenity, userDate, userTime, userGender, userAge);

    }

    public AmenitiesResponse getReservation(String userUuid, Long retrieveId) {
        log.info("Reservation retrieval request passed for {} ",userUuid);
        return amenitiesInterface.getAmenityReservation(userUuid, retrieveId);
    }

    public String updateReservation(CountryCodeEnum userCountry,String userUuid, Long userId, String userName, AmenitiesEnum userAmenity, Date userDate, TimeEnum userTime, GenderEnum userGender, Integer userAge) {
        log.info("Reservation update request has passed for {} ",userUuid);
        return amenitiesInterface.updateAmenityReservation(userCountry, userUuid, userId, userName, userAmenity, userDate, userTime, userGender, userAge);
    }

//    public String deleteAmenityReservation(Long userId) {
//        return amenitiesInterface.deleteAmenityReservation(userId);
//    }



}
