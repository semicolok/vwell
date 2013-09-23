package com.injection.fire;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.injection.fire.service.HealthCenterService;
import com.injection.fire.service.HospitalService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-appContext.xml" })
public class ServiceTest {
	@Value("${vwell.data.path}") private String dataFolderPath;
	
	@Inject private HealthCenterService healthCenterService;
	@Inject private HospitalService hospitalService;

	@Test
	public void test() {
	}
}