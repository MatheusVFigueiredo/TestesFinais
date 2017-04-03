package exception;

/**
 * CpfInvalidoException.
 * Classe que recupera excecao do tipo cpf invalido.
 *
 * @author Matheus de Souza Coutinho
 * @author Matheus Vasconcelos Figueiredo          
 */

public class CpfInvalidoException extends Exception{
	public CpfInvalidoException(){
		super("Cpf inv�lido");
	}
	
	public CpfInvalidoException(String messagem){
		super(messagem);
	}
}
