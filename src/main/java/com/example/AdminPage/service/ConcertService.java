package com.example.AdminPage.service;

import com.example.AdminPage.model.Concert;
import com.example.AdminPage.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertService {

    @Autowired
    private ConcertRepository concertRepository;

    public List<Concert> getAllConcerts() {
        return concertRepository.findAll();
    }

    public Concert saveConcert(Concert concert) {
        return concertRepository.save(concert);
    }

    public void deleteConcert(Long id) {
        concertRepository.deleteById(id);
    }
}


