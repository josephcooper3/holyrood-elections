package com.example.electionservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "results")
@Getter @Setter @NoArgsConstructor
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "votes")
    private int votes;

    @ManyToOne
    @JoinColumn(name = "election_id", nullable = false)
    private Election election;

    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "party_id", nullable = false)
    private Party party;

    public Result(int votes, Election election, Seat seat, Party party) {
        this.votes = votes;
        this.election = election;
        this.seat = seat;
        this.party = party;
    }
}
