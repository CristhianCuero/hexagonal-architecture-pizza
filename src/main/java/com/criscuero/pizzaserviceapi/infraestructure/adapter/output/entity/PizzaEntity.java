package com.criscuero.pizzaserviceapi.infraestructure.adapter.output.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pizzas")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name", nullable = false, unique=true)
    private String name;


    @Column(name = "price", nullable = false)
    private double price;


    @Column(name = "toppings", nullable = false, length = 1000)
    private String[] toppings;

}
