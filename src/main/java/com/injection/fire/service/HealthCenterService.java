package com.injection.fire.service;

import java.util.List;

import com.injection.fire.domain.entity.HealthCenter;

public interface HealthCenterService {

	List<HealthCenter> searchByName(String name);

	List<HealthCenter> searchAround(Double lat, Double lng);

}
