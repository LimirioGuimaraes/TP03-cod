package fastfood;

public class Hamburguer extends Produto{

	private boolean paoIntegral ;
	

	public Hamburguer(String nome, double preco, String descricao, boolean paoIntegral) {
		super(nome, preco, descricao);
		this.paoIntegral = paoIntegral;
	}


	public String toString() {
		return  nome +"  "+ preco +"R$  "+ descricao +"  "+ paoIntegral ;
	}

	//leitura dados hamburguer
		public static void infoBurguer(int nBurguer, Hamburguer[]burguer) {
			System.out.println("Lista Hamburgueres");
			for(int i = 1; i < nBurguer; i++) {
				System.out.println(burguer[i]);
			}
		}
	

	public boolean getPaoIntegral() {
		return paoIntegral;
	}


	public void setPaoIntegral(boolean paoIntegral) {
		this.paoIntegral = paoIntegral;
	}
	

}
