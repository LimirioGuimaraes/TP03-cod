package fastfood;

public class Loja {

	private Funcionario funcionario[];
	private String horarioFuncionamento; 
	private Cliente cliente[];
	private Produto produto[];
	private Venda venda[];
	
	public Loja(Funcionario[] funcionario, String horarioFuncionamento, Cliente[] cliente, Produto[] produto,
			Venda[] Venda) {
		super();
		this.funcionario = funcionario;
		this.horarioFuncionamento = horarioFuncionamento;
		this.cliente = cliente;
		this.produto = produto;
		this.venda = Venda;
	}

	public Funcionario[] getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}

	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}

	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}

	public Cliente[] getCliente() {
		return cliente;
	}

	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}

	public Produto[] getProduto() {
		return produto;
	}

	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}

	public Venda[] getVenda() {
		return venda;
	}

	public void setVenda(Venda[] Venda) {
		this.venda = Venda;
	}

	
	

}
