package com.example.projectadventurexpbackend.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Paintball {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String Name;
    private Integer Participants;
    @Column(name = "Date")
    private LocalDate Date;
    private LocalTime TimeStart;
    private LocalTime TimeEnd;
    private Integer balls;

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

    public Integer getBalls() {
        return balls;
    }

    public void setBalls(Integer balls) {
        this.balls = balls;
    }
}
