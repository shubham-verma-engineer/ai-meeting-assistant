package com.example.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "participants")
public class Participant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @ManyToOne
    private Meeting meeting;

    // getters/setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public String getEmail(){return email;}
    public void setEmail(String e){this.email=e;}
    public Meeting getMeeting(){return meeting;}
    public void setMeeting(Meeting m){this.meeting=m;}
}
