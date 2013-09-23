package com.injection.fire.domain.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Setter @Getter
@JsonIgnoreProperties(ignoreUnknown = true, value={ "hibernateLazyInitializer", "handler" })
public class HealthCenterJson implements Serializable{
	private static final long serialVersionUID = 939306139124975336L;
	
	private String name;
	private List<String> phone;
	private String address;
	private String home_page;
	private String newAddress;
	private String buildingAddress;
	private String mainAddress;
	private String subAddress;
	private String localName_1;
	private String localName_2;
	private String localName_3;
	private double lng;
	private double lat;
	private double point_x;
	private double point_y; 
	private String point_wx;
	private String point_wy;
}
