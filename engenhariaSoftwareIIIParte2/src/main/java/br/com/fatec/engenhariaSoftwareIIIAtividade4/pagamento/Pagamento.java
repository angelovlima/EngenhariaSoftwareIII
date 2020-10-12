package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

public class Pagamento {
	private String numeroCartao;
    private String nomeTitular;
    private Double parcelas;
    private String nome;
    private String CPF;
    private String bancoRecebimento;
    private String bancoPagamento;
    private String data;
    private Double valor;
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
	public Double getParcelas() {
		return parcelas;
	}
	public void setParcelas(Double parcelas) {
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
	public void setCpf(String cpf) {
		this.CPF = cpf;
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
    
    
}
