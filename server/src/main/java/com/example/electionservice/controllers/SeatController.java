package com.example.electionservice.controllers;

import com.example.electionservice.models.Seat;
import com.example.electionservice.repositories.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/seats")
public class SeatController {

    @Autowired
    SeatRepository seatRepository;

    @GetMapping
    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Seat> getElection(@PathVariable Long id) {
        return seatRepository.findById(id);
    }

}
