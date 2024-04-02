package com.example.projectadventurexpbackend.Repository;

import com.example.projectadventurexpbackend.Model.Climbing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;


public interface ClimbingRepository extends JpaRepository<Climbing, Integer> {
}
