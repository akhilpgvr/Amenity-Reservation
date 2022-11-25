package com.amenitiesreservation.experiencems.enums;

public enum GenderEnum {
    MALE("Male"),
    FEMALE("Female");

    private String userGender;

    GenderEnum(final String gender) {
        userGender= gender;
    }

    public String getUserGender() {
        return userGender;
    }

}
