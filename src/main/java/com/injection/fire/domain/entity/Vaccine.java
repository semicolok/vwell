package com.injection.fire.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.google.common.collect.Lists;

@Getter @Setter
@Entity
@ToString(of={"id", "name"})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Vaccine implements Serializable {
	private static final long serialVersionUID = -6812602849289440126L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 100)
	private String name;

	private Integer number;
	private Integer totalNumber;
	
	private Integer startPeriod;
	private Integer endPeriod;

	private Integer age;
	
	@Column(length = 10)
	private String gender;
	
	@Column(nullable = false, columnDefinition = "int default 0")
	private boolean baby;
	
	@Column(nullable = false, columnDefinition = "int default 0")
	private boolean cycle;
	
	@Column(nullable = false, columnDefinition = "int default 0")
	private boolean optional;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTime;
	
	@JsonIgnore
	@OneToMany(mappedBy = "vaccine", targetEntity = Disease.class, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<Disease> diseases = Lists.newArrayList();
	
	public Vaccine(){}
}
