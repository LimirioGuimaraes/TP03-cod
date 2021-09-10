package fastfood;

public class Funcionario extends Pessoa {

	String horarioEntradaSaida;
	private double salario;
	
	public Funcionario(String horarioEntradaSaida,double salario,String nome, int cpf, Telefone tel,
			Endereco end) {
		super();
		this.horarioEntradaSaida = horarioEntradaSaida;
		this.salario = salario;
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
		this.end = end;
	}

	public String toString() {
		return  horarioEntradaSaida +"  "+ salario +"  "+ nome +"  "+ cpf +"  "+ tel +"  "+end;
	}
	
	//leitura de Funcionários cadastrados
		public static void infoFunc(int nFunc, Funcionario[]func) {
			System.out.println("Lista de Funcionários");
			for (int i=1; i<nFunc; i++) {
				System.out.println(func[i]);
			}		
		}
	
	
	
	public String getHorarioEntradaSaida() {
		return horarioEntradaSaida;
	}

	public void setHorarioEntradaSaida(String horarioEntradaSaida) {
		this.horarioEntradaSaida = horarioEntradaSaida;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
