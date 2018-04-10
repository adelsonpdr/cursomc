package com.adelson.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adelson.cursomc.domain.Estado;
import com.adelson.cursomc.repositories.EstadoRepository;
import com.adelson.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;
	
	public Estado buscar(Integer id) {
		Estado obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Estado não encontrado! Id: " 
					+ id + ", Tipo: " + Estado.class.getName());
		}
		return obj; 
	}
}
