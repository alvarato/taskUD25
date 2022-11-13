package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.FabricanteDAO;
import com.pacoteck.springboot.app.dto.Fabricante;

@Service
public class FabricanteServiceImp implements IFabricanteService{
	
	@Autowired
	FabricanteDAO dao;

	@Override
	public List<Fabricante> findALL() {
		return dao.findAll();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public void create(Fabricante fabricante) {
		dao.save(fabricante);
		
	}

	@Override
	public void update(Fabricante fabricante) {
		List<Fabricante> aux = dao.findAll();
		for (Fabricante fab : aux) {
			if(fab.getCodigo() == fabricante.getCodigo()) {
				dao.save(fabricante);
			}
		}
		
	}

}
