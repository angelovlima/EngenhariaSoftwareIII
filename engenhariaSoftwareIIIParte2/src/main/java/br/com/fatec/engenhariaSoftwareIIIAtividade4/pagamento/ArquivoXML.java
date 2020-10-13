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
        Pagamento[] pagamentos = (Pagamento[]) leitor.fromXML(xml);

        for(int i = 0; i < pagamentos.length; i++) {
            System.out.println(pagamentos[i].getNome());

        }
        ArrayList<Pagamento> pagamentoss = new ArrayList<Pagamento>();
        
        return pagamentoss;
    }


}