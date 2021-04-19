package com.example.electionservice.repositories;

import com.example.electionservice.models.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PartyRepository extends JpaRepository<Party, Long> {
}
