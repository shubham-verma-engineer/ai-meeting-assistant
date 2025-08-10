package com.example.backend.repo;

import com.example.backend.model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.ZonedDateTime;
import java.util.List;

public interface MeetingRepository extends JpaRepository<Meeting, Long> {
    List<Meeting> findByStartTimeBetween(ZonedDateTime from, ZonedDateTime to);
}
