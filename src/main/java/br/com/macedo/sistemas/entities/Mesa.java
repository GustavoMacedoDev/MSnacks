/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.macedo.sistemas.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name = "mesa")
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mesa_id")
    private Long mesaId;
    @Size(max = 255)
    @Column(name = "numero_mesa", nullable = false)
    private String numeroMesa;
    @Column(name = "status_mesa")
    private Integer statusMesa;
    
    @Column(scale = 12, precision = 2, name = "valor_pago")
    private Double valorPago;
    
    @Column(scale = 12, precision = 2, name = "valor_total")
    private Double valorTotal;
    
    @OneToMany(mappedBy = "mesa", fetch = FetchType.EAGER)
    private List<Lancamento> lancamentos;
    
    public Mesa() {
    }

    public Mesa(Long mesaId) {
        this.mesaId = mesaId;
    }

    public Long getMesaId() {
        return mesaId;
    }

    public void setMesaId(Long mesaId) {
        this.mesaId = mesaId;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public Integer getStatusMesa() {
        return statusMesa;
    }

    public void setStatusMesa(Integer statusMesa) {
        this.statusMesa = statusMesa;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
