package com.ps.app.query.handler;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.ps.domain.model.dto.TrainingDTO;
import com.ps.domain.port.dao.TrainingDAO;

@Component
public class TrainingByIdHandler {
	
    private final TrainingDAO dao;
    
    public TrainingByIdHandler( TrainingDAO dao) {
    	this.dao = dao;
    }

    public TrainingDTO execute(long id) {        
        return this.dao.getById(id);
    }
}
