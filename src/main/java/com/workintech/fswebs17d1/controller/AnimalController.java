package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/workintech/animal")
public class AnimalController {
    private Map<Integer, Animal> animals = new HashMap<>();
    @GetMapping
    public  Animal[] Animals(){
        return animals.values().toArray(new Animal[0]);
    }
    @GetMapping ("/{id}")
    public  Animal Animals(@PathVariable("id") Integer id){
        return animals.get(id);
    }
    @PostMapping
public Animal CreateAnimals(@RequestBody Animal animal){
        animals.put(animal.getId(),animal);
        return animal;
                    }
    @PutMapping  ("/{id}")
    public Animal UpdateAnimal(
           @PathVariable Integer id, @RequestBody Animal animal){
        animals.put(id,animal);
        return animal;
    }
    @DeleteMapping ("/{id}")
    public void DeleteAnimal(
            @PathVariable Integer id){
        animals.remove(id);
    }
}

