package com.tobeto.rentACar.services.concretes;

import com.tobeto.rentACar.entities.Model;
import com.tobeto.rentACar.repositories.ModelRepository;
import com.tobeto.rentACar.services.abstracts.ModelService;
import com.tobeto.rentACar.services.dtos.model.requests.AddModelRequest;
import org.springframework.stereotype.Service;

@Service
public class ModelManager implements ModelService {

    private final ModelRepository modelRepository;

    public ModelManager(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public void add(AddModelRequest addModelRequest) {
        Model model = new Model();
        model.setModelName(addModelRequest.getModelName());
    }

    @Override
    public Model getById(int id) {
        return modelRepository.findById(id).orElseThrow();
    }
}
