package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pacoteck.springboot.app.dto.Articulo;
import com.pacoteck.springboot.app.service.ArticuloServiceImp;

@RestController
@RequestMapping("/articulos")
public class ArticuloController {
	
	@Autowired
	ArticuloServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Articulo> findAll() {
		return imp.findAll();
	}
	
	@PutMapping("/delete{codigo}")
	public void deleteById(@PathVariable("codigo")int codigo) {
		imp.deleteById(codigo);
	}
	
	@PutMapping("/create")
	public void create(@RequestBody Articulo articulo) {
		imp.create(articulo);
	}
	
	@PutMapping("/update")
	public void delte(@RequestBody Articulo articulo) {
		imp.update(articulo);
	}

}
