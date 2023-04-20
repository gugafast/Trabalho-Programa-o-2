package Trabalho;

public class Gerente extends Funcionario implements PessoaFisica{
	

	public Gerente(String nome, String rg, String cpf) {
		super(nome, rg, cpf);	
	}


	public String getCPF() {
		return super.getCPF();
	}


	public void setCPF(String cpf) {

		super.setCPF(cpf);
	}

	public String getRG() {

		return super.getRG();
	}


	public void setRG(String rg) {
		
		super.setRG(rg);
	}


	public String getNome() {
	
		return super.getNome();
	}


	public void setNome(String nome) {
		
		super.setNome(nome);
	}


	public Conta getConta() {

		return super.getConta();
	}


	public void setConta(Conta conta) {
		
		super.setConta(conta);
	}


}
	

