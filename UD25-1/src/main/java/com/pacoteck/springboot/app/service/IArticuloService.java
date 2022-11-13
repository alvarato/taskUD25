package com.pacoteck.springboot.app.service;

import java.util.List;

import com.pacoteck.springboot.app.dto.Articulo;

public interface IArticuloService {
	
	public List<Articulo> findAll();
	public void deleteById(int id);
	public void create(Articulo articulo);
	public void update(Articulo articulo);

}
