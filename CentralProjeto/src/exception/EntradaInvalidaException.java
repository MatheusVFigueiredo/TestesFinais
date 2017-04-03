package exception;

/**
 * EntradaInvalidaException.
 * Classe que recupera excecao do tipo valor invalido.
 *
 * @author Matheus de Souza Coutinho
 * @author Matheus Vasconcelos Figueiredo          
 */

public class EntradaInvalidaException extends Exception{
	public EntradaInvalidaException(){
		super("Valor inv�lido");
	}
	
	public EntradaInvalidaException(String messagem){
		super(messagem);
	}
}
