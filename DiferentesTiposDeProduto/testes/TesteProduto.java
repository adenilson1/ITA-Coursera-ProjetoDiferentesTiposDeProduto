import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProduto {
	
	Produto produto1;
	Produto produto2;
	Produto produto3;
	Produto produto4;
	Produto produto5;
	
	@Before
	public void inicializando() { // nome, codigo, preço
		produto1 = new Produto("Camisa", 12, 10.0);
		produto2 = new Produto("Calça", 12, 25.0);
		produto3 = new Produto("Luva", 111, 30.0);
		produto4 = new Produto("Meia", 1, 50.0);
		produto5 = new Produto("Luva", 11, 80.0);
	}
	

	@Test
	//codigos iguais
	public void testPrdotudoIguais() {
		assertEquals(true, produto2.equals(produto1));
	}
	
	@Test
	//codigos diferentes
	public void testProdutoDiferentes() {
		assertEquals(false, produto5.equals(produto3));
	}

}
