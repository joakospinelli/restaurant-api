package com.restaurantapi.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.restaurantapi.Model.Plato;

@Service
public class RestaurantService implements RestaurantServiceInterface {

    private ArrayList<Plato> menu;

    public RestaurantService(){
        this.menu = new ArrayList<>();
    }

    @Override
    public void addPlato(Plato p) {
        this.menu.add(p);
        
    }

    @Override
    public Plato getPlato(int numero) {
        return this.menu.stream()
                .filter(i -> i.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }
    
}
