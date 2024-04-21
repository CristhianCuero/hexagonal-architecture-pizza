package com.criscuero.pizzaserviceapi.application.ports.input;

import com.criscuero.pizzaserviceapi.domain.Pizza;

import java.util.List;

public interface PizzaService {

    public void createPizza(Pizza pizza);
    public Pizza getPizza(String name);
    public List<Pizza> getALlPizzas();
}
