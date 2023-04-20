package Trabalho;
import java.util.ArrayList;
import java.util.List;
public abstract class Funcionario extends Pessoa implements PessoaFisica{

	protected String cpf, rg;
	protected List<Conta> contas;
	
	public Funcionario(String nome, String rg, String cpf) {
        
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

	public String getCPF() {
		
		return cpf;
	
	}


	public void setCPF(String cpf) {
		this.cpf = cpf;
		
	}


	public String getRG() {
		
		return rg;
	}


	public void setRG(String rg) {
		this.rg = rg;
	}
	
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void removerConta(Conta conta) {
        this.contas.remove(conta);
    }
	
	public List<Conta> getContas() {
        return contas;
    }
	
}
	
	
