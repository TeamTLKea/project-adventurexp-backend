 package com.example.projectadventurexpbackend.deleteOldDates;
import com.example.projectadventurexpbackend.Repository.ClimbingRepository;
import com.example.projectadventurexpbackend.Repository.GoKartRepository;
import com.example.projectadventurexpbackend.Repository.MinigolfRepository;
import com.example.projectadventurexpbackend.Repository.PaintballRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;


@Service
public class DataCleanupService {

    @Autowired
    private MinigolfRepository minigolfRepository;

    @Autowired
    private GoKartRepository gokartRepository;

    @Autowired
    private ClimbingRepository climbingRepository;

    @Autowired
    private PaintballRepository paintballRepository;

    public void deleteOldDataForEntities(LocalDate cutoffDate) {
                minigolfRepository.deleteByDateBefore(cutoffDate);
                gokartRepository.deleteByDateBefore(cutoffDate);
                climbingRepository.deleteByDateBefore(cutoffDate);
                paintballRepository.deleteByDateBefore(cutoffDate);
            }
}
