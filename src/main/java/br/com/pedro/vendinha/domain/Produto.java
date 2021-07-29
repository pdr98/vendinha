package br.com.pedro.vendinha.domain;

import java.math.BigDecimal;

public class Produto {

	private String produto;
	private BigDecimal valorUni;
	
	public Produto(String produto, BigDecimal valorUni) {
		this.produto = produto;
		this.valorUni = valorUni;
	}
	
	public String getProduto() {
		return produto;
	}
	
	public BigDecimal getValorUni() {
		return valorUni;
	}
	
}
