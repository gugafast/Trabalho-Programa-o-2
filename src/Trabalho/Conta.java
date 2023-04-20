package Trabalho;

public interface Conta {
	
	public void depositar(double valor);
	public void sacar(double valor) throws Exception;
	public double getSaldo();
	
	public String getSenha();
	public void setSenha(String senha);
	
	public String getNomeBanco();
	public void setNomeBanco(String nome);
	
	public String getCodAgencia();
	public  void setCodAgencia(String codigoAgencia);



}
