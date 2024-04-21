package com.criscuero.pizzaserviceapi.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pizza {

    @Schema(description = "Name of the pizza", example = "Margherita")
    private String name;

    @Schema(description = "Price of the pizza", example = "10")
    private double price;

    @Schema(description = "Toppings of the pizza", example = "[\"Cheese\", \"Tomato\", \"Basil\"]")
    private String[] toppings;
}
