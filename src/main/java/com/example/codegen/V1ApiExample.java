package com.example.codegen;

import com.example.codegen.api.V1Api;
import com.example.codegen.api.V1ApiDelegate;
import com.example.codegen.integration.api.TestTagApi;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@Component
@RequiredArgsConstructor
@Slf4j
public class V1ApiExample implements V1ApiDelegate {

    private final TestTagApi client;

    @Override
    public ResponseEntity<Integer> testGet(Integer number) {
        log.info("Passou {}", Instant.now());
        return client._testGet(4);
    }


}
