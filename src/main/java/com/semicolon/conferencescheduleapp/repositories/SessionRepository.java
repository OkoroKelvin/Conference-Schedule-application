package com.semicolon.conferencescheduleapp.repositories;

import com.semicolon.conferencescheduleapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
