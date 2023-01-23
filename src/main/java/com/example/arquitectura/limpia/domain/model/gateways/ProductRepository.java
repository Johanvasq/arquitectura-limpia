package com.example.arquitectura.limpia.domain.model.gateways;

import com.example.arquitectura.limpia.domain.model.product.Product;
import com.example.arquitectura.limpia.domain.model.product.dto.ProductDTO;

public interface ProductRepository {

    public Product saveProduct(Product product);
}
