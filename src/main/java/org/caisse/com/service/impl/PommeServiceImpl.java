package org.caisse.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.caisse.com.dto.PommeDto;
import org.caisse.com.entities.Pomme;
import org.caisse.com.mapper.PommeMapperInterface;
import org.caisse.com.service.PommeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PommeServiceImpl implements PommeService{

	@Autowired
	private PommeMapperInterface pommeMap;
	
	List<Pomme> list = new ArrayList<>();
	@Override
	public PommeDto save(PommeDto dto) {
		list.add(pommeMap.DtoToEntity(dto));
		list.forEach(e -> System.err.println(e));
		return dto;
	}

	@Override
	public List<PommeDto> getAll() {
		return pommeMap.entitiesToDtos(list);
	}

}
