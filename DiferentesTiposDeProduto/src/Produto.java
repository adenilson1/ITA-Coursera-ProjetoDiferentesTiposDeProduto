/**
 * parte I
 * Essa classe recebera os atributos, nome do produto, preço do produto
 * e os metodos que equals() e hashCode() para verificaar os produtos 
 * com o mesmo nome e tamanhos diferentes
 * 
 * @author adenilson
 *
 */
public class Produto {
	
	private String nomeDoProduto;
	private int codigoDoProduto; // pelo codigo se verifica se os produtos são iguais
	private double precoDoProduto;
	
	public Produto(String nome, int codigo, double preco) {
		this.nomeDoProduto = nome;
		this.codigoDoProduto = codigo;
		this.precoDoProduto = preco;
	}
	
	/**
	 * Subescrita dos metodos equals() e hashCode(), porque ambos pertencem a classe Object
	 * pesquisei seu uso no 
	 * "https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object)"
	 */
	
	//Se os produto sao ou nao o mesmo com o codigo
	@Override
	public int hashCode() {
		return this.codigoDoProduto;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if(this.codigoDoProduto == objeto.hashCode())
			return true;
		
		if(this.codigoDoProduto != objeto.hashCode())
			return false;
		
		Produto outro = (Produto) objeto;
		
		if(codigoDoProduto != outro.codigoDoProduto)
			return false;
		
		return false;
		
			
	}
	
	//Get e Set

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public int getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(int codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public double getPrecoDoProduto() {
		return precoDoProduto;
	}

	public void setPrecoDoProduto(double precoDoProduto) {
		this.precoDoProduto = precoDoProduto;
	}
	
	
}
