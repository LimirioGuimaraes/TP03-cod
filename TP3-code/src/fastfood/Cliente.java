package fastfood;
import java.util.*;


public class Cliente extends Pessoa {

	boolean vegetariano; 
	
	public Cliente(boolean vegetariano, String nome, int cpf, Telefone tel,
			Endereco end) {
		super();
		this.vegetariano = vegetariano;
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
		this.end = end;
	}
	
	public String toString() {
		return  vegetariano +"  "+ nome +"  "+ cpf +"  "+ tel +"  "+end;
	}
	
	//leitura de clientes cadastrados
	public static void infoCliente(int nCli, Cliente[]cliente) {
			System.out.println("Lista de Clientes");
			for (int i=1; i<nCli; i++ ) {
				System.out.println(cliente[i]);
			}	
			
	}
	
	
	
	
	public boolean isVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

}
