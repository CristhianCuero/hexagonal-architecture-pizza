package com.criscuero.pizzaserviceapi.infraestructure.adapter.output;


import com.criscuero.pizzaserviceapi.domain.Pizza;
import com.criscuero.pizzaserviceapi.application.ports.output.PizzaPersistence;
import com.criscuero.pizzaserviceapi.infraestructure.adapter.output.mapper.PizzaMapper;
import com.criscuero.pizzaserviceapi.infraestructure.exception.PizzaNotFoundException;
import com.criscuero.pizzaserviceapi.infraestructure.adapter.output.repository.PizzaRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;


@Repository
@AllArgsConstructor
@Slf4j
public class PizzaPersistenceImpl implements PizzaPersistence {

    private final PizzaRepository pizzaRepository;

    private final PizzaMapper pizzaMapper;

    @Override
    public void createPizza(Pizza pizza) {
        pizzaRepository.save(pizzaMapper.toPizzaEntity(pizza));
    }


    @Override
    public Pizza getPizza(String name) {
        return pizzaMapper.toPizza(pizzaRepository.findByName(name)
                .orElseThrow(() -> new PizzaNotFoundException("Pizza not found with name: " + name)));
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaMapper.toPizzas(pizzaRepository.findAll());
    }
}