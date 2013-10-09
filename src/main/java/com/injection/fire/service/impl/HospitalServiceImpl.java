package com.injection.fire.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.injection.fire.domain.entity.Hospital;
import com.injection.fire.repository.HospitalRepository;
import com.injection.fire.service.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService {
	@Inject private HospitalRepository hospitalRepository;

	@Override
	public List<Hospital> searchByName(String name) {
		return hospitalRepository.findByNameLike("%"+name+"%");
	}

	@Override
	public List<Hospital> searchAround(Double lat, Double lng) {
		return hospitalRepository.searchAround(lat, lng);
	}

}
