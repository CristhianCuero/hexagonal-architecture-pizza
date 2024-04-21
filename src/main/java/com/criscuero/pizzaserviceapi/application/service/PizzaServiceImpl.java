package com.criscuero.pizzaserviceapi.application.service;


import com.criscuero.pizzaserviceapi.application.ports.output.PizzaPersistence;
import com.criscuero.pizzaserviceapi.domain.Pizza;
import com.criscuero.pizzaserviceapi.application.ports.input.PizzaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
@Slf4j
public class PizzaServiceImpl implements PizzaService {

    private final PizzaPersistence pizzaPersistence;

    @Override
    public void createPizza(Pizza pizza) {
        pizzaPersistence.createPizza(pizza);
    }

    @Override
    public Pizza getPizza(String name) {
        return pizzaPersistence.getPizza(name);
    }

    @Override
    public List<Pizza> getALlPizzas() {
        return pizzaPersistence.getAllPizzas();
    }
}
