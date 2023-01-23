package com.example.arquitectura.limpia.application;

import com.example.arquitectura.limpia.domain.model.gateways.ProductRepository;
import com.example.arquitectura.limpia.domain.usecase.product.ProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public ProductUseCase productUseCase(ProductRepository productRepository){
        return new ProductUseCase(productRepository);
    }
}
