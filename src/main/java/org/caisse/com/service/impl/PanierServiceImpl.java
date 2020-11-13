package org.caisse.com.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import org.caisse.com.dto.OrangeDto;
import org.caisse.com.dto.PommeDto;
import org.caisse.com.service.OrangeService;
import org.caisse.com.service.PanierService;
import org.caisse.com.service.PommeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanierServiceImpl implements PanierService{

	@Autowired
	private OrangeService orangeService;
	@Autowired
	private PommeService pommeService;
	
	@Override
	public Double calculTotal() {
		List<PommeDto> pommes = pommeService.getAll();
		List<OrangeDto> oranges = orangeService.getAll();
		
		Double total =0.0;
		for (int i = 0; i < pommes.size(); i++) {
			total+=pommes.get(i).getPrix() * pommes.get(i).getQte();
		}
		for (int i = 0; i < oranges.size(); i++) {
			total+=oranges.get(i).getPrix() * oranges.get(i).getQte();
		}
		return total;
	}
	
	

}
