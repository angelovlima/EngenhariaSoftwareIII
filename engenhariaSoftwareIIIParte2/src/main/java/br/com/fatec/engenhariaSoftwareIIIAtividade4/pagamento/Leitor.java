package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import java.util.ArrayList;

public class Leitor {
	public String caminhoArquivo;
	

	public void imprimir(ArrayList<Pagamento> pagamentos) {
		//ValidadorCpf validadorCpf = new ValidadorCpf();
		
		for (Pagamento pagamento : pagamentos) {
			if(ValidadorCpf.valida(pagamento.getCpf())) {
				System.out.println("\n++++++++++++++++++NOVA REMESSA++++++++++++++++\n");
				System.out.println(pagamento.getNome() != null ? pagamento.getNome() : "Não contém");
				System.out.println(pagamento.getParcelas() != null ? pagamento.getParcelas() : "Não contém");
				System.out.println(pagamento.getCpf() != null ? pagamento.getCpf() : "Não contém");
				System.out.println(pagamento.getData()!= null ? pagamento.getData() : "Não contém");
				System.out.println(pagamento.getNomeTitular()!= null ? pagamento.getNomeTitular() : "Não contém");
				System.out.println(pagamento.getNumeroBoleto()!= null ? pagamento.getNumeroBoleto() : "Não contém");
				System.out.println(pagamento.getNumeroCartao()!= null ? pagamento.getNumeroCartao() : "Não contém");
				System.out.println(pagamento.getValor()!= null ? pagamento.getValor() : "Não contém");
				System.out.println(pagamento.getBancoPagamento()!= null ? "Banco de Pagamento: "+pagamento.getBancoPagamento() : "Não contém");
				System.out.println(pagamento.getBancoRecebimento()!= null ? "Banco de Recebimento: "+pagamento.getBancoRecebimento() : "Não contém");
			}
		}
	}
	
}
