package com.example.tryajax.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String catname, cating;

    public Cat(String catname, String cating) {
        this.catname = catname;
        this.cating = cating;
    }
}
