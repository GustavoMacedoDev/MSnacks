package br.com.macedo.sistemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.macedo.sistemas.entities.Produto;
import br.com.macedo.sistemas.model.ResponseModel;
import br.com.macedo.sistemas.repository.ProdutoRepository;

@CrossOrigin(origins  = "http://192.168.0.103:4200" )
@RestController
@RequestMapping("/service")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@RequestMapping(value="/produto", method = RequestMethod.GET)
	public @ResponseBody List<Produto> consultar(){
		
		return this.produtoRepository.findAll();
	}

	@CrossOrigin
	@RequestMapping(value="/produto/{idProduto}", method = RequestMethod.DELETE)
	public @ResponseBody ResponseModel excluir(@PathVariable("idProduto") Long idProduto){
		
		Produto produto = produtoRepository.getOne(idProduto);
		
		try {
			
			produtoRepository.delete(produto);
			
			return new ResponseModel(1, "Registro excluido com sucesso!");
			
		}catch(Exception e) {
			return new ResponseModel(0, e.getMessage());
		}
	}
	
}
