package com.yucong.aes.service;

import com.yucong.aes.utils.AesResponse;

public interface AesService {

	public AesResponse testAes(String key, String securityMessage, String name, String password);
	
}
