package com.example.electionservice.models;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "elections")
@Getter @Setter @NoArgsConstructor
public class Election {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "year")
    private int year;

    @OneToMany(mappedBy = "election")
    private List<Result> results;

//    @JsonIgnoreProperties
//    @ManyToMany
//    @JoinTable(
//            name = "elections_seats",
//            joinColumns = { @JoinColumn(
//                    name = "seat_id",
//                    nullable = false,
//                    updatable = false)
//            },
//            inverseJoinColumns = { @JoinColumn(
//                    name = "election_id",
//                    nullable = false,
//                    updatable = false)
//            }
//    )
//    private List<Seat> seats;

    public Election(int year) {
        this.year = year;
        this.results = new ArrayList<Result>();
//        this.seats = new ArrayList<>();
    }

//    public void addSeat(Seat seat) {
//        this.seats.add(seat);
//    }

}
