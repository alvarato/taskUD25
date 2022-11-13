package com.pacoteck.springboot.app.service;

import java.util.List;


import com.pacoteck.springboot.app.dto.Fabricante;

public interface IFabricanteService {
	
	public List<Fabricante> findALL();
	public void deleteById(int id);
	public void create(Fabricante fabricante);
	public void update(Fabricante fabricante);

}
