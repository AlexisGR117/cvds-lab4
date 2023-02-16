package hangman.model;

/**
 * Puntaje del juego de ahorcados.
 * @author jefer.gonzalez
 * @version 1.0 (02/16/2023)
 */
public interface GameScore {
	
	/**
	 * Metodo que calcula el puntaje del juego basada en las letras correctas e incorrectas.
	 * 
	 * @param correctCount Numero de letras correctas.
	 * @param incorrectCount Numero letras incorrectas.
	 * @return Numero entero con el puntaje.
	 * @throws HangmanModelException INVALID_CORRECT_COUNT, si el numero de letras correctas es menor que cero.
	 * 								 INVALID_INCORRECT_COUNT, si el numero de letras incorrectas es menor que cero.
	 */
	public abstract int calculateScore(int correctCount, int incorrectCount) throws HangmanModelException;
}
