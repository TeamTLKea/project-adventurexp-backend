package com.example.projectadventurexpbackend.deleteOldDates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import com.example.projectadventurexpbackend.Model.Minigolf;
import com.example.projectadventurexpbackend.Model.GoKart;
import com.example.projectadventurexpbackend.Model.Paintball;
import com.example.projectadventurexpbackend.Model.Climbing;

@RestController
@RequestMapping("/api")
public class DataCleanupController {

    @Autowired
    private DataCleanupService dataCleanupService;

    @DeleteMapping("/cleanupOldData")
    public void cleanupOldData() {
        List<Class<?>> entityClasses = Arrays.asList(Minigolf.class, GoKart.class, Climbing.class, Paintball.class);
        LocalDate cutoffDate = LocalDate.now(); // Set your cutoff date here
        dataCleanupService.deleteOldDataForEntities(entityClasses, cutoffDate);
    }
}