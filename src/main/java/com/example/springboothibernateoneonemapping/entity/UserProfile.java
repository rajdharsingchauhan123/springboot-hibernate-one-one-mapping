package com.example.springboothibernateoneonemapping.entity;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "user_profile")

public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long id;
    @Column(name = "phone_number")
private String phoneNumber;
    @Column(name = "address")
private String address;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
 private Gender gender;
    @Column(name = "birth_of_date")
    private LocalDate birthOfDate;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "userProfile")
    private User user;

 public UserProfile(){

 }

    public UserProfile(Long id, String phoneNumber, String address, Gender gender, LocalDate birthOfDate) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.birthOfDate = birthOfDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(LocalDate birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
