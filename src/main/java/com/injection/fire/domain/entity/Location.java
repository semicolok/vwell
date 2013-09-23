package com.injection.fire.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.injection.fire.domain.dto.HealthCenterJson;
import com.injection.fire.domain.dto.HospitalJson;

@Getter @Setter
@Entity
@ToString(of={"id", "address", "lng", "lat"})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Location implements Serializable {
	private static final long serialVersionUID = -8366476853913702582L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 150)
	private String address;
	
	@Column(length = 150)
	private String newAddress;
	
	@Column(length = 150)
	private String buildingAddress;
	
	@Column(length = 20)
	private String mainAddress;
	
	@Column(length = 20)
	private String subAddress;
	
	@Column(length = 50)
	private String localName_1;
	
	@Column(length = 50)
	private String localName_2;
	
	@Column(length = 50)
	private String localName_3;
	
	private Double lng;
	private Double lat;
	
	private Double point_x;
	private Double point_y;
	
	@Column(length = 30)
	private String point_wx;
	@Column(length = 30)
	private String point_wy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTime;

	public Location(){}
	
	public Location(HospitalJson hospitalJson) {
		this.address = hospitalJson.getAddress();
		this.newAddress = hospitalJson.getNewAddress();
		this.buildingAddress = hospitalJson.getBuildingAddress();
		this.mainAddress = hospitalJson.getMainAddress();
		this.subAddress = hospitalJson.getSubAddress();
		this.localName_1 = hospitalJson.getLocalName_1();
		this.localName_2 = hospitalJson.getLocalName_2();
		this.localName_3 = hospitalJson.getLocalName_3();
		this.lng = hospitalJson.getLng();
		this.lat = hospitalJson.getLat();
		this.point_x = hospitalJson.getPoint_x();
		this.point_y = hospitalJson.getPoint_y();
		this.point_wx = hospitalJson.getPoint_wx();
		this.point_wy = hospitalJson.getPoint_wy();
		
		this.registTime = new Date();
		this.updatedTime = new Date();
	}

	public Location(HealthCenterJson healthCenterJson) {
		this.address = healthCenterJson.getAddress();
		this.newAddress = healthCenterJson.getNewAddress();
		this.buildingAddress = healthCenterJson.getBuildingAddress();
		this.mainAddress = healthCenterJson.getMainAddress();
		this.subAddress = healthCenterJson.getSubAddress();
		this.localName_1 = healthCenterJson.getLocalName_1();
		this.localName_2 = healthCenterJson.getLocalName_2();
		this.localName_3 = healthCenterJson.getLocalName_3();
		this.lng = healthCenterJson.getLng();
		this.lat = healthCenterJson.getLat();
		this.point_x = healthCenterJson.getPoint_x();
		this.point_y = healthCenterJson.getPoint_y();
		this.point_wx = healthCenterJson.getPoint_wx();
		this.point_wy = healthCenterJson.getPoint_wy();
		
		this.registTime = new Date();
		this.updatedTime = new Date();
	}
}
