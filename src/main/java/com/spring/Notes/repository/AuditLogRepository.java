package com.spring.Notes.repository;

import com.spring.Notes.models.AuditLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AuditLogRepository extends JpaRepository<AuditLogs, Long> {
    List<AuditLogs> findByNoteId(Long noteId);
}
