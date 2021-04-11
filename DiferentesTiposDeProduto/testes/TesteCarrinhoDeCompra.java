import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompra {
	
	ProdutoComTamanho produto1;
	ProdutoComTamanho produto2;
	CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
	
	@Before
	public void inicializa() {
		produto1 = new ProdutoComTamanho("Camisa",12,10.0,15);
		produto2 = new ProdutoComTamanho("Sapato",13,10.0,15);
		carrinho.limpezaCarrinho();
		
	}

	@Test
	public void testPrecoDaCompra() {
		carrinho.adicinarProduto(produto1, 2);
		carrinho.adicinarProduto(produto2, 3);
		
		assertEquals(50,carrinho.ValorTotalCompra(),0.0);

	}
	
	@Test
	public void testRemoverProduto() {
		carrinho.adicinarProduto(produto1, 10);
		carrinho.adicinarProduto(produto2, 5);
		
		carrinho.removerProduto(produto1, 4);
		carrinho.removerProduto(produto2, 1);
		
		assertEquals(100,carrinho.ValorTotalCompra(),0.0);

	}	

}
