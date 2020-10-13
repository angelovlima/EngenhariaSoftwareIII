package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ArquivoJson {

	public ArrayList<Pagamento> readFile(String caminho) throws IOException{
		Gson gson = new Gson(); 
		
		Reader reader = new FileReader(caminho);
		Type listType = new TypeToken<List<Pagamento>>() {}.getType();
		ArrayList<Pagamento> pagamentos = gson.fromJson(reader, listType);

		return pagamentos;

	}
	
}
