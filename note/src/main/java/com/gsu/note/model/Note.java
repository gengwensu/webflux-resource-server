package com.gsu.note.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
public class Note {
    @Id
    private Long id;
    private String text;
    private boolean confidential;

    public Note(String text, boolean confidential) {
        this.text = text;
        this.confidential = confidential;
    }
}
