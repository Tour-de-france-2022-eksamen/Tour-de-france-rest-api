package com.example.tourdefrance2022restapi.domain.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TeamTest {

    @Test
    void getPartiNavn() {
        //Arrange
        Team testTeam = new Team();
        testTeam.setName("Test Team");

        //Act and Assert
        assertEquals(testTeam.getName(), "Test Team");
    }

    @Test
    void setKandidatNavn() {
        //Arrange
        Team testTeam = new Team();
        testTeam.setName("Test Name");

        //Act and Assert
        assertEquals(testTeam.getName(), "Test Name");
    }

}