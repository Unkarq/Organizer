package com.sda.gda17.organizer.organizer.repository;

import com.sda.gda17.organizer.organizer.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<Notes,Long> {
}
