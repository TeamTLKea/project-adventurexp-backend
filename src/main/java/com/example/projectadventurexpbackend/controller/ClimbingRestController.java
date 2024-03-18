package com.example.projectadventurexpbackend.controller;


import com.example.projectadventurexpbackend.Model.Climbing;
import com.example.projectadventurexpbackend.Repository.ClimbingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClimbingRestController {

    @Autowired
    ClimbingRepository climbingRepository;

    @GetMapping("/climbing")
    public List<Climbing> getAllClimbings(){
        return climbingRepository.findAll();
    }

    @PostMapping("/climbing")
    public Climbing createClimbing(@RequestBody Climbing climbing) {
        return climbingRepository.save(climbing);
    }

    @DeleteMapping("/climbing/{id}")
    public ResponseEntity<Void> deleteClimbing(@PathVariable Integer id) {
        if (!climbingRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        climbingRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
