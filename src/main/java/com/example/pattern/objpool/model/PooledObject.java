package com.example.pattern.objpool.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PooledObject {
    private String name;
    private String surname;
    private String birthDate;

}
