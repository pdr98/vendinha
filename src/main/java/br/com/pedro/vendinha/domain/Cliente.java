package br.com.pedro.vendinha.domain;

public class Cliente {
	
	private String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Compra comprar(Produto produto, Integer qtd) {
		return new Compra(this, produto, qtd);
	}

}
