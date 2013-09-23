package com.injection.fire;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.injection.fire.domain.dto.HealthCenterJson;
import com.injection.fire.domain.dto.HospitalJson;
import com.injection.fire.domain.entity.HealthCenter;
import com.injection.fire.domain.entity.Hospital;
import com.injection.fire.repository.HealthCenterRepository;
import com.injection.fire.repository.HospitalRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-appContext.xml" })
public class AddJsonDataTest {
	@Value("${vwell.data.path}") private String dataFolderPath;
	
	@Inject private HealthCenterRepository healthCenterRepository;
	@Inject private HospitalRepository hospitalRepository;

	@Test
	public void test() {
		
//		addHealthCenterData();
		addHospitalData();
	}

	private void addHospitalData() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			List<HospitalJson> hospitalJsons = mapper.readValue(new File(dataFolderPath+ "/hospital-unicode.json"), new TypeReference<List<HospitalJson>>() {});
			List<Hospital> hospitals = new ArrayList<Hospital>(hospitalJsons.size());
			for (HospitalJson hospitalJson : hospitalJsons) {
				hospitals.add(new Hospital(hospitalJson));
			}
			hospitalRepository.save(hospitals);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addHealthCenterData() {
		try {
			ObjectMapper mapper = new ObjectMapper();
//			List<HealthCenterJson> healthCenterJsons = getJsonData("/healthCenter-unicode.json", HealthCenterJson.class);
			List<HealthCenterJson> healthCenterJsons = mapper.readValue(new File(dataFolderPath+ "/healthCenter-unicode.json"), new TypeReference<List<HealthCenterJson>>() {});
			List<HealthCenter> healthCenters = new ArrayList<HealthCenter>(healthCenterJsons.size());
			for (HealthCenterJson healthCenterJson : healthCenterJsons) {
				healthCenters.add(new HealthCenter(healthCenterJson));
			}
			healthCenterRepository.save(healthCenters);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private <T> List<T> getJsonData(String filePath, Class<T> clazz) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(new File(dataFolderPath+ filePath), new TypeReference<List<T>>() {});
		} catch (Exception e) {e.printStackTrace();}
		return null;
	}
}