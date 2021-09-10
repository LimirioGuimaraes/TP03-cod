package fastfood;
import java.util.*;
import java.util.Scanner;

public class Venda {
	
	private int quant;
	private double precoTotal;
	private Cliente cliente;
	private Produto produto;
	
	public Venda(int quant, double precoTotal, Cliente cliente, Produto produto) {
		super();
		this.quant = quant;
		this.precoTotal = precoTotal;
		this.cliente = cliente;
		this.produto = produto;
	}

	//Associação de venda de produto ao cliente 
		public static void associ( int nCli, Scanner ler, int nBurguer,int nDog, int nRefri, 
				Cliente[]cliente, Hamburguer[]burguer, HotDog[]dog, Refrigerante[]refri) {

			ArrayList<String> nomeProduto = new ArrayList<String>();
			String nome;
			double valorTotal;
			int escolhaCli;
			int escolhaItem;
			
			System.out.println("Escolha o cliente a qual deseja cadastrar uma ou mais vendas:");
			for (int i=1; i<nCli; i++ ) {
				System.out.println(i+ "." +cliente[i]);
			}	
			escolhaCli = ler.nextInt();
			if(escolhaCli > 0 & escolhaCli < nCli ) {
				char escolhaClasse;
				System.out.println("Escolha qual classe de produto deseja vender:");
				System.out.println("1.Hamburguer");
				System.out.println("2.HotDog's");
				System.out.println("3.Refrigerantes");
				escolhaClasse = ler.next().charAt(0);
				
				do {
					
					switch(escolhaClasse) {
					
						case'1':
							//Venda de Hamburguer
							System.out.println("Lista Hamburgueres");
							for(int i = 1; i < nBurguer; i++) {
								System.out.println(i+"."+burguer[i]);
							}
							System.out.println("Qual item deseja vender");
							escolhaItem = ler.nextInt();
							if(escolhaItem > 0 & escolhaItem < nBurguer) {
								
							}else {
							System.out.println("Opção inválida");	
							}
							break;
		
						case'2':
							//vendaa hotdog
							System.out.println("Lista de HotDog's");
							for(int i = 1; i < nDog; i++) {
								System.out.println(dog[i]);
							}
							System.out.println("Qual item deseja vender");
							escolhaItem = ler.nextInt();
							if(escolhaItem > 0 & escolhaItem < nDog) {
								
							}else {
							System.out.println("Opção inválida");	
							}
							break;
						
						case'3':
							//venda Refrigerantes
							System.out.println("Lista Refrigerantes");
							for(int i = 1; i < nRefri; i++) {
								System.out.println(refri[i]);
							}
							System.out.println("Qual item deseja vender");
							escolhaItem = ler.nextInt();
							if(escolhaItem > 0 & escolhaItem < nRefri) {
								
							}else {
							System.out.println("Opção inválida");	
							}
							break;
							
						case'4':
							System.out.println("Operação cancelada!");
							break;
							
						default:
							System.out.println("Opção inválida");
							break;
					}
				}while(escolhaClasse != '4');
			} else{
				System.out.println("Opção inválida");
			}
		}	
		
	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
