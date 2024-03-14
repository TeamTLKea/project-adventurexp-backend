package com.example.projectadventurexpbackend.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
public class GoKart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private Integer Participants;
    private LocalDate Date;
    private LocalTime TimeStart;
    private LocalTime TimeEnd;
    private Integer ChildKarts;
    private Integer AdultKarts;



}
