package com.example.pds.model.address;

import com.example.pds.model.packages.Package;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String country;
    @Column
    private String city;
    @Column
    private String postCode;
    @Column
    private String region;
    @Column
    private String floor;
    @Column
    private String apartmentNumber;

}
