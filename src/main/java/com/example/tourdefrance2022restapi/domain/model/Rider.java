package com.example.tourdefrance2022restapi.domain.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Setter
@Getter
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "riderId", nullable = false)
    private Integer riderId;
    private String name;
    private int age;
    private String nationality;
    private int time;
    private int mountainPoints;
    private int sprintPoints;

    @ManyToOne
    @JoinColumn(name = "teamId")
    private Team team;

}
