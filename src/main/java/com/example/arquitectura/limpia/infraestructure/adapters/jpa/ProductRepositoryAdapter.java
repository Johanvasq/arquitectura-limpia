package com.example.arquitectura.limpia.infraestructure.adapters.jpa;

import com.example.arquitectura.limpia.domain.model.gateways.ProductRepository;
import com.example.arquitectura.limpia.domain.model.product.Product;
import com.example.arquitectura.limpia.domain.model.product.dto.ProductDTO;
import com.example.arquitectura.limpia.infraestructure.adapters.jpa.entity.ProductDBO;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryAdapter implements ProductRepository {

    public final ProductAdapterRepository repository;

    public ProductRepositoryAdapter(ProductAdapterRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product saveProduct(Product product) {
        ProductDBO productDBO = new ProductDBO().fromDomain(product);.
        return productDBO.toDomain(repository.save(productDBO));

    }
}
