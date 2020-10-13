package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public abstract class Leitor {
	Reader reader;
	
	
	public Leitor(String caminho) throws IOException {
		super();
		this.reader = new FileReader(caminho);
	}

	
	public abstract ArrayList<Pagamento> readFile();
	
	
}
