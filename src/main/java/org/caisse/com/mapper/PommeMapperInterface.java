package org.caisse.com.mapper;

import java.util.List;

import org.caisse.com.dto.PommeDto;
import org.caisse.com.entities.Pomme;

public interface PommeMapperInterface {
	public PommeDto entityToDto(Pomme pomme);
	public Pomme DtoToEntity(PommeDto dto);
	public List<PommeDto> entitiesToDtos(List<Pomme> pommes);
	public List<Pomme> dtosToEntities(List<PommeDto> pommesDto);
	
}
