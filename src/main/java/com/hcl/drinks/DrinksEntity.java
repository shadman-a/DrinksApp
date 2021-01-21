package com.hcl.drinks;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "drinks")
@Entity
public class DrinksEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "is_good")
    private Boolean is_good;

    @Column(name = "price")
    private Float price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
