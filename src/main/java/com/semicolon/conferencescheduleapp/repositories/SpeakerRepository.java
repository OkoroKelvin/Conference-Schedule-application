package com.semicolon.conferencescheduleapp.repositories;

import com.semicolon.conferencescheduleapp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
