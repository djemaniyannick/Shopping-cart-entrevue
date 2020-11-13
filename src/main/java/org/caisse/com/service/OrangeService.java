package org.caisse.com.service;

import java.util.List;

import org.caisse.com.dto.OrangeDto;

public interface OrangeService {
	
	public OrangeDto save(OrangeDto dto);
	public List<OrangeDto> getAll();

}
