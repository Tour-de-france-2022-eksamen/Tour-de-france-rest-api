package com.example.tourdefrance2022restapi.data.repository;

import com.example.tourdefrance2022restapi.domain.model.Rider;
import com.example.tourdefrance2022restapi.domain.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RiderRepository extends JpaRepository<Rider, Integer> {
    List<Rider> getRiderByTeam(Team team);

    List<Rider> getAllByTimeNotNullOrderByTime();

}
