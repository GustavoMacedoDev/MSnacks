package br.com.macedo.sistemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.macedo.sistemas.entities.Lancamento;
import br.com.macedo.sistemas.repository.LancamentoRepository;

@CrossOrigin(origins  = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class LancamentoController {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@RequestMapping(value = "/lancamento", method = RequestMethod.GET)
	public @ResponseBody List<Lancamento> consultar() {
		
		return this.lancamentoRepository.findAll();
		
	}
	
	

}
