 package com.example.projectadventurexpbackend.deleteOldDates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
public class DataCleanupController {

    @Autowired
    private DataCleanupService dataCleanupService;

    @DeleteMapping("/cleanupOldData")
    public void cleanupOldData() {
        LocalDate cutoffDate = LocalDate.now(); // Set your cutoff date here
        dataCleanupService.deleteOldDataForEntities(cutoffDate);
    }
}
