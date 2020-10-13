package br.com.fatec.engenhariaSoftwareIIIAtividade4;

import java.io.IOException;
import java.util.ArrayList;
import br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento.ArquivoJson;
import br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento.ArquivoXML;
import br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento.Imprimir;
import br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento.Pagamento;

public class Inicio {

	public static void main(String[] args) throws IOException {
		
//		ArquivoJson json = new ArquivoJson("C:\\Users\\mihoj\\OneDrive\\Documentos\\Faculdade\\ES3\\arquivos IV\\remessa.json");
//		
//		ArrayList<Pagamento> pagamentos = json.readFile();
//
//		Imprimir imprimirJson = new Imprimir();
//		
//		imprimirJson.imprimir(pagamentos);
		
		
		ArquivoXML xml = new ArquivoXML("C:\\Users\\mihoj\\OneDrive\\Documentos\\Faculdade\\ES3\\arquivos IV\\remessa.xml");
		
		ArrayList<Pagamento> pagamentosXML = xml.readFile();
		
		Imprimir imprimirXml = new Imprimir();
		
		imprimirXml.imprimir(pagamentosXML);
	
	}

}
