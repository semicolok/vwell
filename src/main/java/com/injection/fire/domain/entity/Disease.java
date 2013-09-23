package com.injection.fire.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Getter @Setter
@Entity
@ToString(of={"id", "name"})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Disease implements Serializable {
	private static final long serialVersionUID = 6551170724460670822L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(columnDefinition="TEXT")
	private String description;
	
	@Column(columnDefinition="TEXT")
	private String infectionRoot;
	
	@Column(columnDefinition="TEXT")
	private String symptom;
	
	@Column(columnDefinition="TEXT")
	private String cure;
	
	@Column(columnDefinition="TEXT")
	private String prevention;
	
	@Column(columnDefinition="TEXT")
	private String sideEffect;
	
	@Column(length = 250)
	private String link;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private Vaccine vaccine;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTime;
	
	public Disease(){}
}
