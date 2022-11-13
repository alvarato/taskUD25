package com.pacoteck.springboot.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pacoteck.springboot.app.dto.Articulo;

public interface ArticuloDAO extends JpaRepository<Articulo, Integer>{

	public List<Articulo> findAll();
	public void deleteById(int id);
}
