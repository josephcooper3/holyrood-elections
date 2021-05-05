package com.example.electionservice;

import com.example.electionservice.models.Election;
import com.example.electionservice.repositories.ElectionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ElectionserviceApplicationTests {

	@Autowired
	ElectionRepository electionRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createElection() {
		long countBefore = electionRepository.count();
		Election sixteen = new Election(2016);
		electionRepository.save(sixteen);
		assertEquals(countBefore + 1, electionRepository.count());
		electionRepository.delete(sixteen);
	}

	@Test
	public void deleteElection() {
		long countBefore = electionRepository.count();
		Election sixteen = new Election(2016);
		electionRepository.save(sixteen);
		electionRepository.delete(sixteen);
		assertEquals(countBefore, electionRepository.count());
	}

}
