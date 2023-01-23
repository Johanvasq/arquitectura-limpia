package com.example.arquitectura.limpia.domain.model.product.dto;

import com.example.arquitectura.limpia.domain.model.product.Product;
import com.example.arquitectura.limpia.domain.model.product.atributes.ProductId;
import com.example.arquitectura.limpia.domain.model.product.atributes.ProductName;
import com.example.arquitectura.limpia.domain.model.product.atributes.ProductPrice;

public class ProductDTO {

    private Integer id;
    private String name;
    private Integer price;

    public ProductDTO(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ProductDTO fromDomain(Product product){
        ProductDTO dto = new ProductDTO(product.getId().getValue(),
                product.getName().getValue(),
                product.getPrice().getValue());
        return dto;
    }

    public Product toDomain(ProductDTO productDTO){
        Product dto = new Product(
                new ProductId(productDTO.getId()),
                new ProductName(productDTO.getName()),
                new ProductPrice(productDTO.getPrice()));
        return dto;
    }

}
