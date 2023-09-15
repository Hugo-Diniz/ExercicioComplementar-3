package exercicio;

public class NotaInvalidaException extends Exception {

    public NotaInvalidaException() {
        super("A nota não pode ser menor que 0 e nem maior do que 10.");
    }
    
}