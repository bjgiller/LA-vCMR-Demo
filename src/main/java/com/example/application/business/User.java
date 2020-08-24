package com.example.application.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String sex;
    private String reportedRace;
    private String ethnicity;
    private String streetAddress;
    private String email;
    private String city;
    private String State;
    private String zip;
    private String homeTelephone;
    private String ceullarPhonePager;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getReportedRace() {
        return reportedRace;
    }

    public void setReportedRace(String reportedRace) {
        this.reportedRace = reportedRace;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getHomeTelephone() {
        return homeTelephone;
    }

    public void setHomeTelephone(String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }

    public String getCeullarPhonePager() {
        return ceullarPhonePager;
    }

    public void setCeullarPhonePager(String ceullarPhonePager) {
        this.ceullarPhonePager = ceullarPhonePager;
    }
}
