package br.com.macedo.sistemas.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "lancamento")
public class Lancamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_lancamento")
	private Long idLancamento;
	
	 @JoinColumn(name = "mesa_mesa_id", referencedColumnName = "mesa_id")
	 @ManyToOne
	 private Mesa mesa;

	 public Lancamento() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdLancamento() {
		return idLancamento;
	}

	public void setIdLancamento(Long idLancamento) {
		this.idLancamento = idLancamento;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	 
	 
}
