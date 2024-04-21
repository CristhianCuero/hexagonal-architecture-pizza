package com.criscuero.pizzaserviceapi.infraestructure.adapter.input.controller;

import com.criscuero.pizzaserviceapi.domain.Pizza;
import com.criscuero.pizzaserviceapi.application.ports.input.PizzaService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Tag(name = "Pizza Service API")
@Slf4j
@AllArgsConstructor
public class PizzaRestController {


    private PizzaService pizzaService;

    @Operation(summary = "Creates a new pizza")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Server Error"),
            @ApiResponse(code = 503, message = "Service Unavailable")
    })
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/pizza")
    public ResponseEntity<String> createPizza(@RequestBody Pizza pizza) {
        log.info("create pizza init");
        pizzaService.createPizza(pizza);
        return ResponseEntity.ok("Pizza " + pizza.getName() + " created");
    }

    @Operation(summary = "Retrieves details of a pizza by its name.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Server Error"),
            @ApiResponse(code = 503, message = "Service Unavailable")
    })
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/pizza/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pizza> getPizza(@PathVariable @Parameter(name = "name", description = "Pizza name", example = "Margherita") String name) {
        log.info("getPizza init");
        return ResponseEntity.ok(pizzaService.getPizza(name));
    }

    @Operation(summary = "Retrieves a list of all available pizzas.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Server Error"),
            @ApiResponse(code = 503, message = "Service Unavailable")
    })
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/pizza", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Pizza>> listPizza() {
        log.info("listPizza init");
        return ResponseEntity.ok(pizzaService.getALlPizzas());
    }

}
