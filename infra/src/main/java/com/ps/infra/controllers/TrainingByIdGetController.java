package com.ps.infra.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.app.query.handler.TrainingByIdHandler;
import com.ps.domain.model.dto.TrainingDTO;

@RestController
@RequestMapping("api/seleccion")
public final class TrainingByIdGetController {
	
	private final TrainingByIdHandler handler;
	
	public TrainingByIdGetController(TrainingByIdHandler handler) {
		this.handler = handler;
	}



	@GetMapping("/training/{id}")
	public ResponseEntity<TrainingDTO> getTrainingById(@PathVariable long id){
		TrainingDTO response = handler.execute(id);		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
