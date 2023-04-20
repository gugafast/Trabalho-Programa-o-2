package Trabalho;

public class Aluno extends Pessoa implements PessoaFisica{

	protected String nome,cpf,rg;
	protected String matricula;
	
	public Aluno(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
		
	public String getCPF() {
		
		return this.cpf;
	}

	
	public void setCPF(String cpf) {
		this.cpf = cpf;
		
	}

	@Override
	public String getRG() {
		
		return this.rg;
	}

	@Override
	public void setRG(String rg) {
		this.rg = rg;
	}

}
