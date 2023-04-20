package Trabalho;
import java.util.ArrayList;

public class ContaPoupanca implements Agencia, Conta {

	private String titular, senha, codigoAgencia, nomeBanco;
	private double saldo;
	private ArrayList<ContaPoupanca> contas;

	public ContaPoupanca(String titular, String senha, String codigoAgencia, String nomeBanco){
		this.titular = titular;
		this.senha = senha;
		this.codigoAgencia = codigoAgencia;
		this.nomeBanco = nomeBanco;
		contas = new ArrayList<ContaPoupanca>();
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String nome) {
		this.titular = nome;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;	
	}

	
	public void sacar(double valor) throws Exception {
		if(this.saldo >= 0) {
			this.saldo -= valor;
		}else {
			throw new Exception("Valor insuficiente");
		}	
	}

	public double getSaldo() {		
		return this.saldo;
	}

	
	public String getSenha() {
		return this.senha;
	}

	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeBanco() {
		return this.nomeBanco;
	}

	public void setNomeBanco(String nome) {
		this.nomeBanco = nome;
	}

	
	public String getCodAgencia() {		
		return this.codigoAgencia;
	}

	@Override
	public void setCodAgencia(String codigo) {
		this.codigoAgencia = codigo;
	}
	

	
}
