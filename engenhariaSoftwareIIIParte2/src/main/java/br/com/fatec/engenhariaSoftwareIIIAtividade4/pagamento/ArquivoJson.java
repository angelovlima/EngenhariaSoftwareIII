package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.gson.Gson;

public class ArquivoJson{



	//protected String construirArquivo(){
//		Gson gson = new Gson(); 
//		try {
//			//ObjectMapper mapper = new ObjectMapper();
//			//String arquivo = readFile("c:\\remessa.json", StandardCharsets.UTF_8);
//			//List<Pagamento> participantJsonList = mapper.readValue(arquivo, new TypeReference<List<Pagamento>>(){});
//			String arquivo = readFile("C:\\Users\\mihoj\\OneDrive\\Documentos\\Faculdade\\ES3\\arquivos IV\\remessa.json", StandardCharsets.UTF_8);
//			arquivo = arquivo.replace("[", "");
//			arquivo = arquivo.replace("]", "");
//			String [] pagamentoUnitarios = arquivo.split("},");
//			List<String> pagamentoUnitariosClone = new ArrayList<String>();
//			List<Pagamento> pagamentos = new ArrayList<Pagamento>();
//			for (String pagamento : pagamentoUnitarios) {
//				pagamentoUnitariosClone.add(pagamento + "}");
//			}
//			for (String pagamento : pagamentoUnitariosClone) {
//				System.out.println(pagamento);
//			}
//			return arquivo;
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		

	//	return null;
	//}
	
	public void readFile() throws IOException{
		Gson gson = new Gson(); 
		
		Reader reader = new FileReader("C:\\Users\\mihoj\\OneDrive\\Documentos\\Faculdade\\ES3\\arquivos IV\\remessa.json");
		Type listType = new TypeToken<List<Pagamento>>() {}.getType();
		ArrayList<Pagamento> pagamentos = gson.fromJson(reader, listType);

		for (Pagamento pagamento : pagamentos) {
			System.out.println(pagamento.getNome());
			System.out.println(pagamento.getParcelas());
		}

	}//oi
	
}
