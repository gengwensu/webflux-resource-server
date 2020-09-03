package com.gsu.note.configuration;

import com.gsu.note.handler.NoteHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouteConfig implements WebFluxConfigurer {
    @Bean
    RouterFunction<ServerResponse> routerFunction(NoteHandler noteHandler){
        return
    }
}
