package com.cjss.deva.CarAPI.model;

import java.util.List;

public class DealerDetails {
    private String name;
    private String Address;
    private String PhoneNo;
    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public DealerDetails(String name, String address, String phoneNo, List<Car> cars) {
        this.name = name;
        Address = address;
        PhoneNo = phoneNo;
        this.cars = cars;
    }
}
