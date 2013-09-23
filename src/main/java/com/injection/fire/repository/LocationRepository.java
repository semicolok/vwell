package com.injection.fire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.injection.fire.domain.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long>, QueryDslPredicateExecutor<Location> {
}