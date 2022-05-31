package com.example.tourdefrance2022restapi.data.mapper;

import com.example.tourdefrance2022restapi.data.repository.RiderRepository;
import com.example.tourdefrance2022restapi.data.repository.TeamRepository;
import com.example.tourdefrance2022restapi.domain.model.Rider;
import com.example.tourdefrance2022restapi.domain.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataMapper implements CommandLineRunner {

    @Autowired
    TeamRepository teamRepository;
    @Autowired
    RiderRepository riderRepository;

    @Override
    public void run(String... args) throws Exception {

        //Testdata

        //Teams
        Team team1 = new Team();
        team1.setName("Moviestar Team");
        teamRepository.save(team1);

        Team team2 = new Team();
        team2.setName("INEOS Grenadiers");
        teamRepository.save(team2);

        Team team3 = new Team();
        team3.setName("Astana Qazaqstan Team");
        teamRepository.save(team3);

        Team team4 = new Team();
        team4.setName("Groupama - FDJ");
        teamRepository.save(team4);

        Team team5 = new Team();
        team5.setName("Jumbo-Visma");
        teamRepository.save(team5);


        //Riders

        //Team 1: Moviestar Team
        Rider rider1 = new Rider();
        rider1.setName("Nelson Oliveira");
        rider1.setAge(33);
        rider1.setNationality("Portugal");
        rider1.setTime(124522);
        rider1.setMountainPoints(1);
        rider1.setSprintPoints(0);
        rider1.setTeam(team1);
        riderRepository.save(rider1);

        Rider rider2 = new Rider();
        rider2.setName("Carlos Verona");
        rider2.setAge(29);
        rider2.setNationality("Spain");
        rider2.setTime(125521);
        rider2.setMountainPoints(0);
        rider2.setSprintPoints(0);
        rider2.setTeam(team1);
        riderRepository.save(rider2);

        Rider rider3 = new Rider();
        rider3.setName("Imanol Erviti");
        rider3.setAge(38);
        rider3.setNationality("Spain");
        rider3.setTime(125703);
        rider3.setMountainPoints(0);
        rider3.setSprintPoints(0);
        rider3.setTeam(team1);
        riderRepository.save(rider3);

        Rider rider4 = new Rider();
        rider4.setName("Gorka Izagirre");
        rider4.setAge(34);
        rider4.setNationality("Spain");
        rider4.setTime(124943);
        rider4.setMountainPoints(0);
        rider4.setSprintPoints(0);
        rider4.setTeam(team1);
        riderRepository.save(rider4);

        Rider rider5 = new Rider();
        rider5.setName("Matteo Jorgenson");
        rider5.setAge(22);
        rider5.setNationality("United States");
        rider5.setTime(124652);
        rider5.setMountainPoints(0);
        rider5.setSprintPoints(0);
        rider5.setTeam(team1);
        riderRepository.save(rider5);


        //Team 2: INEOS Grenadiers
        Rider rider6 = new Rider();
        rider6.setName("Daniel Felipe Martínez");
        rider6.setAge(26);
        rider6.setNationality("Colombia");
        rider6.setTime(124702);
        rider6.setMountainPoints(0);
        rider6.setSprintPoints(1);
        rider6.setTeam(team2);
        riderRepository.save(rider6);

        Rider rider7 = new Rider();
        rider7.setName("Pavel Sivakov");
        rider7.setAge(24);
        rider7.setNationality("France");
        rider7.setTime(124643);
        rider7.setMountainPoints(1);
        rider7.setSprintPoints(0);
        rider7.setTeam(team2);
        riderRepository.save(rider7);

        Rider rider8 = new Rider();
        rider8.setName("Adam Yates");
        rider8.setAge(29);
        rider8.setNationality("Great Britain");
        rider8.setTime(124542);
        rider8.setMountainPoints(0);
        rider8.setSprintPoints(0);
        rider8.setTeam(team2);
        riderRepository.save(rider8);

        Rider rider9 = new Rider();
        rider9.setName("Thomas Pidcock");
        rider9.setAge(22);
        rider9.setNationality("Great Britain");
        rider9.setTime(124712);
        rider9.setMountainPoints(0);
        rider9.setSprintPoints(0);
        rider9.setTeam(team2);
        riderRepository.save(rider9);

        Rider rider10 = new Rider();
        rider10.setName("Thomas Pidcock");
        rider10.setAge(22);
        rider10.setNationality("Great Britain");
        rider10.setTime(124712);
        rider10.setMountainPoints(0);
        rider10.setSprintPoints(0);
        rider10.setTeam(team2);
        riderRepository.save(rider10);


        //Team 3: Astana Qazaqstan Team
        Rider rider11 = new Rider();
        rider11.setName("Samuele Battistella");
        rider11.setAge(23);
        rider11.setNationality("Italy");
        rider11.setTime(124202);
        rider11.setMountainPoints(2);
        rider11.setSprintPoints(0);
        rider11.setTeam(team3);
        riderRepository.save(rider11);

        Rider rider12 = new Rider();
        rider12.setName("Alexey Lutsenko");
        rider12.setAge(29);
        rider12.setNationality("Kazakhstan");
        rider12.setTime(124603);
        rider12.setMountainPoints(0);
        rider12.setSprintPoints(0);
        rider12.setTeam(team3);
        riderRepository.save(rider12);

        Rider rider13 = new Rider();
        rider13.setName("Miguel Ángel López");
        rider13.setAge(28);
        rider13.setNationality("Colombia");
        rider13.setTime(125116);
        rider13.setMountainPoints(0);
        rider13.setSprintPoints(0);
        rider13.setTeam(team3);
        riderRepository.save(rider13);

        Rider rider14 = new Rider();
        rider14.setName("Gianni Moscon");
        rider14.setAge(28);
        rider14.setNationality("Italy");
        rider14.setTime(125803);
        rider14.setMountainPoints(0);
        rider14.setSprintPoints(0);
        rider14.setTeam(team3);
        riderRepository.save(rider14);


        //Team 4: Groupama - FDJ
        Rider rider15 = new Rider();
        rider15.setName("Michael Storer");
        rider15.setAge(25);
        rider15.setNationality("Australia");
        rider15.setTime(185900);
        rider15.setMountainPoints(0);
        rider15.setSprintPoints(0);
        rider15.setTeam(team4);
        riderRepository.save(rider15);

        Rider rider16 = new Rider();
        rider16.setName("Kevin Geniets");
        rider16.setAge(25);
        rider16.setNationality("Luxembourg");
        rider16.setTime(125900);
        rider16.setMountainPoints(0);
        rider16.setSprintPoints(0);
        rider16.setTeam(team4);
        riderRepository.save(rider16);

        Rider rider17 = new Rider();
        rider17.setName("Matthieu Ladagnous");
        rider17.setAge(37);
        rider17.setNationality("France");
        rider17.setTime(124112);
        rider17.setMountainPoints(0);
        rider17.setSprintPoints(0);
        rider17.setTeam(team4);
        riderRepository.save(rider17);

        Rider rider18 = new Rider();
        rider18.setName("Bruno Armirail");
        rider18.setAge(28);
        rider18.setNationality("France");
        rider18.setTime(124723);
        rider18.setMountainPoints(0);
        rider18.setSprintPoints(0);
        rider18.setTeam(team4);
        riderRepository.save(rider18);

        Rider rider19 = new Rider();
        rider19.setName("Olivier Le Gac");
        rider19.setAge(28);
        rider19.setNationality("France");
        rider19.setTime(130423);
        rider19.setMountainPoints(0);
        rider19.setSprintPoints(0);
        rider19.setTeam(team4);
        riderRepository.save(rider19);


        //Team 5: Jumbo-Visma

        Rider rider20 = new Rider();
        rider20.setName("Sepp Kuss");
        rider20.setAge(27);
        rider20.setNationality("United States");
        rider20.setTime(124021);
        rider20.setMountainPoints(1);
        rider20.setSprintPoints(0);
        rider20.setTeam(team5);
        riderRepository.save(rider20);

        Rider rider21 = new Rider();
        rider21.setName("Tiesj Benoot");
        rider21.setAge(28);
        rider21.setNationality("Belgium");
        rider21.setTime(124811);
        rider21.setMountainPoints(0);
        rider21.setSprintPoints(0);
        rider21.setTeam(team5);
        riderRepository.save(rider21);

        Rider rider22 = new Rider();
        rider22.setName("Jonas Vingegaard");
        rider22.setAge(25);
        rider22.setNationality("Denmark");
        rider22.setTime(123300);
        rider22.setMountainPoints(0);
        rider22.setSprintPoints(1);
        rider22.setTeam(team5);
        riderRepository.save(rider22);

        Rider rider23 = new Rider();
        rider23.setName("Rohan Dennis");
        rider23.setAge(32);
        rider23.setNationality("Australia");
        rider23.setTime(125101);
        rider23.setMountainPoints(0);
        rider23.setSprintPoints(0);
        rider23.setTeam(team5);
        riderRepository.save(rider23);

        Rider rider24 = new Rider();
        rider24.setName("Wout van Aert");
        rider24.setAge(27);
        rider24.setNationality("Belgium");
        rider24.setTime(125101);
        rider24.setMountainPoints(0);
        rider24.setSprintPoints(0);
        rider24.setTeam(team5);
        riderRepository.save(rider24);

    }
}
