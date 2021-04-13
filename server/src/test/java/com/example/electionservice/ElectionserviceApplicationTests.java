package com.example.electionservice;

import com.example.electionservice.models.Election;
import com.example.electionservice.repositories.ElectionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ElectionserviceApplicationTests {

	@Autowired
	ElectionRepository electionRepository;

	@BeforeEach
	public void init() {
		electionRepository.deleteAll();
	}

	@Test
	void contextLoads() {
	}

	@Test
	public void createElection() {
		Election sixteen = new Election(2016);
		electionRepository.save(sixteen);
		assertEquals(1, electionRepository.count());
	}

	@Test
	public void deleteElection() {
		Election sixteen = new Election(2016);
		electionRepository.save(sixteen);
		electionRepository.delete(sixteen);
		assertEquals(0, electionRepository.count());
	}

}
