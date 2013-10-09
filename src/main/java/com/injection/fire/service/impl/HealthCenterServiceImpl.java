package com.injection.fire.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.injection.fire.domain.entity.HealthCenter;
import com.injection.fire.repository.HealthCenterRepository;
import com.injection.fire.service.HealthCenterService;

@Service
public class HealthCenterServiceImpl implements HealthCenterService{
	@Inject private HealthCenterRepository healthCenterRepository;

	@Override
	public List<HealthCenter> searchByName(String name) {
		List<HealthCenter> list = healthCenterRepository.findByNameLike("%"+name+"%");
		return list;
	}

	@Override
	public List<HealthCenter> searchAround(Double lat, Double lng) {
		return healthCenterRepository.searchAround(lat, lng);
	}
}
