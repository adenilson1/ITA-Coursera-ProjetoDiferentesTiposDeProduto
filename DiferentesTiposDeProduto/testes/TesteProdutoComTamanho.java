import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {
	
	ProdutoComTamanho produto1;
	ProdutoComTamanho produto2;
	ProdutoComTamanho produto3;
	ProdutoComTamanho produto4;
	ProdutoComTamanho produto5;
	
	@Before
	public void inicializa() {//nome, codigo, preco, tamanho
		produto1 = new ProdutoComTamanho("Bermuda", 12, 35.0, 45);
		produto2 = new ProdutoComTamanho("Bermuda", 12, 55.0, 25);
		produto3 = new ProdutoComTamanho("Chinela", 17, 75.0, 40);
		produto4 = new ProdutoComTamanho("Tenis", 12, 60.0, 45);
		produto5 = new ProdutoComTamanho("Camisa", 18, 35.0, 45);
	}

	@Test
	public void testProdutosComCodigoETamanhoIguais() {
		assertEquals(true, produto1.equals(produto4));
	}
	
	@Test
	public void testProdutosComCodigoETamanhoDiferentes() {
		assertEquals(false, produto1.equals(produto3));
	}
	
	@Test
	public void testProdutosComCodigoIgualETamanhoDiferente() {
		assertEquals(false, produto1.equals(produto2));
	}
	
	@Test
	public void testProdutosComCodigoDiferenteETamanhoIgual() {
		assertEquals(false, produto1.equals(produto5));
	}
	
	

}
