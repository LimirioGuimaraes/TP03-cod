package fastfood;

public class Telefone {

	private int ddd;
	private int numero;
	
	public Telefone() {
		// TODO Auto-generated constructor stub
	}

	public Telefone(int ddd, int numero) {
		super();
		this.ddd = ddd;
		this.numero = numero;
	}

	public String toString() {
		return  ddd +"  "+ numero ;
	}
	
	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
