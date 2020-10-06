package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.gson.Gson;

public class ArquivoJson extends Leitor{
	String arquivoJson;

	
	public ArquivoJson(String arquivoJson) {
		this.arquivoJson = arquivoJson;
	}


	@Override
	protected String construirArquivo(){
		Gson gson = new Gson(); 
		try {
			//ObjectMapper mapper = new ObjectMapper();
			//String arquivo = readFile("c:\\remessa.json", StandardCharsets.UTF_8);
			//List<Pagamento> participantJsonList = mapper.readValue(arquivo, new TypeReference<List<Pagamento>>(){});
//			String arquivo = readFile("c:\\remessa.json", StandardCharsets.UTF_8);
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
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		return null;
	}
	
	static String readFile(String path, Charset encoding) throws IOException{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
	
}
