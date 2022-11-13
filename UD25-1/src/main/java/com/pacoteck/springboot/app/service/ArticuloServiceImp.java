package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.ArticuloDAO;
import com.pacoteck.springboot.app.dto.Articulo;

@Service
public class ArticuloServiceImp implements IArticuloService{
	
	@Autowired
	ArticuloDAO dao;

	@Override
	public List<Articulo> findAll() {
		return dao.findAll();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public void create(Articulo articulo) {
		dao.save(articulo);
		
	}

	@Override
	public void update(Articulo articulo) {
		List<Articulo> aux = dao.findAll();
		for (Articulo art : aux) {
			if(articulo.getCodigo() == art.getCodigo()) {
				dao.save(articulo);
			}
		}
		
	}

}
