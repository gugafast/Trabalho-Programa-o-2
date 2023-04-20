package Trabalho;

public abstract class Empresa implements PessoaJuridica{

	protected String cnpj, nomeDaEmpresa;
	
	
	public String getCNPJ() {

		return cnpj;
	}

	
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}

	
	public String getNomeDaEmpresa() {		
		return nomeDaEmpresa;
	}

	
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	
	
	
}
