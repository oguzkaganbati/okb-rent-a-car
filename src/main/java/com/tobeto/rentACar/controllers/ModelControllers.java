package com.tobeto.java1aintro.controllers;

import com.tobeto.java1aintro.entities.Model;
import com.tobeto.java1aintro.repositories.ModelRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/models")
public class ModelControllers {
    private final ModelRepository modelRepository;

    public ModelControllers(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @GetMapping
    public List<Model> getAll(){
        return modelRepository.findAll();
    }

    @GetMapping("{id}")

    public Model getById(@PathVariable int id){
       return modelRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Model model){
        modelRepository.save(model);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Model modelToDelete = modelRepository.findById(id).orElseThrow();
    }
}
