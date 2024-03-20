package com.example.projectadventurexpbackend.config;

import com.example.projectadventurexpbackend.Model.Paintball;
import com.example.projectadventurexpbackend.Repository.PaintballRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    PaintballRepository paintballRepository;
    @Override
    public void run(String... args) throws Exception {
        Paintball s1 = new Paintball();
        s1.setName("Tobias taberssen");
        s1.setDate(LocalDate.of(2010, 11, 12));
        s1.setTimeStart(LocalTime.of(10,00,00));
        s1.setTimeEnd(LocalTime.of(12,00,00));
        s1.setParticipants(12);
        s1.setBalls(200);
        paintballRepository.save(s1);
    }
}


