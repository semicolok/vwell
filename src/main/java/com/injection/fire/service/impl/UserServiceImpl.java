package com.injection.fire.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.injection.fire.service.UserService;

@Service
public class UserServiceImpl implements UserService {
//	private static final String[] KEYS_SPECS = {"serviceOfferingId", "diskOfferingId", "seviceoferingDesc", "priceMonth", "priceTime", "totalStorageSize" };
//	private static final String[] KEYS_TEMPLATES = {"templateId", "templateDesc", "osPriceByHour", "osPriceByMonth", "msSqlBscPrice", "msSqlCPriceByHour", "msSqlConPrice" };
	
	
//	@Override
//	@Cacheable(value = "cache:ucloud:spec", key = "")
//	public Object getSpecList(String zoneId, String templateId, String serverType) {
//		return getHashList(ucloudVmProductRepository.findSpecs(zoneId, templateId, serverType), "specs", KEYS_SPECS);
//	}
	
//	@Cacheable(value = "cache:cabinet", key = "''.concat(#cabinetType).concat(':').concat(#user.id).concat(':').concat(#pageStatus.pageNumber)")
	private Map<String, Object> getHashList(List<Object[]> queryResults, String name, String...keys){
		Map<String, Object> result = new HashMap<String, Object>();
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for(Object[] obj : queryResults){
			Map<String, Object> map = new HashMap<String, Object>();
			for(int i = 0; i<keys.length; i++){
				map.put(keys[i], obj[i]);
			}
			list.add(map);
		}
		
		result.put(name, list);
		result.put("count", list.size());
		return result;
	}

}
