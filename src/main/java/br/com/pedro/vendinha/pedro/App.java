package br.com.pedro.vendinha.pedro;

import java.math.BigDecimal;

import br.com.pedro.vendinha.domain.Cliente;
import br.com.pedro.vendinha.domain.Compra;
import br.com.pedro.vendinha.domain.ItemCompra;
import br.com.pedro.vendinha.domain.Produto;

public class App {
	
	public String data;

    public static void main(String[] args) {
    	
    	
       
    	Produto carro = new Produto("Carro", BigDecimal.valueOf(5000));
    	Produto moto = new Produto("Moto", BigDecimal.valueOf(2500));
    	Produto casa = new Produto("Casa", BigDecimal.valueOf(10000));
    	
    	Cliente pedro = new Cliente("Pedro");
    	
    	Compra compra1 = pedro.comprar(carro, 2);
    	compra1.addProduto(moto, 3);
    	compra1.addProduto(casa, 1);
    	BigDecimal troco = compra1.pagar(BigDecimal.valueOf(50));
    	
    	System.out.println("Cliente:  " + compra1.getCliente().getNome());
    	for(ItemCompra i : compra1.getItens()) {
    		System.out.println("Produto:  " + i.getProduto().getProduto());
    		System.out.println("Qtde:  " + i.getQtd());
    		System.out.println("Valor:  " + i.getProduto().getValorUni());
    		System.out.println("Qtde:  " + i.getQtd());
    		System.out.println("Data da compra: " + compra1.getDataCompra());
    	}
    	
    	System.out.println("Total:  " + compra1.getTotal());
    	System.out.println("Troco:  " + troco);
    	System.out.println("Data do Pagamento: " + compra1.);
    }
}
