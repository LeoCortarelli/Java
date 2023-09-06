package aplicacao.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import aplicacao.Calcula;

public class CalculaTeste {
	
	@Test
	public void testeSoma() {
		double result;
		
		Calcula calc = new Calcula();
		result = calc.soma(5.0, 10.0);
		
		Assert.assertEquals(15.0, result, 0);
		
		//-----------------------------------------
		
		Calcula calc2 = new Calcula();
		result = calc2.soma(3.0, -5.0);
		
		Assert.assertEquals(-2.0, result, 0);
		
	
		//-----------------------------------------
		
		Calcula calc3 = new Calcula();
		result = calc3.soma(-15.0, 30.0);
		
		Assert.assertEquals(15.0, result, 0);
		

		//-----------------------------------------
		
		Calcula calc4 = new Calcula();
		result = calc3.soma(-5.0, -8.0);
		
		Assert.assertEquals(-13.0, result, 0);
	}
	
	
	
	@Test
	public void testeSubtrai() {
		double result2;
		Calcula calc5 = new Calcula();
		result2 = calc5.subtrai(10.0, 5.0);
		
		Assert.assertEquals(5, result2, 0);
		
		//-----------------------------------------
		
		Calcula calc6 = new Calcula();
		result2 = calc6.subtrai(13.0, -5.0);
		
		Assert.assertEquals(18, result2, 0);
		
		//-----------------------------------------
		
		Calcula calc7 = new Calcula();
		result2 = calc7.subtrai(-15.0, 30.0);
		
		Assert.assertEquals(-45, result2, 0);
		
		//-----------------------------------------
		
		Calcula calc8 = new Calcula();
		result2 = calc8.subtrai(-5.0, -8.0);
				
		Assert.assertEquals(-3, result2, 0);
	}
	
	
	
	@Test
	public void testeMultiplica() {
		double result3;
		Calcula calc9 = new Calcula();
		result3 = calc9.multiplica(10.0, 5.0);
		
		Assert.assertEquals(5, result3, 0);
		
		//-----------------------------------------
		
		Calcula calc10 = new Calcula();
		result3 = calc10.multiplica(13.0, -5.0);
		
		Assert.assertEquals(18, result3, 0);
		
		//-----------------------------------------
		
		Calcula calc11 = new Calcula();
		result3 = calc11.multiplica(-15.0, 30.0);
		
		Assert.assertEquals(-45, result3, 0);
		
		//-----------------------------------------
		
		Calcula calc12 = new Calcula();
		result3 = calc12.multiplica(-5.0, -8.0);
				
		Assert.assertEquals(-3, result3, 0);
	}
	
	@Test
	public void testeSubtraiDecimal() {
		double resultTestSubtraiDecimal;
		Calcula calc13 = new Calcula();
		resultTestSubtraiDecimal = calc13.subtrai(10.3, 4.1);
		Assert.assertEquals(6.2, resultTestSubtraiDecimal, 0.00001);
		
	}
	
	
	
	@Test
	public void testeParImpar() {
		String result;
		
		Calcula parOuImpar = new Calcula();
		result = parOuImpar.par_impar(2);
		Assert.assertEquals("PAR", result);
		
		
		result = parOuImpar.par_impar(1);
		Assert.assertEquals("IMPAR", result);
		
		result = parOuImpar.par_impar(-2);
		Assert.assertNull(result);
	}
	
	
	@Test
	public void testeMaior() {
		boolean result;
		
		Calcula maior = new Calcula();
		
		result = maior.maior(2, 1);
		Assert.assertTrue(result);
		
		result = maior.maior(5, 10);
		Assert.assertFalse(result);
	}
}
