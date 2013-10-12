package com.injection.fire.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.injection.fire.domain.entity.HealthCenter;

public interface HealthCenterRepository extends JpaRepository<HealthCenter, Long>, QueryDslPredicateExecutor<HealthCenter> {

	List<HealthCenter> findByNameLike(String name);

	@Query(value = "SELECT * FROM `HealthCenter` as hp INNER JOIN (SELECT id, (3959 * acos(cos(radians(?1)) * cos(radians(lo.lat)) * cos(radians(lo.lng) - radians(?2)) + sin(radians(?1)) * sin(radians(lo.lat)))) AS distance FROM `Location` AS lo HAVING distance < 5 ORDER BY distance asc) as locate ON hp.location_id = locate.id", nativeQuery = true)
	List<HealthCenter> searchAround(Double lat, Double lng);
}