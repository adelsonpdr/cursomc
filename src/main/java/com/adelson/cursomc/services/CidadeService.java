package com.adelson.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adelson.cursomc.domain.Cidade;
import com.adelson.cursomc.repositories.CidadeRepository;
import com.adelson.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;
	
	public Cidade buscar(Integer id) {
		Cidade obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Cidade não encontrada! Id: " 
					+ id + ", Tipo: " + Cidade.class.getName());
		}
		return obj; 
	}
}
