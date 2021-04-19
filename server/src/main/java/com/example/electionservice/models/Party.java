package com.example.electionservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "parties")
@Getter @Setter @NoArgsConstructor
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "party_name")
    private String partyName;

    @OneToMany(mappedBy = "party")
    private List<Result> results;

    public Party(String partyName) {
        this.partyName = partyName;
        this.results = new ArrayList<Result>();
    }
}
