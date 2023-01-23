package com.example.arquitectura.limpia.infraestructure.adapters.jpa.entity;

import com.example.arquitectura.limpia.domain.model.product.Product;
import com.example.arquitectura.limpia.domain.model.product.atributes.ProductId;
import com.example.arquitectura.limpia.domain.model.product.atributes.ProductName;
import com.example.arquitectura.limpia.domain.model.product.atributes.ProductPrice;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;

    public Product toDomain(ProductDBO productDBO){
        return new Product(
                new ProductId(productDBO.getId()),
                new ProductName(productDBO.getName()),
                new ProductPrice(productDBO.getPrice())
        );
    }
    public ProductDBO fromDomain(Product product) {
        return new ProductDBO(
                product.getId().getValue(),
                product.getName().getValue(),
                product.getPrice().getValue()
        );
    }
}
