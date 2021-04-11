/**
 * parte II
 * Essa classe é estendida da classe Produto, tendo a informação de adicional de tamanho.  
 * @author adenilson
 *
 */
public class ProdutoComTamanho extends Produto{
	
	private int tamanhoDoProduto;
	
	public ProdutoComTamanho(String nome,int codigo, double preco, int tamanho){
		super(nome,codigo, preco);
		this.tamanhoDoProduto = tamanho;
	}
	
	public int getCodigoProduto() {
		return super.getCodigoDoProduto();
	}

	@Override
	public int hashCode() {
		/**
		 * o valor unico evita que codigos e tamanhos diferentes
		 * quando somados deem o mesmo valor, pois
		 * pela ordem, a operação de multiplicacao vem antes
		 * da soma
		 */
		final int unico = 97;
		return super.hashCode() + tamanhoDoProduto * unico;
	}
	
	@Override
	public boolean equals(Object objeto) {
		
		if(this.hashCode() == objeto.hashCode())
			return true;
		
		ProdutoComTamanho outro = (ProdutoComTamanho) objeto;
		
		if(this.hashCode() == outro.hashCode())
			return true;
		
		return false;
	
	}


	public int getTamanhoDoProduto() {
		return tamanhoDoProduto;
	}


	public void setTamanhoDoProduto(int tamanhoDoProduto) {
		this.tamanhoDoProduto = tamanhoDoProduto;
	}

}
