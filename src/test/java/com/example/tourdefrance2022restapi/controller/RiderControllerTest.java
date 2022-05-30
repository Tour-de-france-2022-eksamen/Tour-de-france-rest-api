package com.example.tourdefrance2022restapi.controller;

import com.example.tourdefrance2022restapi.data.repository.RiderRepository;
import com.example.tourdefrance2022restapi.data.repository.TeamRepository;
import com.example.tourdefrance2022restapi.domain.model.Rider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class RiderControllerTest {

    @Autowired
    TeamRepository teamRepository;
    @Autowired
    RiderRepository riderRepository;

    @Test
    void getAllRiders() {
        //Arrange
        Rider testRider = new Rider();
        testRider.setName("Test Rider Name");
        //Act
        riderRepository.save(testRider);
        //Assert
        assertNotNull(riderRepository.findAll());

        //tear down
        riderRepository.delete(testRider);
    }

    @Test
    void getRiderByName() {
        //Arrange
        Rider testRider = new Rider();
        testRider.setRiderId(1);
        testRider.setName("RiderTest");
        //Act
        riderRepository.save(testRider);
        //Assert
        assertEquals(riderRepository.findById(1).get().getName(), "RiderTest");

        //tear down
        riderRepository.delete(testRider);

    }
}