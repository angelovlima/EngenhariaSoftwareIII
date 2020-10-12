package br.com.fatec.engenhariaSoftwareIIIAtividade4.pagamento;

import br.com.caelum.stella.validation.CPFValidator;

public class ValidadorCpf {
	
	public static boolean valida(String cpf) { 
	    CPFValidator cpfValidator = new CPFValidator(); 
	    try{ 
	    	cpfValidator.assertValid(cpf); 
	    	return true; 
	    } catch(Exception e) { 
	        return false; 
	        } 
	    }

}
