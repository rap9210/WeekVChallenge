package com.example.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    @NotNull
    @Size(min=1,max=20)
    private String name;

    @NotNull
    @Size(min=1,max=20)
    private String phone;

    @NotNull
    @Size(min=1,max=40)
    private String address1;

    @Size(max=40)
    private String address2;

//    @NotNull
//    @Size(min=1,max=20)
//    private String petType;



    @NotNull
    @Size(min=1,max=20)
    private String petName;

    @NotNull
    private String petBreed;

    @NotNull
    @Size(min=1,max=20)
    private String petGender;

    @NotNull
    @Min(0)
    private String petAge;


    public String getPhone() {
        return phone;
    }

    public String getPetAge() {
        return petAge;
    }

    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address1;
    }

    public void setAddress(String address) {
        this.address1 = address;
    }

//    public String getPetType() {
//        return petType;
//    }
//
//    public void setPetType(String petType) {
//        this.petType = petType;
//    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }
}
