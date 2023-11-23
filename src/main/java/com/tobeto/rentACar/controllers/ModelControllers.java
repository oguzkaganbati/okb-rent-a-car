package com.tobeto.rentACar.controllers;

import com.tobeto.rentACar.services.abstracts.ModelService;
import com.tobeto.rentACar.services.dtos.model.requests.AddModelRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/models")
public class ModelControllers {
    private ModelService modelService;

    public ModelControllers(ModelService modelService) {
        this.modelService = modelService;
    }

    @PostMapping
    public void add(@RequestBody AddModelRequest addModelRequest){
        modelService.add(addModelRequest);
    }
}
