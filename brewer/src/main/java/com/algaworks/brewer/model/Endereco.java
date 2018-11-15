package com.algaworks.brewer.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Embeddable
public class Endereco implements Serializable{

	private static final long serialVersionUID = 771071517112760852L;
	
	private String logradouro;
	private String numero;
	private String complemento;
	private String cep;
	
	@Transient
	private Estado estado;
	
	@ManyToOne
	@JoinColumn(name = "codigo_cidade")
	private Cidade cidade;
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public String getNomeCidadeSiglaEstado() {
		if (this.cidade != null) {
			return this.cidade.getNome() + "/" + this.getCidade().getEstado().getSigla();
		}
		
		return null;
	}
}
