package com.spring.Notes.service;

import com.spring.Notes.models.AuditLogs;
import com.spring.Notes.models.Note;

import java.util.List;

public interface AuditLogService {

    public void logNoteCreation(String username, Note note);

    public void logNoteUpdate(String username, Note note);

    public void logNoteDeletion(String username, Long noteId);

    List<AuditLogs> getAllAuditLogs();

    List<AuditLogs> getAuditLogsForNoteId(Long id);
}
