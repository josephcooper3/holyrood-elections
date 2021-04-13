package com.example.electionservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter @NoArgsConstructor
public class Election {

    private Long id;
    private int year;
    private ArrayList<String> seats;

    public Election(int year, ArrayList<String> seats) {
        this.year = year;
        this.seats = seats;
    }
}
