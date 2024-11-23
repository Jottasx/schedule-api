/*
 * © ${2024} Jarbas Vitor Pereira Montenegro. All rights reserved.
 * This file is part of the schedule-api and is protected under copyright law.
 * Unauthorized reproduction, modification, or distribution is prohibited.
 *
 */

package com.atac.schedule_api.service;

import com.atac.schedule_api.exception.NotFoundException;
import com.atac.schedule_api.model.Model;
import com.atac.schedule_api.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelService {

    @Autowired
    ModelRepository modelRepository;

    public void saveModel(Model newModel){
        modelRepository.save(newModel);
    }
    public List<Model> findAllModels(){
        return modelRepository.findAll();
    }
    public Model findModelById(Long id){
        return modelRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
    public Model replaceModel(Model newModel, Long id) {
        return modelRepository.findById(id)
                .map(employee -> {
                    employee.setName(newModel.getName());
                    return modelRepository.save(employee);
                })
                .orElseGet(() -> {
                    return modelRepository.save(newModel);
                });
    }
    void deleteModel(Long id) {
        modelRepository.deleteById(id);
    }

}
