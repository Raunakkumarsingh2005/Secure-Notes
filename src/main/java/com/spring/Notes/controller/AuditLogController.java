package com.spring.Notes.controller;

import com.spring.Notes.models.AuditLogs;
import com.spring.Notes.service.AuditLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/audit")
public class AuditLogController {
    @Autowired
    AuditLogService auditLogService;

    @GetMapping
    public List<AuditLogs> getAuditLogs(){
        return auditLogService.getAllAuditLogs();
    }

    @GetMapping("/note/{id}")
    public List<AuditLogs> getNoteAuditLogs(@PathVariable Long id){
        return auditLogService.getAuditLogsForNoteId(id);
    }

}