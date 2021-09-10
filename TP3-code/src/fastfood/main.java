package fastfood;
import java.util.*;

public class main {
	
	static Funcionario[]func = new Funcionario[50];
	static Telefone[]telFunc = new Telefone[50];
	static Endereco[]endFunc = new Endereco[50];
	static Cliente[]cliente = new Cliente[100];
	static Telefone[]telCli = new Telefone[50];
	static Endereco[]endCli = new Endereco[50];
	static Refrigerante[]refri = new Refrigerante[50];
	static Hamburguer[]burguer = new Hamburguer[50];
	static HotDog[]dog = new HotDog [50];
	
	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	dados();
	int nFunc = 5;
	int nCli = 5;
	int nRefri = 5;
	int nBurguer = 5;
	int nDog = 5;
	
	char menu;
	
	do {
		
		System.out.println("----------MENU----------");
		System.out.println("1.Informações da loja");
		System.out.println("2.Informações Clientes");
		System.out.println("3.Refrigerantes");
		System.out.println("4.Hamburgueres");
		System.out.println("5.HotDog's");
		System.out.println("6.Venda");
		System.out.println("0. SAIR");
		menu = ler.next().charAt(0);
		
		switch(menu) {
		
			case'1':
				Funcionario.infoFunc(nFunc, func);
				break;
				
			case'2':
				Cliente.infoCliente(nCli, cliente);
				break;
				
			case'3':
				Refrigerante.infoRefri(nRefri, refri);
				break;
				
			case'4':
				Hamburguer.infoBurguer(nBurguer, burguer);
				break;
			
			case'5':
				HotDog.infoDog(nDog, dog);
				break;
			
			case'6':
				Venda.associ(nCli, ler, nBurguer, nDog, nRefri, cliente, burguer, dog, refri);
				break;
			default:
				System.out.println("Opção inválida");
				break;
	
		}
	
	}while(menu != '0');
	
	}	

	public static void dados(){
//preenchimento automático de dados funcionário
		for (int i = 1; i < 5; i++) {
			telFunc[i] = new Telefone(i*11,i*11111111);
			endFunc[i] = new Endereco("cidade" + i, "quadra" + i , "rua" + i , "casa" + i);
			func[i] = new Funcionario("Horario" + i, 1+i, "funcionario" + i, 12*i, telFunc[i], endFunc[i]);
		}
//preenchimento automático de dados dos clientes
		for (int i = 1; i < 5; i++) {
			telCli[i] = new Telefone(i*11,i*11111111);
			endCli[i] = new Endereco("cidade" + i, "quadra" + i , "rua" + i , "casa" + i);
			cliente[i] = new Cliente(false, "Cliente" +i, 3*i, telCli[i], endCli[i]);
		}
//preenchimento automático de refrigerantes 
		for(int i=1; i<5 ; i++) {
			refri[i] = new Refrigerante("Refrigerante"+i, i , "'Refrigerante " + i + " muito bom'", "marca"+ i, "sabor"+i, i*2);
		}
//preenchimento automático de hamburgueres	
		for(int i=1; i<5 ; i++) {
			burguer[i] = new Hamburguer("Hamburguer"+i, i , "'Hamburguer " + i + " muito bom'", false);
		}
//preenchimento automático de HotDog
		for(int i=1; i<5 ; i++) {
			dog[i] = new HotDog("HotDog" +i, i , "'HotDog " + i + " muito bom'", "maionese e ketchup");
		}
	
}


}





