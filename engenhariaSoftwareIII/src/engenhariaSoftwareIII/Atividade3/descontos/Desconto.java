package engenhariaSoftwareIII.Atividade3.descontos;

import engenhariaSoftwareIII.Atividade3.produtos.Produto;

public abstract class Desconto {

	double valorDesconto;
	Produto produto;

	public Desconto(double valorDesconto) {
		super();
		this.valorDesconto = valorDesconto;
	}

	public abstract double formaCalcular(Produto produto);
  
}
