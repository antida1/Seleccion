package com.ps.domain.port.dao;

import com.ps.domain.model.dto.TrainingDTO;

import java.util.List;
import java.util.UUID;

public interface TrainingDAO {

    List<TrainingDTO> getAllTraining();
    
    TrainingDTO getById(long id);
}
