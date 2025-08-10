package com.example.backend.model;

import jakarta.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "meetings")
public class Meeting {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String provider;
    private String meetingLink;
    private ZonedDateTime startTime;
    private Integer durationMinutes;

    @OneToMany(mappedBy = "meeting", cascade = CascadeType.ALL)
    private List<Participant> participants = new ArrayList<>();

    // getters and setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getProvider(){return provider;}
    public void setProvider(String p){this.provider=p;}
    public String getMeetingLink(){return meetingLink;}
    public void setMeetingLink(String l){this.meetingLink=l;}
    public ZonedDateTime getStartTime(){return startTime;}
    public void setStartTime(ZonedDateTime t){this.startTime=t;}
    public Integer getDurationMinutes(){return durationMinutes;}
    public void setDurationMinutes(Integer d){this.durationMinutes=d;}
}
