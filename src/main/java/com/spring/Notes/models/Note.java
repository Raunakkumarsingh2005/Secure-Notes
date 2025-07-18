package com.spring.Notes.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String content;

    private String ownerUsername;

    public Long getId() {
        return id;
    }

    public Note setId(Long id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Note setContent(String content) {
        this.content = content;
        return this;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public Note setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
        return this;
    }
}


