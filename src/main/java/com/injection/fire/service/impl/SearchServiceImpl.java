package com.injection.fire.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.injection.fire.domain.entity.HealthCenter;
import com.injection.fire.domain.entity.Hospital;
import com.injection.fire.service.HealthCenterService;
import com.injection.fire.service.HospitalService;
import com.injection.fire.service.SearchService;
import com.injection.fire.support.util.LocationUtil;

@Service
public class SearchServiceImpl implements SearchService{
	@Inject private HealthCenterService healthCenterService;
	@Inject private HospitalService hospitalService;
	
	@Override
	public Object searchAround(Double lat, Double lng) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<HealthCenter> healthCenters = healthCenterService.searchAround(lat, lng);
		for (HealthCenter healthCenter : healthCenters) {
			healthCenter.setDistance(LocationUtil.getKilometers(lat, lng, healthCenter.getLocation().getLat(), healthCenter.getLocation().getLng()));
		}
		result.put("healthCenters", healthCenters);
		List<Hospital> hospitals = hospitalService.searchAround(lat, lng);
		for (Hospital hospital : hospitals) {
			hospital.setDistance(LocationUtil.getKilometers(lat, lng, hospital.getLocation().getLat(), hospital.getLocation().getLng()));
		}
		result.put("hospitals", hospitals);
		return result;
	}
}
