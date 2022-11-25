package com.amenitiesreservation.experiencems.request;

import com.amenitiesreservation.experiencems.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AmenitiesRequest {

    private String userName;
    private AmenitiesEnum userAmenity;
    private Date userDate;
    private TimeEnum userTime;
    private GenderEnum userGender;
    private Integer userAge;

}
