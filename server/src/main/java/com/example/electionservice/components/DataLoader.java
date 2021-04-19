package com.example.electionservice.components;

import com.example.electionservice.models.Election;
import com.example.electionservice.models.Seat;
import com.example.electionservice.repositories.ElectionRepository;
import com.example.electionservice.repositories.SeatRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class DataLoader implements ApplicationRunner {

    @Autowired
    ElectionRepository electionRepository;

    @Autowired
    SeatRepository seatRepository;

    public void run(ApplicationArguments args) {

        Election sixteen = new Election(2016);
        electionRepository.save(sixteen);

        Seat edinCentral = new Seat("Edinburgh Central");
        seatRepository.save(edinCentral);

    }

}
