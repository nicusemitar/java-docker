package com.example.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product")
public class Product {

    @Id
    private int id;
    private String name;
    private int quantity;
    private long price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId() == product.getId() &&
                getQuantity() == product.getQuantity() &&
                getPrice() == product.getPrice() &&
                getName().equals(product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getQuantity(), getPrice());
    }
}
