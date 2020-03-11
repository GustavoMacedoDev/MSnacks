package br.com.macedo.sistemas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.macedo.sistemas.entities.Mesa;

public interface MesaRepository extends JpaRepository<Mesa, Long>{

	@Query("SELECT m FROM Mesa m order by m.numeroMesa ASC")
	List<Mesa> findAllByMesaIdOrderBynumeroMesaAsc();
	
	
 
}
