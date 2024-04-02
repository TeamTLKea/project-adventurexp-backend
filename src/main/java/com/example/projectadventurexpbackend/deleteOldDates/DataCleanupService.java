// package com.example.projectadventurexpbackend.deleteOldDates;
//import com.example.projectadventurexpbackend.Repository.ClimbingRepository;
//import com.example.projectadventurexpbackend.Repository.GoKartRepository;
//import com.example.projectadventurexpbackend.Repository.MinigolfRepository;
//import com.example.projectadventurexpbackend.Repository.PaintballRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.time.LocalDate;
//import java.util.List;
//import com.example.projectadventurexpbackend.Model.Minigolf;
//import com.example.projectadventurexpbackend.Model.GoKart;
//import com.example.projectadventurexpbackend.Model.Paintball;
//import com.example.projectadventurexpbackend.Model.Climbing;
//
//
//@Service
//public class DataCleanupService {
//
//    @Autowired
//    private MinigolfRepository minigolfRepository;
//
//    @Autowired
//    private GoKartRepository gokartRepository;
//
//    @Autowired
//    private ClimbingRepository climbingRepository;
//
//    @Autowired
//    private PaintballRepository paintballRepository;
//
//    public void deleteOldDataForEntities(List<Class<?>> entityClasses, LocalDate cutoffDate) {
//        for (Class<?> entityClass : entityClasses) {
//            if (Minigolf.class.isAssignableFrom(entityClass)) {
//                minigolfRepository.deleteByDateBefore(cutoffDate);
//            } else if (GoKart.class.isAssignableFrom(entityClass)) {
//                gokartRepository.deleteByDateBefore(cutoffDate);
//            } else if (Climbing.class.isAssignableFrom(entityClass)) {
//                climbingRepository.deleteByDateBefore(cutoffDate);
//            } else if (Paintball.class.isAssignableFrom(entityClass)) {
//                paintballRepository.deleteByDateBefore(cutoffDate);
//            }
//        }
//    }
//}