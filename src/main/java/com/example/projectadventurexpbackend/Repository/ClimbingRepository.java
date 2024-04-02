package com.example.projectadventurexpbackend.Repository;

import com.example.projectadventurexpbackend.Model.Climbing;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClimbingRepository extends JpaRepository<Climbing, Integer> {
 //   void deleteByDateBefore(LocalDate cutoffDate);
}
