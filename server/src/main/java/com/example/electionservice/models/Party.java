package com.example.electionservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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

    public Party(String partyName) {
        this.partyName = partyName;
    }
}
