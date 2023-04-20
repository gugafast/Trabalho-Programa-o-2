package Trabalho;

public class Main {

	public static void main(String[] args) throws Exception {

		Gerente gerente = new Gerente("Gustavo","5647684","54543");
		Conta conta = new ContaPoupanca("Gustavo","13131","65165","Banco do Brasil");
		Conta conta1 = new ContaPoupanca("Gustavo","546514","5454","Banco do Bradesco");
		
		gerente.adicionarConta(conta1);
		gerente.adicionarConta(conta);
		conta1.depositar(1000.00);
		conta.depositar(500.00);
		conta.sacar(100.00);
		
		System.out.println(conta.getSaldo());
		System.out.println(conta1.getSaldo());
		System.out.println(conta.getNomeBanco());
		System.out.println(conta1.getNomeBanco());
	}

}
