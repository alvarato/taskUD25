package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pacoteck.springboot.app.dto.Fabricante;
import com.pacoteck.springboot.app.service.FabricanteServiceImp;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Fabricante> findAll() {
		return imp.findALL();
	}
	
	@PutMapping("/delete{codigo}")
	public void deleteById(@PathVariable("codigo")int codigo) {
		imp.deleteById(codigo);
	}
	
	@PutMapping("/create")
	public void create(@RequestBody Fabricante fabricante) {
		imp.create(fabricante);
	}
	
	@PutMapping("/update")
	public void delte(@RequestBody Fabricante fabricante) {
		imp.update(fabricante);
	}

}
