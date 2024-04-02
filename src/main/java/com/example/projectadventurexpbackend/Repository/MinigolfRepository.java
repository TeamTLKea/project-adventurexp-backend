package com.example.projectadventurexpbackend.Repository;

import com.example.projectadventurexpbackend.Model.Minigolf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MinigolfRepository extends JpaRepository<Minigolf, Integer> {
    void deleteOldDatesBefore(LocalDate cutoffDate);
}
