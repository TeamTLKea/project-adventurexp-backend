package com.example.projectadventurexpbackend.controller;

import com.example.projectadventurexpbackend.Model.Minigolf;
import com.example.projectadventurexpbackend.Repository.MinigolfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MinigolfRestController {

    @Autowired
    MinigolfRepository minigolfRepository;
    @GetMapping("/minigolf")
    public List<Minigolf> getAllMinigolf(){
        var obj = minigolfRepository.findAll();
        return obj;
    }

    @PostMapping("/minigolf")
    public Minigolf createMinigolf(@RequestBody Minigolf minigolf) {
        return minigolfRepository.save(minigolf);
    }

    @DeleteMapping("/minigolf/{id}")
    public ResponseEntity<Void> deleteMinigolf(@PathVariable Integer id) {
        if (!minigolfRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        minigolfRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
