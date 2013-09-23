package com.injection.fire.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.google.common.collect.Sets;

@Getter @Setter
@Entity
@ToString(of={"id", "name", "mobileNumber", "enabled"})
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class User implements Serializable {
	private static final long serialVersionUID = 6627239276873585397L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 15)
	private String name;

	@Column(length = 15)
	private String mobileNumber;

	@Column(length = 10)
	private String gender;
	
	@Column(length = 10)
	private String bloodType;
	
	private Integer birthYear;
	private Integer birthMonth;
	private Integer birthDay;
	
	@Column(nullable = false, columnDefinition="int default 1")
	private boolean enabled;

	@Temporal(TemporalType.TIMESTAMP)
	private Date registTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTime;
	
	@Getter
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User parent; 
	
	@OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE }, orphanRemoval = true)
	@OrderBy("id asc")
	private Set<User> familyMembers = Sets.newHashSet();
}
