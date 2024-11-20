package com.cambista.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.Decoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
@Configuration
public class FeignClientConfig {

    private final ObjectMapper objectMapper;

    public FeignClientConfig(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Bean
    public Decoder feignDecoder() {
        return new Decoder() {
            @Override
            public Object decode(Response response, Type type) throws IOException {
                // Leer el cuerpo de la respuesta como String
                String body = new BufferedReader(response.body().asReader(StandardCharsets.UTF_8)).lines()
                        .collect(Collectors.joining("\n"));

                // Mapear el cuerpo al tipo esperado usando Jackson
                return objectMapper.readValue(body, objectMapper.constructType(type));
            }
        };
    }
}
