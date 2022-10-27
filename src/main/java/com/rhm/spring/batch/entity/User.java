package com.rhm.spring.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "USER_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "CITY_NAME")
    private String cityName;
    @Column(name = "CITY_CODE")
    private String cityCode;
    @Column(name = "ZIP_CODE")
    private String zipCode;
    @Column(name = "PHONE_NUMBER")
    private String PhoneNumber;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "COORDINATION")
    private String coordination;

    //Robert,Branch,Haines city,FL,33844,4074686162,rbranch@pacbell.net,65.215.76.5


}
