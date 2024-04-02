package com.example.projectadventurexpbackend.Repository;

import com.example.projectadventurexpbackend.Model.GoKart;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;


public interface GoKartRepository extends JpaRepository<GoKart, Integer> {
    void deleteByDateBefore(LocalDate cutoffDate);
}
