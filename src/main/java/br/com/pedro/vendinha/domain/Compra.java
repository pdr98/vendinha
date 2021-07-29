package br.com.pedro.vendinha.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Compra {

	private Cliente cliente;
	private List<ItemCompra> itens;
	private LocalDateTime dataCompra;
	private LocalDateTime dataPagamento;
	private LocalDateTime dataCancelamento;
	private Status_Compra status;
	private BigDecimal valorPago;
	
	public Compra(Cliente cliente, Produto produto, Integer qtd) {
		this.cliente = cliente;
		this.itens = new ArrayList<>();
		this.addProduto(produto, qtd);
		this.dataCompra = LocalDateTime.now();
		this.status = Status_Compra.AGUARDANDO;
	}
	
	public void addProduto(Produto produto, Integer qtd) {
		this.itens.add(new ItemCompra(produto, qtd));
	}
	
	public void cancelar() {
		this.status = Status_Compra.CANCELADO;
		this.dataCancelamento = LocalDateTime.now();
		// se tiver sido pago calcula o estorno
	}
	
	public BigDecimal pagar(BigDecimal dinheiro) {
		//validar o valor
		this.status = Status_Compra.PAGO;
		this.dataPagamento = LocalDateTime.now();
		this.valorPago = dinheiro;
		return dinheiro.subtract(this.getTotal());
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public List<ItemCompra> getItens() {
		return itens;
	}
	
	public BigDecimal getTotal() {
		BigDecimal soma = BigDecimal.ZERO;
		
		for(ItemCompra i : itens) {
		soma = soma.add(i.getTotal()); 
		}
		return soma;
	}
	public LocalDateTime getDataCompra() {
		return dataCompra; 
	}
	
	
}
