package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;



public class ArquivoXML{


    public void ler() throws IOException{
        XStream xml = new XStream(new DomDriver());
        Reader reader = new FileReader("C:\\Users\\mihoj\\OneDrive\\Documentos\\Faculdade\\ES3\\arquivos IV\\remessa.xml");
        
		xml.alias("br.com.pageseguro.RemessaCartaoCredito", Pagamento.class);
		xml.alias("br.com.pageseguro.RemessaCartaoDebito", Pagamento.class);
		xml.alias("br.com.pageseguro.RemessaBoleto", Pagamento.class);
		xml.alias("list", Pagamento[].class);
		Pagamento[] pagamentos = (Pagamento[]) xml.fromXML(reader);


		System.out.println(pagamentos.toString());

    }


}