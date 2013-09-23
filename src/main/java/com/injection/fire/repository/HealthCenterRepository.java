package com.injection.fire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.injection.fire.domain.entity.HealthCenter;

public interface HealthCenterRepository extends JpaRepository<HealthCenter, Long>, QueryDslPredicateExecutor<HealthCenter> {
}