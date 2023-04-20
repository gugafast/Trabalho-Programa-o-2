package Trabalho;

public class Faculdade implements PessoaJuridica{

	private String cnpj, nomeDaFaculdade;
	
	public String getCNPJ() {
		
		return this.cnpj;
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
		
	}

	public String getNomeDaEmpresa() {

		return this.nomeDaFaculdade;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaFaculdade = nomeDaEmpresa;
	}
	
}
