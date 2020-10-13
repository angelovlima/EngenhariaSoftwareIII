package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import java.io.IOException;
import java.util.ArrayList;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;


public class ArquivoXML extends Leitor{


    public ArquivoXML(String caminho) throws IOException {
		super(caminho);
	}


	@Override
	public ArrayList<Pagamento> readFile() {
        XStream leitor = new XStream(new StaxDriver());
        leitor.alias("br.com.pageseguro.RemessaCartaoCredito", Pagamento.class);
        leitor.alias("br.com.pageseguro.RemessaCartaoDebito", Pagamento.class);
        leitor.alias("br.com.pageseguro.RemessaBoleto", Pagamento.class);
        @SuppressWarnings("unchecked")
		ArrayList<Pagamento> pagamentos = (ArrayList<Pagamento>) leitor.fromXML(reader);

        return pagamentos;
	}


}