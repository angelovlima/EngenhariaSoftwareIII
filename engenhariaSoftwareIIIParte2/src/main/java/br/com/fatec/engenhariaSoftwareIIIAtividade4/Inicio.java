package br.com.fatec.engenhariaSoftwareIIIAtividade4;

import br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento.ArquivoJson;
import br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento.Leitor;

public class Inicio {

	public static void main(String[] args) {
		Leitor json = new ArquivoJson("Teste de criação");
		System.out.println(json.escreverArquivo());
	}

}
