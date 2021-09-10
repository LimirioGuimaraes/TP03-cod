package fastfood;

public class HotDog extends Produto {

	private String brindeMolho;
		
	public HotDog(String nome, double preco, String descricao, String brindeMolho) {
		super(nome, preco, descricao);
		this.brindeMolho = brindeMolho;
	}

	
	public String toString() {
		return  nome +"  "+ preco +"R$  "+ descricao + "  "+ brindeMolho;
	}

	//leitura dados hotdog
		public static void infoDog(int nDog, HotDog[]dog) {
				System.out.println("Lista de HotDog's");
				for(int i = 1; i < nDog; i++) {
					System.out.println(dog[i]);
				}
			}
	
	public String getBrindeMolho() {
		return brindeMolho;
	}

	public void setBrindeMolho(String brindeMolho) {
		this.brindeMolho = brindeMolho;
	}
	

	
}
