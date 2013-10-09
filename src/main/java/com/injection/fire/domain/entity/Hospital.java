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

import com.injection.fire.domain.dto.HospitalJson;

@Getter @Setter
@Entity
@ToString(of={"id", "name"})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Hospital implements Serializable {
	private static final long serialVersionUID = -7314084834573260467L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 100)
	private String name;

	@Column(length = 30)
	private String phone;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Location location;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTime;
	
	@Transient
	private double distance;
	
	public Hospital(){}
	
	public Hospital(HospitalJson hospitalJson) {
		this.name = hospitalJson.getName();
		this.phone = hospitalJson.getPhone();
		this.location = new Location(hospitalJson);
		this.registTime = new Date();
		this.updatedTime = new Date();
	}
}
