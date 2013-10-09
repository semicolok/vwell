package com.injection.fire.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.injection.fire.service.HealthCenterService;
import com.injection.fire.service.HospitalService;
import com.injection.fire.service.SearchService;

@Controller
public class SearchController {
	@Inject private HealthCenterService healthCenterService;
	@Inject private HospitalService hospitalService;
	@Inject private SearchService searchService;

	
	@RequestMapping(value = "/health/{name}", method = RequestMethod.GET)
	public void searchByName(@PathVariable String name, ModelMap map) {
		map.put("data", healthCenterService.searchByName(name));
	}
	
	@RequestMapping(value = "/hospital/{name}", method = RequestMethod.GET)
	public void searchHospitalByName(@PathVariable String name, ModelMap map) {
		map.put("data", hospitalService.searchByName(name));
	}
	
	@RequestMapping(value = "/around", method = RequestMethod.GET)
	public void searchByName(Double lat, Double lng, ModelMap map) {
		map.put("data", searchService.searchAround(lat, lng));
	}
}