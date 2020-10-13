package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;


public class ArquivoXML{


    public ArrayList<Pagamento> readFile(String caminho) throws IOException{
        XStream leitor = new XStream(new StaxDriver());
        Reader xml = new FileReader(caminho);
        leitor.alias("br.com.pageseguro.RemessaCartaoCredito", CartaoCredito.class);
        leitor.alias("br.com.pageseguro.RemessaCartaoDebito", CartaoDebito.class);
        leitor.alias("br.com.pageseguro.RemessaBoleto", Boleto.class);
        leitor.alias("pagamento", Pagamento[].class);
        @SuppressWarnings("unchecked")
		ArrayList<Pagamento> pagamentos = (ArrayList<Pagamento>) leitor.fromXML(xml);

        for(Pagamento pagamento : pagamentos) {
            System.out.println(pagamento.getNome());

        }
        
        return pagamentos;
    }


}