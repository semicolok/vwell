package com.injection.fire.service;

import java.util.List;

import com.injection.fire.domain.entity.Hospital;

public interface HospitalService {

	List<Hospital> searchByName(String name);

	List<Hospital> searchAround(Double lat, Double lng);

}
