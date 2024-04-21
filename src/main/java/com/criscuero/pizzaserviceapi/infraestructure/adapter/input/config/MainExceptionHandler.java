package com.criscuero.pizzaserviceapi.infraestructure.adapter.input.config;

import com.criscuero.pizzaserviceapi.infraestructure.adapter.input.config.error.ApiError;
import com.criscuero.pizzaserviceapi.infraestructure.exception.PizzaNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MainExceptionHandler {

    @ExceptionHandler(PizzaNotFoundException.class)
    public ResponseEntity<Object> handlePizzaNotFoundException(PizzaNotFoundException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(
                        new ApiError(
                                HttpStatus.NOT_FOUND.value(),
                                ex.getMessage()
                        )
                );
    }
}
