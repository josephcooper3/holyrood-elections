package com.example.electionservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "seats")
@Getter @Setter @NoArgsConstructor
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "seat_name")
    private String seatName;

    @JsonIgnoreProperties
    @ManyToMany
    @JoinTable(
            name = "elections_seats",
            joinColumns = { @JoinColumn(
                    name = "election_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "seat_id",
                    nullable = false,
                    updatable = false)
            }
    )
    private List<Election> elections;

    public Seat(String seatName) {
        this.seatName = seatName;
        this.elections = new ArrayList<>();
    }

}
