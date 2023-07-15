package com.xworkz.reevaluation.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.reevaluation.dto.ReEvaluationDTO;
import com.xworkz.reevaluation.entity.ReEvaluationEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ReEvaluationServicesImpl implements ReEvaluationServices {
	
	ReEvaluationEntity entity = new ReEvaluationEntity();
	
	public ReEvaluationServicesImpl() {
		log.info("creating no-arg constructor using ReEvaluationServicesImpl!!!");
	}
	
	@Override
	public boolean validateAndSave(ReEvaluationDTO dto) {
		log.info("Running validateAndSave Method...");
		BeanUtils.copyProperties(dto, entity);
		log.info("Entity prints: "+entity);
		return true;
	}

}
