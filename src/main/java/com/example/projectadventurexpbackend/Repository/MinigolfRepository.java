package com.example.projectadventurexpbackend.Repository;

import com.example.projectadventurexpbackend.Model.Minigolf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;


public interface MinigolfRepository extends JpaRepository<Minigolf, Integer> {
    void deleteByDateBefore(LocalDate cutoffDate);
}
