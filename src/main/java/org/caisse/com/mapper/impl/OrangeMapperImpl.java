package org.caisse.com.mapper.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.caisse.com.dto.OrangeDto;
import org.caisse.com.entities.Orange;
import org.caisse.com.mapper.OrangeMapperInterface;
import org.springframework.stereotype.Service;

@Service
public class OrangeMapperImpl implements OrangeMapperInterface{

	@Override
	public OrangeDto entityToDto(Orange orange) {
		if(orange == null) return null;
		OrangeDto dto = new OrangeDto();
		dto.setDescription(orange.getDescription());
		dto.setPrix(orange.getPrice());
		dto.setQte(orange.getQuantite());
		return dto;
	}

	@Override
	public Orange DtoToEntity(OrangeDto dto) {
		if(dto == null) return null;
		Orange orange = new Orange();
		orange.setDescription(dto.getDescription());
		orange.setPrice(dto.getPrix());
		orange.setQuantite(dto.getQte());
		return orange;
	}

	@Override
	public List<OrangeDto> entitiesToDtos(List<Orange> oranges) {
		/*List<OrangeDto> list = new ArrayList<>();
		for(Orange o : oranges) {
			OrangeDto d = entityToDto(o);
			list.add(d);
		}*/
		return oranges.stream().filter(Objects::nonNull).map(this::entityToDto).collect(Collectors.toList());
	}

	@Override
	public List<Orange> dtosToEntities(List<OrangeDto> orangeDto) {
		return orangeDto.stream().filter(Objects::nonNull).map(this::DtoToEntity).collect(Collectors.toList());
	}

}
