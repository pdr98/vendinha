package br.com.pedro.vendinha.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ItemCompra {
	
	private Produto produto;
	private Integer qtd;
	private BigDecimal total;
	
	public ItemCompra(Produto produto, Integer qtd) {
		this.qtd = qtd;
		this.produto = produto;
		this.total = produto.getValorUni().multiply(BigDecimal.valueOf(qtd));
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public Integer getQtd() {
		return qtd;
	}
	
	public BigDecimal getTotal() {
		return total;
	}
	
}
