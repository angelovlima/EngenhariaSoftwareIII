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
	
	public Pagamento() {
		
	}
	
    public String getNumeroBoleto() {
		return numeroBoleto;
	}
	public void setNumeroBoleto(String numeroBoleto) {
		this.numeroBoleto = numeroBoleto;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getParcelas() {
		return parcelas;
	}
	public void setParcelas(String parcelas) {
		this.parcelas = parcelas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return CPF;
	}
	public void setCpf(String CPF) {
		this.CPF = CPF;
	}
	public String getBancoRecebimento() {
		return bancoRecebimento;
	}
	public void setBancoRecebimento(String bancoRecebimento) {
		this.bancoRecebimento = bancoRecebimento;
	}
	public String getBancoPagamento() {
		return bancoPagamento;
	}
	public void setBancoPagamento(String bancoPagamento) {
		this.bancoPagamento = bancoPagamento;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}

	
}
