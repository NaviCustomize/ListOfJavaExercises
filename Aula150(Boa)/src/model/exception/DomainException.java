package model.exception;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L; //Exception é um serializable
	
	public DomainException(String msg) {
		super(msg); //serve para instanciar o DomainException passando uma mensagem
	}
	
}
