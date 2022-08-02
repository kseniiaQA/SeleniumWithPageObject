package com.Tests;

import lombok.*;

import java.time.OffsetDateTime;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode


public class PetResponse extends Pet {

    private Integer id;
    private OffsetDateTime lastUpdated;
}
