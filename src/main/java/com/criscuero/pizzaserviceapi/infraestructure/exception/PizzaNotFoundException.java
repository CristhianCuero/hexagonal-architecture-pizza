package com.criscuero.pizzaserviceapi.infraestructure.exception;

public class PizzaNotFoundException extends RuntimeException {

    public PizzaNotFoundException(String message) {
        super(message);
    }
}