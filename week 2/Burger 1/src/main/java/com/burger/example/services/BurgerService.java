package com.burger.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.burger.example.models.Burger;
import com.burger.example.repositories.BurgerRepository;

@Service
public class BurgerService {

		@Autowired
		private BurgerRepository burgerRepo;
		
    // Method to retrieve all burgers
    public List<Burger> allBurgers() {
   
        return burgerRepo.findAll();
     
    }

    // Method to create a new burger
    public Burger createBurger(Burger burger) {
     
        return burgerRepo.save(burger);
        
    }

    // Method to find a burger by ID
    public Burger findBurger(Long id) {
 
        return burgerRepo.findById(id).orElse(null);
       
    }


}
