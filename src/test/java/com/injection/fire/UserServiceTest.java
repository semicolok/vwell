package com.injection.fire;

import java.io.File;
import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-appContext.xml" })
public class UserServiceTest {
	@Value("${vwell.data.path}") private String dataFolderPath;

	@Test
	public void test() {
		
		addHealthCenterData();
//		addHospitalData();
	}

	private void addHospitalData() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			List<HospitalJson> hospitalJsons = mapper.readValue(new File(dataFolderPath+ "/hospital-unicode.json"), new TypeReference<List<HospitalJson>>() {});
			for (HospitalJson hospitalJson : hospitalJsons) {
				System.out.println(hospitalJson.getName());
				System.out.println(hospitalJson.getAddress());
				System.out.println(hospitalJson.getPhone());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addHealthCenterData() {
		try {
			ObjectMapper mapper = new ObjectMapper();
//			List<HealthCenterJson> healthCenterJsons = getJsonData("/healthCenter-unicode.json", HealthCenterJson.class);
			List<HealthCenterJson> healthCenterJsons = mapper.readValue(new File(dataFolderPath+ "/healthCenter-unicode.json"), new TypeReference<List<HealthCenterJson>>() {});
			for (HealthCenterJson healthCenterJson : healthCenterJsons) {
				System.out.println(healthCenterJson.getName());
				System.out.println(healthCenterJson.getAddress());
				System.out.println(healthCenterJson.getPhone().get(0));
				System.out.println(healthCenterJson.getPhone().get(1));
			}
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

	@Setter @Getter
	@JsonIgnoreProperties(ignoreUnknown = true, value={ "hibernateLazyInitializer", "handler" })
	static class HealthCenterJson implements Serializable{
		private static final long serialVersionUID = -8092446409280332613L;
		
		private String name;
		private List<String> phone;
		private String address;
		private String home_page;
		private String newAddress;
		private String buildingAddress;
		private String mainAddress;
		private String subAddress;
		private String localName_1;
		private String localName_2;
		private String localName_3;
		private double lng;
		private double lat;
		private double point_x;
		private double point_y; 
		private String point_wx;
		private String point_wy;
	}
	
	@Setter @Getter
	@JsonIgnoreProperties(ignoreUnknown = true, value={ "hibernateLazyInitializer", "handler" })
	static class HospitalJson implements Serializable{
		private static final long serialVersionUID = -8092446409280332613L;
		
		private String name;
		private String phone;
		private String address;
		private String newAddress;
		private String buildingAddress;
		private String mainAddress;
		private String subAddress;
		private String localName_1;
		private String localName_2;
		private String localName_3;
		private double lng;
		private double lat;
		private double point_x;
		private double point_y; 
		private String point_wx;
		private String point_wy;
	}
}