package com.example.tourdefrance2022restapi.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teamId", nullable = false)
    private Integer id;
    private String name;

    @OneToMany
    @JsonBackReference
    @JoinColumn(name = "teamId")
    private List<Rider> riderList;

}
