package com.amenitiesreservation.experiencems.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AmenitiesResponse {

    private Long userId;
    private String userName;
    private String userAmenity;
    private Date entryDate;
    private String entryTime;
    private String userGender;
    private Integer userAge;

}