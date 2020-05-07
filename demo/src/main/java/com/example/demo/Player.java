package com.example.demo;
import lombok.Data;

import javax.persistence.*;

import javax.persistence.Entity;

@Data
@Entity

public class Player {
    private @Id @GeneratedValue Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
