package com.ps.infra.adapter.dao;

import com.ps.domain.model.dto.TrainingDTO;
import com.ps.domain.model.entity.Training;
import com.ps.domain.port.dao.TrainingDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class InMemoryTrainingDAO implements TrainingDAO {

    @Override
    public List<TrainingDTO> getAllTraining() {

        List<TrainingDTO> dtos = new ArrayList<>();

        dtos.add(new TrainingDTO("Basic Java"));
        dtos.add(new TrainingDTO("Hexagonal Architecture"));
        dtos.add(new TrainingDTO("The importance in navigation"));
        dtos.add(new TrainingDTO("The super me in existential dilemmas"));

        return dtos;
    }

	@Override
	public TrainingDTO getById(long id) {
		
		TrainingDTO dto = new TrainingDTO("Hello Word");
		return dto;
	}

	@Override
	public Training save(UUID id, String name, Integer duration) {
		// TODO Auto-generated method stub
		return null;
	}

}
