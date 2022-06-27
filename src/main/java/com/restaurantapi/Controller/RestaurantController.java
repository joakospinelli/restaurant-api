package com.restaurantapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantapi.Model.Plato;
import com.restaurantapi.Services.RestaurantServiceInterface;

@RestController
public class RestaurantController {
    
    @Autowired
    private RestaurantServiceInterface service;

    @GetMapping ("/{numero}")
    @ResponseBody
    public Plato getPlato(@PathVariable int numero){
        return this.service.getPlato(numero);
    }

    @PostMapping
    public void addPlato(@RequestBody Plato plato){
        this.service.addPlato(plato);
    }

}
