package com.example.projectadventurexpbackend.Repository;


import com.example.projectadventurexpbackend.Model.Paintball;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;


public interface PaintballRepository extends JpaRepository<Paintball, Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Paintball m WHERE m.Date < :cutoffDate")
    void deleteByDateBefore(@Param("cutoffDate") LocalDate cutoffDate);
}
