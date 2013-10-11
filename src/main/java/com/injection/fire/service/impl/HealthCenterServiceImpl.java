package com.injection.fire.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.injection.fire.domain.entity.HealthCenter;
import com.injection.fire.domain.entity.QHealthCenter;
import com.injection.fire.repository.HealthCenterRepository;
import com.injection.fire.service.HealthCenterService;
import com.mysema.query.BooleanBuilder;

@Service
public class HealthCenterServiceImpl implements HealthCenterService{
	@Inject private HealthCenterRepository healthCenterRepository;

	@Override
	public List<HealthCenter> searchByName(String name) {
		String searchValue = "%"+name+"%";
		QHealthCenter qHealthCenter = QHealthCenter.healthCenter;
		
		BooleanBuilder builder = new BooleanBuilder();
		builder.or(qHealthCenter.name.like(searchValue));
		builder.or(qHealthCenter.location.address.like(searchValue));
		builder.or(qHealthCenter.location.newAddress.like(searchValue));
		builder.or(qHealthCenter.location.buildingAddress.like(searchValue));
		return (List<HealthCenter>) healthCenterRepository.findAll(builder);
	}

	@Override
	public List<HealthCenter> searchAround(Double lat, Double lng) {
		return healthCenterRepository.searchAround(lat, lng);
	}
}
