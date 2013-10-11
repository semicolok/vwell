package com.injection.fire.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.injection.fire.domain.entity.Hospital;
import com.injection.fire.domain.entity.QHospital;
import com.injection.fire.repository.HospitalRepository;
import com.injection.fire.service.HospitalService;
import com.mysema.query.BooleanBuilder;

@Service
public class HospitalServiceImpl implements HospitalService {
	@Inject private HospitalRepository hospitalRepository;

	@Override
	public List<Hospital> searchByName(String name) {
		String searchValue = "%"+name+"%";
		QHospital qHospital = QHospital.hospital;
		
		BooleanBuilder builder = new BooleanBuilder();
		builder.or(qHospital.name.like(searchValue));
		builder.or(qHospital.location.address.like(searchValue));
		builder.or(qHospital.location.newAddress.like(searchValue));
		builder.or(qHospital.location.buildingAddress.like(searchValue));
		return (List<Hospital>) hospitalRepository.findAll(builder);
	}

	@Override
	public List<Hospital> searchAround(Double lat, Double lng) {
		return hospitalRepository.searchAround(lat, lng);
	}

}
