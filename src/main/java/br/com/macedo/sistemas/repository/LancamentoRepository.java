package br.com.macedo.sistemas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.macedo.sistemas.entities.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
