package org.caisse.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.caisse.com.dto.OrangeDto;
import org.caisse.com.entities.Orange;
import org.caisse.com.mapper.OrangeMapperInterface;
import org.caisse.com.service.OrangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrangeServiceImpl implements OrangeService{

	@Autowired
	private OrangeMapperInterface orangeMap;
	
	List<Orange> oranges = new ArrayList<>();
	@Override
	public OrangeDto save(OrangeDto dto) {
		oranges.add(orangeMap.DtoToEntity(dto));
		return dto;
	}

	@Override
	public List<OrangeDto> getAll() {
		// TODO Auto-generated method stub
		return orangeMap.entitiesToDtos(oranges);
	}

}
