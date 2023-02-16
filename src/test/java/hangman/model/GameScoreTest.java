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
            assertEquals(HangmanModelException.INVALID_CORRECT_COUNT, e.getMessage());
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
            assertEquals(HangmanModelException.INVALID_CORRECT_COUNT, e.getMessage());
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
			assertEquals(93, score.calculateScore(3, 4));
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void pruebaPuntajeMayorA500Resultado500() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(500, score.calculateScore(4, 10));
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void pruebaPuntajeMenorA0Resultado0ConPowerScore() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(0, score.calculateScore(2, 10));
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasCorrectasEsIgualA0ConPowerScore() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(0, score.calculateScore(0, 4));
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasIncorrectasEsIgualA0ConPowerScore() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(125, score.calculateScore(3, 0));
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
            assertEquals(HangmanModelException.INVALID_CORRECT_COUNT, e.getMessage());
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
            assertEquals(HangmanModelException.INVALID_CORRECT_COUNT, e.getMessage());
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
			assertEquals(50, score.calculateScore(3, 5));
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void pruebaPuntajeMenorA0Resultado0ConOriginalScore() {
    	try {
    		OriginalScore score = new OriginalScore();
			assertEquals(0, score.calculateScore(6, 12));
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasCorrectasEsIgualA0ConOriginalScore() {
    	try {
    		OriginalScore score = new OriginalScore();
			assertEquals(50, score.calculateScore(0, 5));
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasIncorrectasEsIgualA0ConOriginalScore() {
    	try {
    		OriginalScore score = new OriginalScore();
			assertEquals(100, score.calculateScore(8, 0));
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
            assertEquals(HangmanModelException.INVALID_CORRECT_COUNT, e.getMessage());
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
            assertEquals(HangmanModelException.INVALID_CORRECT_COUNT, e.getMessage());
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
			assertEquals(35, score.calculateScore(6, 5));
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void pruebaPuntajeMenorA0Resultado0ConBonusScore() {
    	try {
    		BonusScore score = new BonusScore();
			assertEquals(0, score.calculateScore(6, 12));
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasCorrectasEsIgualA0ConBonusScore() {
    	try {
    		BonusScore score = new BonusScore();
			assertEquals(0, score.calculateScore(0, 4));
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
    
    @Test
    public void noDeberiaLanzarExcepcionSiElNumeroDeLetrasIncorrectasEsIgualA0ConBonusScore() {
    	try {
    		BonusScore score = new BonusScore();
			assertEquals(80, score.calculateScore(8, 0));
		} catch (HangmanModelException e) {
			fail("Threw a exception");
		} 
    } 
}
