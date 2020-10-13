package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import java.util.ArrayList;

public class Imprimir {
	public String caminhoArquivo;
	

	public void imprimir(ArrayList<Pagamento> pagamentos) {
		//ValidadorCpf validadorCpf = new ValidadorCpf();
		
		for (Pagamento pagamento : pagamentos) {
			if(ValidadorCpf.valida(pagamento.getCpf())) {
				System.out.println("\n++++++++++++++++++NOVA REMESSA++++++++++++++++\n");
				System.out.print(pagamento.getNome() != null ? "Nome: "+pagamento.getNome()+"\n" : "");
				System.out.print(pagamento.getParcelas() != null ? "Parcelas: "+pagamento.getParcelas()+"\n" : "");
				System.out.print(pagamento.getCpf() != null ? "Cpf: "+pagamento.getCpf()+"\n" : "");
				System.out.print(pagamento.getData()!= null ? "Data: "+pagamento.getData()+"\n" : "");
				System.out.print(pagamento.getNomeTitular()!= null ? "Nome Titular: "+pagamento.getNomeTitular()+"\n" : "");
				System.out.print(pagamento.getNumeroBoleto()!= null ? "Numero Boleto: "+pagamento.getNumeroBoleto()+"\n" : "");
				System.out.print(pagamento.getNumeroCartao()!= null ? "Numero Cartão: "+pagamento.getNumeroCartao() +"\n": "");
				System.out.print(pagamento.getValor()!= null ? "Numero Valor: "+pagamento.getValor() +"\n": "");
				System.out.print(pagamento.getBancoPagamento()!= null ? "Banco de Pagamento: "+pagamento.getBancoPagamento()+"\n" : "");
				System.out.print(pagamento.getBancoRecebimento()!= null ? "Banco de Recebimento: "+pagamento.getBancoRecebimento()+"\n" : "");
			}
		}
	}
	
}
