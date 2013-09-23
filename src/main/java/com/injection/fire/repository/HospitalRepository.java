package com.injection.fire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.injection.fire.domain.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long>, QueryDslPredicateExecutor<Hospital> {
}