

# Hexagonal-Architecture-Pizza-Service
![Hexagonal Arquitecture](https://github.com/CristhianCuero/hexagonal-architecture-pizza/assets/12468359/9ca58021-6c4e-46b6-b896-c6ef64c7c44e)

## Overview
This repository contains the source code for the Pizza Service project. The Pizza Service is a web application designed to manage pizza information, including listing available pizzas, inserting new pizzas into the database, and retrieving pizzas by name.





## Architecture components



| Category          | Component                | Description                                                                                              |
|-------------------|--------------------------|----------------------------------------------------------------------------------------------------------|
| Domain Object     | `Pizza`                  | Represents a pizza entity with attributes like name, price, and toppings.                                 |
| Ports             | `PizzaService`           | Exposes functionality to interact with pizza entities, such as creating, retrieving, and listing pizzas. |
|                   | `PizzaRepo`              | Defines methods for accessing persistent storage for pizza entities.                                       |
| Adapters          | Primary:                 |                                                                                                          |
|                   | `PizzaRestController`    | REST controller handling incoming HTTP requests related to pizzas.                                         |
| Adapters          | Secondary:               |                                                                                                          |
|                   | `PizzaRepoImpl`          | Implementation responsible for accessing persistent storage for pizzas.                                     |


## API Reference

- List all available pizzas
- Insert a new pizza into the database
- Get a pizza by name




| Endpoint                           | Method | Description                                 | Request Body                          |
|------------------------------------|--------|---------------------------------------------|---------------------------------------|
| `/pizza`                           | POST   | Creates a new pizza                         | ```json{"name": "string", "price": "integer", "toppings": ["string"]}``` |
| `/pizza/{name}`                    | GET    | Retrieves details of a pizza by its name   | `name` (string, path): Name of the pizza |
| `/pizza`                           | GET    | Retrieves a list of all available pizzas  | - None                                |



## Badges

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.3-brightgreen)](https://spring.io/projects/spring-boot)
[![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-3.2.3-brightgreen)](https://spring.io/projects/spring-data-jpa)
[![Spring Boot Validation](https://img.shields.io/badge/Spring%20Boot%20Validation-3.2.3-brightgreen)](https://spring.io/projects/spring-boot)
[![Lombok](https://img.shields.io/badge/Lombok-Latest-brightgreen)](https://projectlombok.org/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Latest-brightgreen)](https://www.postgresql.org/)
[![Spring Boot Test](https://img.shields.io/badge/Spring%20Boot%20Test-3.2.3-brightgreen)](https://spring.io/guides/gs/testing-web/)
[![Swagger](https://img.shields.io/badge/Swagger-3.0.0-brightgreen)](https://swagger.io/)
[![Springfox Swagger2](https://img.shields.io/badge/Springfox%20Swagger2-2.9.2-brightgreen)](https://springfox.github.io/springfox/docs/current/)
[![Springfox Swagger UI](https://img.shields.io/badge/Springfox%20Swagger%20UI-3.0.0-brightgreen)](https://springfox.github.io/springfox/docs/current/)
[![Springdoc OpenAPI](https://img.shields.io/badge/Springdoc%20OpenAPI-2.2.0-brightgreen)](https://springdoc.org/)
[![MapStruct](https://img.shields.io/badge/MapStruct-1.5.5.Final-brightgreen)](https://mapstruct.org/)


## License

[MIT](https://choosealicense.com/licenses/mit/)

