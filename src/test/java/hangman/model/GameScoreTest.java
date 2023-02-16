package hangman.model;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Clases de equivalencia: El numero de letras correctas sea igual o menor a cero, 
 * el numero de letras correctas sea igual o mayor a cero, el numero de letras 
 * incorrectas sea igual o menor a cero y el numero de letras incorrectas sea igual 
 * o mayor a cero, 
 * Condiciones de frontera: Numero de letras incorrectas igual a -1 y 0, 
 * numero de letras correctas igual a -1 y 0.
 * @author jefer.gonzalez
 * @version 1.0 (02/16/2023)
 */
public class GameScoreTest {
	
	/*
	 * Pruebas de PowerScore
	 */
	
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasCorrectasEnPowerScoreEsMenorACero() {
        try { 
        	PowerScore score = new PowerScore();
        	score.calculateScore(-5, 10);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasIncorrectasEnPowerScoreEsMenorACero() {
        try { 
        	PowerScore score = new PowerScore();
        	score.calculateScore(10, -5);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasCorrectasEnPowerScoreEsMenosUno() {
        try { 
        	PowerScore score = new PowerScore();
        	score.calculateScore(-1, 10);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasIncorrectasEnPowerScoreEsMenosUno() {
        try { 
        	PowerScore score = new PowerScore();
        	score.calculateScore(10, -1);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void pruebaNumerosMayoresA0Correctas3Incorrectas4ConPowerScoreResultado93() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(score.calculateScore(3, 4), 93);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void pruebaPuntajeMayorA500Resultado500() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(score.calculateScore(4, 10), 500);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void pruebaPuntajeMenorA0Resultado0ConPowerScore() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(score.calculateScore(2, 10), 0);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasCorrectasEsIgualA0ConPowerScore() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(score.calculateScore(0, 4), 0);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasIncorrectasEsIgualA0ConPowerScore() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(score.calculateScore(3, 0), 125);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    
	/*
	 * Pruebas de OriginalScore
	 */
    
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasCorrectasEnOriginalScoreEsMenorACero() {
        try { 
        	OriginalScore score = new OriginalScore();
        	score.calculateScore(-1, 3);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasIncorrectasEnOriginalScoreEsMenorACero() {
        try { 
        	OriginalScore score = new OriginalScore();
        	score.calculateScore(3, -1);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasCorrectasEnOriginalScoreEsMenosUno() {
        try { 
        	OriginalScore score = new OriginalScore();
        	score.calculateScore(-1, 8);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasIncorrectasEnOriginalScoreEsMenosUno() {
        try { 
        	OriginalScore score = new OriginalScore();
        	score.calculateScore(8, -1);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void pruebaNumerosMayoresA0Correctas3Incorrectas5ConOriginalScoreResultado50() {
    	try {
    		OriginalScore score = new OriginalScore();
			assertEquals(score.calculateScore(3, 5), 50);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void pruebaPuntajeMenorA0Resultado0ConOriginalScore() {
    	try {
    		OriginalScore score = new OriginalScore();
			assertEquals(score.calculateScore(6, 12), 0);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasCorrectasEsIgualA0ConOriginalScore() {
    	try {
    		OriginalScore score = new OriginalScore();
			assertEquals(score.calculateScore(0, 5), 50);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasIncorrectasEsIgualA0ConOriginalScore() {
    	try {
    		OriginalScore score = new OriginalScore();
			assertEquals(score.calculateScore(8, 0), 100);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
	/*
	 * Pruebas de BonusScore
	 */
    
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasCorrectasEnBonusScoreEsMenorACero() {
        try { 
        	BonusScore score = new BonusScore();
        	score.calculateScore(-1, 5);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasIncorrectasEnBonusScoreEsMenorACero() {
        try { 
        	BonusScore score = new BonusScore();
        	score.calculateScore(5, -1);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasCorrectasEnBonusScoreEsMenosUno() {
        try { 
        	BonusScore score = new BonusScore();
        	score.calculateScore(-1, 15);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void deberiaLanzarUnaExcepcionSiElNumeroDeLetrasIncorrectasEnBonusScoreEsMenosUno() {
        try { 
        	BonusScore score = new BonusScore();
        	score.calculateScore(15, -1);
            fail("Did not throw exception");
        } catch (HangmanModelException e) {
            assertEquals(HangmanModelException.INVALID_INCORRECT_COUNT, e.getMessage());
        }  
    } 
    
    @Test
    public void pruebaNumerosMayoresA0Correctas6Incorrectas5ConBonusScoreResultado35() {
    	try {
    		BonusScore score = new BonusScore();
			assertEquals(score.calculateScore(6, 5), 35);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void pruebaPuntajeMenorA0Resultado0ConBonusScore() {
    	try {
    		BonusScore score = new BonusScore();
			assertEquals(score.calculateScore(6, 12), 0);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasCorrectasEsIgualA0ConBonusScore() {
    	try {
    		BonusScore score = new BonusScore();
			assertEquals(score.calculateScore(0, 4), -20);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasIncorrectasEsIgualA0ConBonusScore() {
    	try {
    		BonusScore score = new BonusScore();
			assertEquals(score.calculateScore(8, 0), 80);
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
}
