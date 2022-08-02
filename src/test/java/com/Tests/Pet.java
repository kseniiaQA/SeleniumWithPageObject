package com.Tests;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode

@NoArgsConstructor
public class Pet {

    private String name;
    private Integer id;


    public Pet(Pet pet) {
        this.name = pet.name;
        this.id = pet.id;
    }


    }


