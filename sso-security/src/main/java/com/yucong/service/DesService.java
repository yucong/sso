package com.yucong.service;

import com.yucong.des.utils.DesResponse;

public interface DesService {

	public DesResponse testDes(String key, String securityMessage, String name, String password);
	
}
