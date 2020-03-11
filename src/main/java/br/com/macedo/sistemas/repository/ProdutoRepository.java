package br.com.macedo.sistemas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.macedo.sistemas.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findAll();
	
	Produto getOne(Long id);
	
	
}
