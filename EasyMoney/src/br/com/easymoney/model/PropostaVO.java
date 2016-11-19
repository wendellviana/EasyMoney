package br.com.easymoney.model;

import java.io.Serializable;


public class PropostaVO implements Serializable{

	private static final long serialVersionUID = 5548342371639382931L;
	
	private Integer id;
	private Integer banco;
	private Integer agencia;
	private String digitoAgencia;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBanco() {
		return banco;
	}
	public void setBanco(Integer banco) {
		this.banco = banco;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public String getDigitoAgencia() {
		return digitoAgencia;
	}
	public void setDigitoAgencia(String digitoAgencia) {
		this.digitoAgencia = digitoAgencia;
	}
	
}
