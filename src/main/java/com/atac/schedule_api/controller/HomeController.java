/*
 * © ${2024} Jarbas Vitor Pereira Montenegro. All rights reserved.
 * This file is part of the schedule-api and is protected under copyright law.
 * Unauthorized reproduction, modification, or distribution is prohibited.
 *
 */

package com.atac.schedule_api.controller;

import com.atac.schedule_api.model.Model;
import com.atac.schedule_api.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestController("/home")
public class HomeController {

    @Autowired
    ModelService modelService;

    //Controller For Test Only
    @GetMapping("/models")
    public ResponseEntity<List<Model>> getAllModels(){
        List<Model> models = modelService.findAllModels();
        if(models.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(models);
    }
}
