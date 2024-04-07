package com.api.pack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.pack.model.Model;
import com.api.pack.repository.Repo;

@RestController
public class Handler {
   
	@Autowired
	Repo repo;
	 
	@GetMapping(path="/api")
	public List<Model> all()
	{
		return repo.findAll();
	}
	
	@PostMapping(path="/api/save")//,consumes="applicatin/json" or "application/xml" optinal
	public Model save(@RequestBody Model model)
	{
		repo.save(model);
		return model;
	}
	
	@GetMapping(path="/api/{id}")
	public Optional<Model> one(@PathVariable int id)
	{
		return repo.findById(id);
	}
	
	@DeleteMapping(path="/api/delete/{id}")
	public String del(@PathVariable int id)
	{      
		repo.deleteById(id);
		return "deleted...";
	}
	
	
	
	
}
