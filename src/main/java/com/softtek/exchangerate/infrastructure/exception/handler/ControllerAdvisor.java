package com.softtek.exchangerate.infrastructure.exception.handler;

import com.softtek.exchangerate.application.exception.ApplicationException;
import com.softtek.exchangerate.infrastructure.exception.InfrastructureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor {
    private static final String MESSAGE = "message";

    @ExceptionHandler(InfrastructureException.class)
    public ResponseEntity<Map<String, String>> handleInfrastructureException(InfrastructureException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ex.getMessage()));
    }
}
