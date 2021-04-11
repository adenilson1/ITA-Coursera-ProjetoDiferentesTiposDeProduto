import java.util.HashMap;
import java.util.Map;

/**
 * Parte III
 * Essa classe armazena o atributo interno do tipo HashMap()
 * cada produto adicionado no carrino
 * @author adenilson
 *
 */
public class CarrinhoDeCompra {
	
	// variavel do Map que armazenara o produto com um valor interio de tamanho
	private static Map<Produto, Integer> carrinho = new HashMap<>();
	// variavel do preço total da compra 
	private static double valorTotal = 0;
	//quantidade de produtos no carrinho
	private static int quantidadeNoCarrinho;
	
	//adiconando um produto
	public void adicinarProduto(Produto produto, int quantidade) {
		
		if(carrinho.containsKey(produto)) {
			carrinho.put(produto, quantidade);
			
			// caso exista, soma-se
		}else {
			carrinho.put(produto, quantidade);
			quantidadeNoCarrinho += quantidade;
		}		
	}
	
	// remover o produto e sua quantidade
	public void removerProduto(Produto produto, int quantidade) {
		
		if(carrinho.containsKey(produto)) {
			carrinho.remove(produto);
			quantidadeNoCarrinho -= quantidade;
			valorTotal = produto.getPrecoDoProduto() * quantidadeNoCarrinho;
		}
	}
	
	//preco total da compra
	public double ValorTotalCompra() {
		
		for(Produto produto : carrinho.keySet()) {
			valorTotal = produto.getPrecoDoProduto() * quantidadeNoCarrinho;
		}
		
		return valorTotal;
	}
	
	//lipeza do carrinho
	public void limpezaCarrinho() {
		carrinho.clear();
		quantidadeNoCarrinho = 0 ;
	}
	

	//Get e Set
	public static Map<Produto, Integer> getCarrinho() {
		return carrinho;
	}

	public static void setCarrinho(Map<Produto, Integer> carrinho) {
		CarrinhoDeCompra.carrinho = carrinho;
	}

	public static int getQuantidadeNoCarrinho() {
		return quantidadeNoCarrinho;
	}

	public static void setQuantidadeNoCarrinho(int quantidadeNoCarrinho) {
		CarrinhoDeCompra.quantidadeNoCarrinho = quantidadeNoCarrinho;
	}
	
}
