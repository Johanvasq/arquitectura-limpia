package com.example.arquitectura.limpia.domain.usecase.product;

import com.example.arquitectura.limpia.domain.model.gateways.ProductRepository;
import com.example.arquitectura.limpia.domain.model.product.dto.ProductDTO;

public class ProductUseCase {

    public final ProductRepository productRepository;

    public ProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductDTO saveProduct(ProductDTO productDTO) {

        return productDTO.fromDomain(
                productRepository.saveProduct(
                        productDTO.toDomain(productDTO)
                )
        );
    }
}
