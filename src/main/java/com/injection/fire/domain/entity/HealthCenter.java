package com.injection.fire.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.injection.fire.domain.dto.HealthCenterJson;

@Getter @Setter
@Entity
@ToString(of={"id", "name", "homePageLink"})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class HealthCenter implements Serializable {
	private static final long serialVersionUID = 5909933514214539603L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 100)
	private String name;

	@Column(length = 30)
	private String phone;
	
	@Column(length = 30)
	private String injectionRoomPhone;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Location location;
	
	@Column(length = 100)
	private String homePageLink;

	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTime;
	
	@Transient
	private double distance;

	public HealthCenter() {}
	
	public HealthCenter(HealthCenterJson healthCenterJson) {
		this.name = healthCenterJson.getName();
		this.phone = healthCenterJson.getPhone().get(0);
		this.injectionRoomPhone = healthCenterJson.getPhone().get(1);
		this.homePageLink = healthCenterJson.getHome_page();
		this.location = new Location(healthCenterJson);
		this.registTime = new Date();
		this.updatedTime = new Date();
	}
	
//	public Map<String, Object> getFieldMap() {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("id", this.getId());
//		map.put("name", this.getName());
//		map.put("injectionRoomPhone", this.getPhoneNumber());
//		map.put("homePageLink", this.getRegistTime());
//		map.put("updatedTime", this.getUpdatedTime());
//		return map;
//	}
	
}
