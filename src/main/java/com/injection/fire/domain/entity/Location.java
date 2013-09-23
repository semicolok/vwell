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

@Getter @Setter
@Entity
@ToString(of={"id", "address", "lng", "lat"})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Location implements Serializable {
	private static final long serialVersionUID = -8366476853913702582L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 40)
	private String address;
	
	@Column(length = 40)
	private String newAddress;
	
	@Column(length = 40)
	private String buildingAddress;
	
	@Column(length = 10)
	private String mainAddress;
	
	@Column(length = 10)
	private String subAddress;
	
	@Column(length = 20)
	private String localName_1;
	
	@Column(length = 20)
	private String localName_2;
	
	@Column(length = 20)
	private String localName_3;
	
	private Double lng;
	private Double lat;
	
	private Double point_x;
	private Double point_y;
	
	@Column(length = 20)
	private String point_wx;
	@Column(length = 20)
	private String point_wy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTime;

}
