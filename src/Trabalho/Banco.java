package Trabalho;

public class Banco implements PessoaJuridica {

	private String cnpj, nomeDoBanco;
	
	public Banco(String cnpj, String nomeDoBanco) {
		this.cnpj = cnpj;
		this.nomeDoBanco = nomeDoBanco;
	}

	@Override
	public String getCNPJ() {
		
		return this.cnpj;
	}

	@Override
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
		
	}

	@Override
	public String getNomeDaEmpresa() {
		
		return this.nomeDoBanco;
	}

	@Override
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDoBanco = nomeDaEmpresa;
	}
	
	
}
