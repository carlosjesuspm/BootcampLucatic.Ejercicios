import org.junit.Assert;
import org.junit.jupiter.api.Test;


import model.StringCalculator;

class testStringCalculator {

	
	// Requisito 1: El método puede tomar 0, 1 o 2 números separados por coma 
	
	RuntimeException exception;
	
	@Test
	public final void WhenMoreThan2NumbersAreUsedTheExceptionIsThrown() {
		
		exception = Assert.assertThrows(RuntimeException.class,()->{
			StringCalculator.Add("1,2,3");
		});
		Assert.assertTrue(exception.getMessage().contains("RuntimeException"));
		
	}

	@Test
	public final void when2NumbersAreUsedThenNotExceptionIsThrown() {
		StringCalculator.Add("1,2");
		Assert.assertTrue(true);
	}
	
	@Test
	public final void WhenNoNumbersIsUsedTheExceptionIsThrown() {
		
		exception = Assert.assertThrows(RuntimeException.class,()->{
			StringCalculator.Add("1,x");
		});
		Assert.assertTrue(exception.getMessage().contains("RuntimeException"));
	}
	
	
	// Requisito 2: Para una cadena vacía el método devolverá 0. 
	
	@Test
	public final void WhenEmptyStringIsUsedThenReturnValueIs0() {
		
		Assert.assertEquals(0, StringCalculator.Add(""));
	}
	
	
	// Requisito 3: el método devolverá la suma de los números
	
	@Test
	
	public final void WhenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
		Assert.assertEquals(1, StringCalculator.Add("1"));
		
	}
	
	
	@Test
	public final void WhenTwoNumberIsUsedThenReturnValueIsTheirSum() {
		Assert.assertEquals(1+2, StringCalculator.Add("1,2"));
	}
	
	
	// Requisito 4: Permitir que el método Add() soporte una cantidad desconocida de números
	
	@Test
	public final void WhenTheAddMethodHandleAnKnownAmountOfNumbers() {
		Assert.assertEquals(1+2+3+4+5+6+7+8, StringCalculator.Add("1,2,3,4,5,6,7,8"));
	}	
	
	
	// Requisito 5: Permitir al método Add() soportar nuevas líneas entre números (en vez de comas)
	
	@Test
	public final void WhenTheAddMethodHandleNewLinesBetweenNumbersThenReturnTheirSum() {
		
		Assert.assertEquals(1+2+3+4+5+6+7+8, StringCalculator.Add("1n2,3,4,5,6k7,8"));
		
	}
	
}