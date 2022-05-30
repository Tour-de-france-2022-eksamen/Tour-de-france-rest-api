package com.example.tourdefrance2022restapi.controller;

import com.example.tourdefrance2022restapi.data.repository.TeamRepository;
import com.example.tourdefrance2022restapi.domain.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @GetMapping("")
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @GetMapping("/{id}")
    public Team getRiderById(@PathVariable int id) {
        Optional<Team> teamById = teamRepository.findById(id);
        if (teamById.isPresent()) {
            return teamById.get();
        } else {
            return null;
        }
    }


}
