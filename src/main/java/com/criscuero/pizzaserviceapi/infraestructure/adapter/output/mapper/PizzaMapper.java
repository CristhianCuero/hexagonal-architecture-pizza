package com.criscuero.pizzaserviceapi.infraestructure.adapter.output.mapper;

import com.criscuero.pizzaserviceapi.domain.Pizza;
import com.criscuero.pizzaserviceapi.infraestructure.adapter.output.entity.PizzaEntity;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PizzaMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PizzaEntity toPizzaEntity(Pizza pizza);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Pizza toPizza(PizzaEntity pizzaEntity);

    List<Pizza> toPizzas(List<PizzaEntity> userEntities);
}
