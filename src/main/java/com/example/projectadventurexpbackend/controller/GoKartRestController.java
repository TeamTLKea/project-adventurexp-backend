package com.example.projectadventurexpbackend.controller;

import com.example.projectadventurexpbackend.Model.GoKart;
import com.example.projectadventurexpbackend.Repository.GoKartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoKartRestController {

    @Autowired
    GoKartRepository goKartRepository;
    @GetMapping("/gokart")
    public List<GoKart> getAllGoKarts(){
        var obj = goKartRepository.findAll();
        return obj;
    }

    @PostMapping("/gokart")
    public GoKart createGoKart(@RequestBody GoKart gokart) {
        return goKartRepository.save(gokart);
    }

    @DeleteMapping("/gokart/{id}")
    public ResponseEntity<Void> deleteGoKart(@PathVariable Integer id) {
        if (!goKartRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        goKartRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}