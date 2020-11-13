package org.caisse.com.service;

import java.util.List;

import org.caisse.com.dto.PommeDto;

public interface PommeService {
	
	public PommeDto save(PommeDto dto);
	public List<PommeDto> getAll();

}
