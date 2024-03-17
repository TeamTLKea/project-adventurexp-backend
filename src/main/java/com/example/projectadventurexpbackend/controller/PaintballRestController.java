package com.example.projectadventurexpbackend.controller;

import com.example.projectadventurexpbackend.Model.Paintball;
import com.example.projectadventurexpbackend.Repository.PaintballRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaintballRestController {

    @Autowired
    PaintballRepository paintballRepository;
    @GetMapping("/paintball")
    public List<Paintball> getAllPaintballs(){
        var obj = paintballRepository.findAll();

        return obj;
    }

    @PostMapping("/paintball")
    public Paintball createPaintball(@RequestBody Paintball paintball) {
        return paintballRepository.save(paintball);
    }

    @DeleteMapping("/paintball/{id}")
    public ResponseEntity<Void> deletePaintball(@PathVariable Integer id) {
        if (!paintballRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        paintballRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
