package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("list")
public class Pagamento {
	private String nome;
    private String CPF;
    private String bancoPagamento;
    private String data;
    private String valor;
    private String numeroCartao;
    private String nomeTitular;
    private String parcelas;
    private String numeroBoleto;
	private String bancoRecebimento;
	
    public String getNumeroBoleto() {
		return numeroBoleto;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public String getParcelas() {
		return parcelas;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return CPF;
	}
	public String getBancoRecebimento() {
		return bancoRecebimento;
	}
	public String getBancoPagamento() {
		return bancoPagamento;
	}
	public String getData() {
		return data;
	}
	public String getValor() {
		return valor;
	}

	
}
