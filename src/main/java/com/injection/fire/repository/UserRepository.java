package com.injection.fire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.injection.fire.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long>, QueryDslPredicateExecutor<User> {
	
//	@Query(value = "SELECT DISTINCT zoneId, zoneDesc FROM UcloudVmProduct", nativeQuery = true)
//	List<Object[]> findZone();
//	
//	@Query(value = "SELECT os.templateId, (SELECT templateDesc FROM UcloudVmProduct p WHERE p.templateId=os.templateId GROUP BY p.templateId) AS templateDesc, os.osPriceByHour, os.osPriceByMonth, os.msSqlBscPrice, os.msSqlCPriceByHour, os.msSqlConPrice FROM UcloudOs os WHERE os.zoneId=?1 AND os.serverType=?2 ORDER BY  os.osPriceByHour, templateDesc", nativeQuery = true)
//	List<Object[]> findTemplates(String zoneId, String serverType);
//
//	@Query(value = "SELECT spec.serviceOfferingId, spec.diskOfferingId, (SELECT DISTINCT serviceOfferingDesc FROM UcloudVmProduct WHERE serviceOfferingId=spec.serviceOfferingId) AS seviceoferingDesc, spec.priceMonth, spec.priceTime, spec.totalStorageSize FROM UcloudSpec spec WHERE spec.zoneId=?1 AND spec.templateId=?2 AND spec.serverType=?3", nativeQuery = true)
//	List<Object[]> findSpecs(String zoneId, String templateId, String serverType);

}