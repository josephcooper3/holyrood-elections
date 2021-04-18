package com.example.electionservice.controllers;

import com.example.electionservice.models.Election;
import com.example.electionservice.repositories.ElectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/elections")
public class ElectionController {

    @Autowired
    ElectionRepository electionRepository;

    @GetMapping
    public List<Election> getAllElections() {
        return electionRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Election> getElection(@PathVariable Long id) {
        return electionRepository.findById(id);
    }

}
