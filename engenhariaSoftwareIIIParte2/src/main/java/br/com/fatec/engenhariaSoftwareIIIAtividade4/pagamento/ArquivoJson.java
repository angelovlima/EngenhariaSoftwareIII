package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ArquivoJson extends Leitor {

	public ArquivoJson(String caminho) throws IOException {
		super(caminho);
	}


	@Override
	public ArrayList<Pagamento> readFile() {
		Gson gson = new Gson(); 
		Type listType = new TypeToken<List<Pagamento>>() {}.getType();
		ArrayList<Pagamento> pagamentos = gson.fromJson(reader, listType);

		return pagamentos;
	}
	
}
