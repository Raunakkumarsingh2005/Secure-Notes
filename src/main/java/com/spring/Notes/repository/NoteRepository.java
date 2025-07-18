package com.spring.Notes.repository;

import com.spring.Notes.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByOwnerUsername(String ownerUsername);
}
