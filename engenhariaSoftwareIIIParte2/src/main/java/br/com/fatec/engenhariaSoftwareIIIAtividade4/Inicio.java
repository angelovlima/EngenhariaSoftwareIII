package br.com.fatec.engenhariaSoftwareIIIAtividade4;

import java.io.IOException;
import java.util.ArrayList;
import br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento.ArquivoJson;
import br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento.ArquivoXML;
import br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento.Leitor;
import br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento.Pagamento;

public class Inicio {

	public static void main(String[] args) throws IOException {
		
//		ArquivoJson json = new ArquivoJson();
//		
//		ArrayList<Pagamento> pagamentos = json.readFile("C:\\Users\\mihoj\\OneDrive\\Documentos\\Faculdade\\ES3\\arquivos IV\\remessa.json");
//
//		Leitor leitor = new Leitor();
//		
//		leitor.imprimir(pagamentos);
//		
		
		ArquivoXML xml = new ArquivoXML("C:\\Users\\tabat\\Documents\\FATEC ADS\\4º Sem\\Eng Soft III\\arquivos IV\\remessa.xml");
		
		xml.ler();
	}

}
