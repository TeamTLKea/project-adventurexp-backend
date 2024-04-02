package com.example.projectadventurexpbackend.Model;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
public class GoKart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private Integer Participants;
    @Column(name = "Date")
    private LocalDate Date;
    private LocalTime TimeStart;
    private LocalTime TimeEnd;
    private Integer ChildKarts;
    private Integer AdultKarts;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getParticipants() {
        return Participants;
    }

    public void setParticipants(Integer participants) {
        Participants = participants;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public LocalTime getTimeStart() {
        return TimeStart;
    }

    public void setTimeStart(LocalTime timeStart) {
        TimeStart = timeStart;
    }

    public LocalTime getTimeEnd() {
        return TimeEnd;
    }

    public void setTimeEnd(LocalTime timeEnd) {
        TimeEnd = timeEnd;
    }

    public Integer getChildKarts() {
        return ChildKarts;
    }

    public void setChildKarts(Integer childKarts) {
        ChildKarts = childKarts;
    }

    public Integer getAdultKarts() {
        return AdultKarts;
    }

    public void setAdultKarts(Integer adultKarts) {
        AdultKarts = adultKarts;
    }
}
