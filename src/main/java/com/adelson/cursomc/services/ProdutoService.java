package com.adelson.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adelson.cursomc.domain.Categoria;
import com.adelson.cursomc.domain.Produto;
import com.adelson.cursomc.repositories.ProdutoRepository;
import com.adelson.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public Produto buscar(Integer id) {
		Produto obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Produto não encontrado! Id: " 
					+ id + ", Tipo: " + Produto.class.getName());
		}
		return obj; 
	}
}
