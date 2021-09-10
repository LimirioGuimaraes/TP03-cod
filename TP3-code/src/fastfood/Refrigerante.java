package fastfood;

public class Refrigerante extends Produto {

	private String marca;
	private String sabor;
	private int qtdEstoque;
	

	public Refrigerante(String nome, double preco, String descricao, String marca, String sabor, int qtdEstoque) {
		super(nome, preco, descricao);
		this.marca = marca;
		this.sabor = sabor;
		this.qtdEstoque = qtdEstoque;
	}

	public String toString() {
		return  nome +"  "+ preco +"R$  "+ descricao +"  "+ marca +"  "+ sabor +" Quantidade em estoque: " + qtdEstoque;
	}

	//leitura dados refri
		public static void infoRefri(int nRefri, Refrigerante[]refri) {
			System.out.println("Lista Refrigerantes");
			for(int i = 1; i < nRefri; i++) {
				System.out.println(refri[i]);
			}
		}
	
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public int getQtdEstoque() {
		return qtdEstoque;
	}


	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	

}
