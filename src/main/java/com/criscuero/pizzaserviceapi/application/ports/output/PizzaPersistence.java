package com.criscuero.pizzaserviceapi.application.ports.output;

import com.criscuero.pizzaserviceapi.domain.Pizza;
import com.criscuero.pizzaserviceapi.infraestructure.adapter.output.entity.PizzaEntity;

import java.util.List;

public interface PizzaPersistence {

    public void createPizza(Pizza pizza);
    public Pizza getPizza(String name);
    public List<Pizza> getAllPizzas();
}
