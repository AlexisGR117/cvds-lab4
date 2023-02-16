package hangman.model;

/**
 * Clase excepción de Hangman Model.
 * @author Jefer Gonzalez
 * @version 1.0 (16/02/2024)
 */
public class HangmanModelException extends Exception {
	
	public static final String INVALID_CORRECT_COUNT = "El numero de letras correctas debe ser mayor o igual a 0.";
    public static final String INVALID_INCORRECT_COUNT = "El numero de letras incorrectas debe ser mayor o igual a 0.";

    /**
     * Constructor para objetos de clase HangmanModelException.
     * @param message Mensaje de la excepción.
     */
    public HangmanModelException(String message) {
        super(message);
    }
	
}
