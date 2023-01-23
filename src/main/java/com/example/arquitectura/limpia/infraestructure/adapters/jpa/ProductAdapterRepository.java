package com.example.arquitectura.limpia.infraestructure.adapters.jpa;

import com.example.arquitectura.limpia.infraestructure.adapters.jpa.entity.ProductDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductAdapterRepository extends JpaRepository<ProductDBO, Integer> {
}
