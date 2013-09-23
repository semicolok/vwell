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

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Getter @Setter
@Entity
@ToString(of={"id", "name", "homePageLink"})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class HealthCenter implements Serializable {
	private static final long serialVersionUID = 5909933514214539603L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 20)
	private String name;

	@Column(length = 15)
	private String phone;
	
	@Column(length = 15)
	private String injectionRoomPhone;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Location location;
	
	@Column(length = 30)
	private String homePageLink;

	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTime;

}
