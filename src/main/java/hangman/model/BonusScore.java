package hangman.model;


/**
 * Puntaje del juego de ahorcados que inicia con 0 puntos, se bonifican con 10 puntos
 * cada letra correcta, se penaliza con 5 puntos cada letra incorrecta y el puntaje minimo es 0.
 * @author jefer.gonzalez
 * @version 1.0 (02/16/2023)
 */
public class BonusScore implements GameScore {

	/**
	 * Metodo que calcula el puntaje del juego basada en las letras correctas e incorrectas.
	 * 
	 * @param correctCount Numero de letras correctas.
	 * @param incorrectCount Numero letras incorrectas.
	 * @return Numero entero con el puntaje.
	 * @pre Se hizo el calculo de las letras correctas e incorrectas.
	 * @pos Puntaje calculado teniendo en cuenta que el puntaje inicial es 0, se bonifican con 10 puntos
	 * cada letra correcta, se penaliza con 5 puntos cada letra incorrecta y el puntaje minimo es 0.
	 * @throws HangmanModelException INVALID_CORRECT_COUNT, si el numero de letras correctas es menor que cero.
	 * 								 INVALID_INCORRECT_COUNT, si el numero de letras incorrectas es menor que cero.
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanModelException {
		return 0;
	}

}
