package com.restaurantapi.Services;

import com.restaurantapi.Model.Plato;

public interface RestaurantServiceInterface {

    public void addPlato(Plato p);
    public Plato getPlato(int numero);
    
}
