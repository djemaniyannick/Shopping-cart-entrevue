package org.caisse.com.mapper;

import java.util.List;

import org.caisse.com.dto.OrangeDto;
import org.caisse.com.entities.Orange;


public interface OrangeMapperInterface {
	
	public OrangeDto entityToDto(Orange orange);
	public Orange DtoToEntity(OrangeDto dto);
	public List<OrangeDto> entitiesToDtos(List<Orange> orange);
	public List<Orange> dtosToEntities(List<OrangeDto> orangeDto);

}
