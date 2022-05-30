package com.example.tourdefrance2022restapi.controller;

import com.example.tourdefrance2022restapi.data.repository.RiderRepository;
import com.example.tourdefrance2022restapi.domain.model.Rider;
import com.example.tourdefrance2022restapi.domain.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/riders")
public class RiderController {

    @Autowired
    RiderRepository riderRepository;

    @GetMapping("")
    public List<Rider> getAllriders() {
        return riderRepository.findAll();
    }

    @GetMapping("/orderbytime")
    public List<Rider> getAllRidersOrderByTime() {
        return riderRepository.getAllByTimeNotNullOrderByTime();
    }

    @GetMapping("/{id}")
    public Rider getRiderById(@PathVariable int id) {
        Optional<Rider> riderById = riderRepository.findById(id);
        if (riderById.isPresent()) {
            return riderById.get();
        } else {
            return null;
        }
    }

    @GetMapping("/{team}/riders")
    public List<Rider> getRidersByTeam(@PathVariable Team team) {
        return riderRepository.getRiderByTeam(team);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Rider postRider(@RequestBody Rider rider) {
        return riderRepository.save(rider);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rider> updateRider(@PathVariable int id, @RequestBody Rider rider) {
        Optional<Rider> riderUpdate = riderRepository.findById(id);
        if (riderUpdate.isPresent()) {
            riderRepository.save(rider);
            return new ResponseEntity<>(rider, HttpStatus.OK);
        } else {
            Rider riderNotFound = new Rider();
            riderNotFound.setName("The requested rider wasnt there at id= " + id);
            return new ResponseEntity<Rider>(riderNotFound, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRider(@PathVariable int id) {
        try {
            riderRepository.deleteById(id);
            return new ResponseEntity<>("Deleted rider by id=" + id, HttpStatus.OK);
        } catch (Exception err) {
            return new ResponseEntity<>("The requested rider wasnt there at id=" + id, HttpStatus.NOT_FOUND);
        }

    }

}
