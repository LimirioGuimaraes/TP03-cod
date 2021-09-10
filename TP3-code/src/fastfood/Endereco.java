package fastfood;

public class Endereco {

	private String cidade;
	private String quadra;
	private String rua;
	private String numCasa;
	
	public Endereco(String cidade, String quadra, String rua, String numCasa) {
		super();
		this.cidade = cidade;
		this.quadra = quadra;
		this.rua = rua;
		this.numCasa = numCasa;
	}

	public String toString() {
		return cidade +"  "+ quadra +"  "+ rua +"  "+ numCasa;
	}
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(String numCasa) {
		this.numCasa = numCasa;
	}
	
	
	
	
}
