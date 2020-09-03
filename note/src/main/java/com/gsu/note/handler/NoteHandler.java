package com.gsu.note.handler;

import com.gsu.note.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class NoteHandler {
    private final NoteRepository noteRepository;

    Mono<ServerResponse> getById(ServerRequest r){
        return defaultReadResponse(noteRepository.findById(id(r)))
    }


}
