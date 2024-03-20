package com.example.projectadventurexpbackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Minigolf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private Integer Participants;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate Date;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime TimeStart;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime TimeEnd;

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
}
