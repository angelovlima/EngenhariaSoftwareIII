package engenhariaSoftwareIII.Atividade2;

import engenhariaSoftwareIII.Atividade2.calculadores.CalculadorPreco;
import engenhariaSoftwareIII.Atividade2.descontos.DescontoDiaNamorados;
import engenhariaSoftwareIII.Atividade2.produtos.Produto;

public class Inicio {
	
	  public static void main(String[] args) {
		    
		    CalculadorPreco calculo = new CalculadorPreco();
		    Produto p1 = new Produto("Ma�a", 20);
		    calculo.produto = p1;
		    DescontoDiaNamorados d1 = new DescontoDiaNamorados();
		    calculo.desconto = d1;

		    System.out.println("Valor de cobran�a: " + calculo.valor());

		    
		  }
}
