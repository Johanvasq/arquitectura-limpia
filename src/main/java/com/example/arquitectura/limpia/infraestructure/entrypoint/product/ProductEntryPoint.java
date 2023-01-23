package com.example.arquitectura.limpia.infraestructure.entrypoint.product;

import com.example.arquitectura.limpia.domain.model.product.dto.ProductDTO;
import com.example.arquitectura.limpia.domain.usecase.product.ProductUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductEntryPoint {

    private final ProductUseCase productUseCase;

    @PostMapping
    public ProductDTO saveProduct(@RequestBody ProductDTO productDTO){
        return productUseCase.saveProduct(productDTO);
    }
}
