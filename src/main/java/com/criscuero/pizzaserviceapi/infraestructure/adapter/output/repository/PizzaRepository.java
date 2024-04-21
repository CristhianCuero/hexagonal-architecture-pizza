package com.criscuero.pizzaserviceapi.infraestructure.adapter.output.repository;


import com.criscuero.pizzaserviceapi.infraestructure.adapter.output.entity.PizzaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PizzaRepository extends JpaRepository<PizzaEntity, Long> {
    Optional<PizzaEntity> findByName(String name);
}
