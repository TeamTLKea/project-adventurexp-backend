package com.example.projectadventurexpbackend.Repository;


import com.example.projectadventurexpbackend.Model.Paintball;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaintballRepository extends JpaRepository<Paintball, Integer> {
}
