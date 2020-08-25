package com.example.application.business;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

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

    public List<User> createUsers(List<List<String>> excelData){
        List<User> users = new LinkedList<>();
        for (List<String> user: excelData){
            users.add(new User(user.get(0),
                    user.get(1),
                    user.get(2),
                    user.get(3),
                    user.get(4),
                    user.get(5),
                    user.get(6),
                    user.get(7),
                    user.get(8),
                    user.get(9),
                    user.get(10),
                    user.get(11)
                    ));
        }
        return users;
    }

    public User(String firstName, String lastName, String sex, String reportedRace, String ethnicity, String streetAddress, String email, String city, String state, String zip, String homeTelephone, String ceullarPhonePager) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.reportedRace = reportedRace;
        this.ethnicity = ethnicity;
        this.streetAddress = streetAddress;
        this.email = email;
        this.city = city;
        State = state;
        this.zip = zip;
        this.homeTelephone = homeTelephone;
        this.ceullarPhonePager = ceullarPhonePager;
    }

    public User(){}

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
