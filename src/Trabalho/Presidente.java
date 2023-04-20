package Trabalho;

public class Presidente extends Funcionario implements PessoaFisica{
	
	private double salario;

	public Presidente(String nome, String rg, String cpf ) {
		super(nome, rg, cpf);

	}
	
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
