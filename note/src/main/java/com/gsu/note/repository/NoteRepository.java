package com.gsu.note.repository;

import com.gsu.note.model.Note;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface NoteRepository extends ReactiveCrudRepository<Note, Long> {

    @Query("SELECT * FROM note WHERE text = :text")
    Flux<Note> findByText(String text);

}
