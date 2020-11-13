package org.caisse.com.mapper.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.caisse.com.dto.PommeDto;
import org.caisse.com.entities.Pomme;
import org.caisse.com.mapper.PommeMapperInterface;
import org.springframework.stereotype.Service;

@Service
public class PommeMapperImpl implements PommeMapperInterface{

	@Override
	public PommeDto entityToDto(Pomme pomme) {
		if(pomme == null) return null;
		PommeDto dto = new PommeDto();
		dto.setColor(pomme.getColor());
		dto.setPrix(pomme.getPrice());
		dto.setQte(pomme.getQuantite());
		return dto;
	}

	@Override
	public Pomme DtoToEntity(PommeDto dto) {
		if(dto == null) return null;
		Pomme p = new Pomme();
		p.setColor(dto.getColor());
		p.setPrice(dto.getPrix());
		p.setQuantite(dto.getQte());
		return p;
	}

	@Override
	public List<PommeDto> entitiesToDtos(List<Pomme> pommes) {
		// TODO Auto-generated method stub
		return pommes.stream().filter(Objects::nonNull).map(this::entityToDto).collect(Collectors.toList());
	}

	@Override
	public List<Pomme> dtosToEntities(List<PommeDto> pommesDto) {
		// TODO Auto-generated method stub
		return pommesDto.stream().filter(Objects::nonNull).map(this::DtoToEntity).collect(Collectors.toList());
	}


}
