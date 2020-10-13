package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import java.util.ArrayList;

public class Leitor {
	public String caminhoArquivo;
	
	public Leitor(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}

	public void imprimir(ArrayList<Pagamento> pagamentos) {
		//ValidadorCpf validadorCpf = new ValidadorCpf();
		
		for (Pagamento pagamento : pagamentos) {
			if(ValidadorCpf.valida(pagamento.getCpf())) {
				System.out.println(pagamento.getNome() != null ? pagamento.getNome() : null);
				System.out.println(pagamento.getParcelas() != null ? pagamento.getParcelas() : null);
				System.out.println(pagamento.getCpf() != null ? pagamento.getCpf() : null);
			}
		}
	}
	
}
