package com.spring.Notes.service.impl;

import com.spring.Notes.models.AuditLogs;
import com.spring.Notes.models.Note;
import com.spring.Notes.repository.AuditLogRepository;
import com.spring.Notes.service.AuditLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImpl implements AuditLogService {

    @Autowired
    AuditLogRepository auditLogRepository;

    @Override
    public void logNoteCreation(String username, Note note) {
        AuditLogs log = new AuditLogs();
        log.setAction("CREATE");
        log.setUsername(username);
        log.setNoteId(note.getId());
        log.setNoteContent(note.getContent());
        log.setTimeStamp(java.time.LocalDateTime.now());
        auditLogRepository.save(log);
    }

    @Override
    public void logNoteUpdate(String username, Note note) {
        AuditLogs log = new AuditLogs();
        log.setAction("UPDATE");
        log.setUsername(username);
        log.setNoteId(note.getId());
        log.setNoteContent(note.getContent());
        log.setTimeStamp(java.time.LocalDateTime.now());
        auditLogRepository.save(log);
    }

    @Override
    public void logNoteDeletion(String username, Long noteId) {
        AuditLogs log = new AuditLogs();
        log.setAction("DELETE");
        log.setUsername(username);
        log.setNoteId(noteId);
        log.setTimeStamp(java.time.LocalDateTime.now());
        auditLogRepository.save(log);
    }

    @Override
    public List<AuditLogs> getAllAuditLogs() {
        return auditLogRepository.findAll();
    }

    @Override
    public List<AuditLogs> getAuditLogsForNoteId(Long id) {
        return auditLogRepository.findByNoteId(id);
    }
}

