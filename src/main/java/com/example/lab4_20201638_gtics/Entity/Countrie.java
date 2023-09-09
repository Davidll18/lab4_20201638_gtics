
package com.example.lab4_20201638_gtics.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "countries")
public class Countrie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", nullable = false)
    private Integer conutryid;

    @Column(name = "country_name")
    private String countryname;

    @Column(name = "region_id")
    private String region;

}
