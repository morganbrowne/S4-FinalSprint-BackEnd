package com.keyin.Airline;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String country;



}
