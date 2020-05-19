package com.ps.infra.controllers;

import com.ps.app.query.handler.TrainingListHandler;
import com.ps.domain.model.dto.TrainingDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/formacion")
public final class TrainingListGetController {

    private final TrainingListHandler handler;

    public TrainingListGetController(TrainingListHandler handler) {
        this.handler = handler;
    }

    @GetMapping("/training/list")
    public ResponseEntity<List<TrainingDTO>> allTraining(){

        

        List<TrainingDTO> trainings = new ArrayList(); //this.handler.execute();

        return new ResponseEntity<>(trainings, HttpStatus.OK);
    }

}
