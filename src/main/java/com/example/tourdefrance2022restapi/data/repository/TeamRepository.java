package com.example.tourdefrance2022restapi.data.repository;

import com.example.tourdefrance2022restapi.domain.model.Team;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
