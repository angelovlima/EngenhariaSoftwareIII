package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

public abstract class Leitor {

	protected String cabecalho() {
		String cabecalho = " ### Arquivo de Remessa ### ";
		return cabecalho;
	}
	
	protected String rodape() {
		String rodape = " ### Fim Arquivo ### ";
		return rodape;
	}
	
	protected abstract String construirArquivo();
	
	public String escreverArquivo() {
		return cabecalho() + construirArquivo() + rodape();
	}
}
