package Trabalho;

public abstract class Pessoa {

	protected String nome;
	protected Conta conta;
	
	
	public Pessoa(){
	}
	
	public Pessoa(String nome) {
        this.nome = nome;
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}

	
}
