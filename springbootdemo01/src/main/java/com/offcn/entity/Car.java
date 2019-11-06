package com.offcn.entity;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键自增长
    private Integer id;
    private String brand;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
