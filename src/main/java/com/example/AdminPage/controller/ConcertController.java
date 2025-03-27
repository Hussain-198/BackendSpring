package com.example.AdminPage.controller;

import com.example.AdminPage.model.Concert;
import com.example.AdminPage.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/concerts")
@CrossOrigin("*")
public class ConcertController {

    @Autowired
    private ConcertService concertService;

    @GetMapping  //fetches all concerts
    public List<Concert> getAllConcerts() {
        return concertService.getAllConcerts();
    }

    @PostMapping  //used to add concerts
    public Concert addConcert(@RequestBody Concert concert) {
        return concertService.saveConcert(concert);
    }

    @DeleteMapping("/{id}")  //used to delete concerts
    public void deleteConcert(@PathVariable Long id) {
        concertService.deleteConcert(id);
    }
}
