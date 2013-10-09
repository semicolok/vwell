package com.injection.fire.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.injection.fire.domain.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long>, QueryDslPredicateExecutor<Hospital> {

	List<Hospital> findByNameLike(String string);
	
	@Query(value = "SELECT * FROM `Hospital` as hp INNER JOIN (SELECT id, (3959 * acos(cos(radians(?1)) * cos(radians(lo.lat)) * cos(radians(lo.lng) - radians(?2)) + sin(radians(?1)) * sin(radians(lo.lat)))) AS distance FROM `Location` AS lo HAVING distance < 10 ORDER BY distance asc LIMIT 0 , 10) as locate ON hp.location_id = locate.id", nativeQuery = true)
	List<Hospital> searchAround(Double lat, Double lng);
}