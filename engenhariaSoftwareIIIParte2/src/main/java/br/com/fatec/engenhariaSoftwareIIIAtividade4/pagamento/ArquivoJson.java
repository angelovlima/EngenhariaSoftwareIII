package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ArquivoJson{

	public void readFile() throws IOException{
		Gson gson = new Gson(); 
		ValidadorCpf validadorCpf = new ValidadorCpf();
		
		Reader reader = new FileReader("C:\\remessa.json");
		Type listType = new TypeToken<List<Pagamento>>() {}.getType();
		ArrayList<Pagamento> pagamentos = gson.fromJson(reader, listType);

		for (Pagamento pagamento : pagamentos) {
			//validação provisória de cpf
			if(ValidadorCpf.valida(pagamento.getCpf())) {
				System.out.println(pagamento);
				System.out.println(pagamento.getNome() != null ? pagamento.getNome() : null);
				System.out.println(pagamento.getParcelas() != null ? pagamento.getParcelas() : null);
				System.out.println(pagamento.getCpf() != null ? pagamento.getCpf() : null);
			}
		}

	}
	
}
