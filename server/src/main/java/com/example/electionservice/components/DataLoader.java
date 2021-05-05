package com.example.electionservice.components;

import com.example.electionservice.models.Election;
import com.example.electionservice.models.Party;
import com.example.electionservice.models.Result;
import com.example.electionservice.models.Seat;
import com.example.electionservice.repositories.ElectionRepository;
import com.example.electionservice.repositories.PartyRepository;
import com.example.electionservice.repositories.ResultRepository;
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

    @Autowired
    PartyRepository partyRepository;

    @Autowired
    ResultRepository resultRepository;

    public void run(ApplicationArguments args) {

        Party conservative = new Party("Scottish Conservatives");
        partyRepository.save(conservative);

        Party snp = new Party("Scottish National Party");
        partyRepository.save(snp);

        Party labour = new Party("Scottish Labour");
        partyRepository.save(labour);

        Party green = new Party("Scottish Green Party");
        partyRepository.save(green);

        Party libDem = new Party("Liberal Democrats");
        partyRepository.save(libDem);

        Party libertarian = new Party("Scottish Libertarian Party");
        partyRepository.save(libertarian);

        Election sixteen = new Election(2016);
        electionRepository.save(sixteen);

        Seat edinCentral = new Seat("Edinburgh Central");
        seatRepository.save(edinCentral);

        resultRepository.save(new Result(sixteen, edinCentral, conservative,  10399));
        resultRepository.save(new Result(sixteen, edinCentral, snp, 9789));
        resultRepository.save(new Result(sixteen, edinCentral, labour, 7546));
        resultRepository.save(new Result(sixteen, edinCentral, green, 4644));
        resultRepository.save(new Result(sixteen, edinCentral, libDem, 1672));
        resultRepository.save(new Result(sixteen, edinCentral, libertarian, 119));

    }

}
