package com.pacoteck.springboot.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacoteck.springboot.app.dto.Fabricante;

public interface FabricanteDAO extends JpaRepository<Fabricante, Integer>{

	public List<Fabricante> findAll();
	public void deleteById(int id);
}
