package com.restaurantapi.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Plato {
    
    private String nombre, descripcion;
    private double precio;
    private int numero;
}
