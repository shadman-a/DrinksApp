package com.hcl.drinks;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "drinks")
@Entity
public class DrinksEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "is_good")
    private Boolean is_good;

    @Column(name = "price")
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIs_good() {
        return is_good;
    }

    public void setIs_good(Boolean is_good) {
        this.is_good = is_good;
    }
}
