package Trabalho;

import org.junit.Assert;
import org.junit.Test;
 
public class EmpregadoTeste {

	@Test
	public void valorInssTeste() {
		double result;
		Empregado empregado = new Empregado(); 
		empregado.setSalario(1000);
		empregado.setNumFilhos(0);
		result = empregado.calculaINSS();
		Assert.assertEquals(80.0, result, 0.01);
		
		Empregado empregado2 = new Empregado(); 
		empregado2.setSalario(2500);
		empregado2.setNumFilhos(0);
		result = empregado2.calculaINSS();
		Assert.assertEquals(275.0, result, 0.01);
		
		Empregado empregado3 = new Empregado();
		empregado3.setSalario(5000); 
		empregado3.setNumFilhos(0);
		result = empregado3.calculaINSS();
		Assert.assertEquals(513.01, result, 0.01);
		
		Empregado empregado4 = new Empregado();
		empregado4.setSalario(10.000);
		empregado4.setNumFilhos(0);
		result = empregado4.calculaINSS();
		Assert.assertEquals(513.01, result, 0.01);
		
		
		Empregado empregado5 = new Empregado();
		empregado5.setSalario(1000);
		empregado5.setNumFilhos(1);
		result = empregado5.calculaINSS();
		Assert.assertEquals(80.0, result, 0.01);
		
		Empregado empregado6 = new Empregado();
		empregado6.setSalario(2500);
		empregado6.setNumFilhos(1);
		result = empregado6.calculaINSS();
		Assert.assertEquals(275.0, result, 0.01);
		
		Empregado empregado7 = new Empregado();
		empregado7.setSalario(5000);
		empregado7.setNumFilhos(1);
		result = empregado7.calculaINSS();
		Assert.assertEquals(513.01, result, 0.01);
		
		Empregado empregado8 = new Empregado();
		empregado8.setSalario(10.000);
		empregado8.setNumFilhos(1);
		result = empregado8.calculaINSS();
		Assert.assertEquals(513.01, result, 0.01);
		
	} 
	
	@Test
	public void calculaIrTeste() {
		double result;
		Empregado empregado = new Empregado(); 
		empregado.setSalario(1000);
		empregado.setNumFilhos(0);
		result = empregado.calculaIR();
		Assert.assertEquals(0.0, result, 0.01);
		
		Empregado empregado2 = new Empregado(); 
		empregado2.setSalario(2500);
		empregado2.setNumFilhos(0);
		result = empregado2.calculaIR();
		Assert.assertEquals(24.07, result, 0.01);
		
		Empregado empregado3 = new Empregado();
		empregado3.setSalario(5000); 
		empregado3.setNumFilhos(0);
		result = empregado3.calculaIR();
		Assert.assertEquals(373.44, result, 0.01);
		
		Empregado empregado4 = new Empregado();
		empregado4.setSalario(10.000);
		empregado4.setNumFilhos(0);
		result = empregado4.calculaIR();
		Assert.assertEquals(1739.56, result, 0.01);
		
		
		Empregado empregado5 = new Empregado();
		empregado5.setSalario(1000);
		empregado5.setNumFilhos(1);
		result = empregado5.calculaIR();
		Assert.assertEquals(0.0, result, 0.01);
		
		Empregado empregado6 = new Empregado();
		empregado6.setSalario(2500);
		empregado6.setNumFilhos(1);
		result = empregado6.calculaIR();
		Assert.assertEquals(9.86, result, 0.01);
		
		Empregado empregado7 = new Empregado();
		empregado7.setSalario(5000);
		empregado7.setNumFilhos(1);
		result = empregado7.calculaIR();
		Assert.assertEquals(330.78, result, 0.01);
		
		Empregado empregado8 = new Empregado();
		empregado8.setSalario(10.000);
		empregado8.setNumFilhos(1);
		result = empregado8.calculaIR();
		Assert.assertEquals(1687.42, result, 0.01);
	}
	
	@Test
	public void calculaLiquidoTeste() {
		double result;
		Empregado empregado = new Empregado(); 
		empregado.setSalario(1000);
		empregado.setNumFilhos(0);
		result = empregado.calculaSalarioLiq();
		Assert.assertEquals(920.00, result, 0.01);
		
		Empregado empregado2 = new Empregado(); 
		empregado2.setSalario(2500);
		empregado2.setNumFilhos(0);
		result = empregado2.calculaSalarioLiq();
		Assert.assertEquals(2200.93, result, 0.01);
		
		Empregado empregado3 = new Empregado();
		empregado3.setSalario(5000); 
		empregado3.setNumFilhos(0);
		result = empregado3.calculaSalarioLiq();
		Assert.assertEquals(4113.54, result, 0.01);
		
		Empregado empregado4 = new Empregado();
		empregado4.setSalario(10.000);
		empregado4.setNumFilhos(0);
		result = empregado4.calculaSalarioLiq();
		Assert.assertEquals(7747.43, result, 0.01);
		
		
		Empregado empregado5 = new Empregado();
		empregado5.setSalario(1000);
		empregado5.setNumFilhos(1);
		result = empregado5.calculaSalarioLiq();
		Assert.assertEquals(920.00, result, 0.01);
		
		Empregado empregado6 = new Empregado();
		empregado6.setSalario(2500);
		empregado6.setNumFilhos(1);
		result = empregado6.calculaSalarioLiq();
		Assert.assertEquals(2215.14, result, 0.01);
		
		Empregado empregado7 = new Empregado();
		empregado7.setSalario(5000);
		empregado7.setNumFilhos(1);
		result = empregado7.calculaSalarioLiq();
		Assert.assertEquals(4156.21, result, 0.01);
		
		Empregado empregado8 = new Empregado();
		empregado8.setSalario(10.000);
		empregado8.setNumFilhos(1);
		result = empregado8.calculaSalarioLiq();
		Assert.assertEquals(7799.57, result, 0.01);
	}
	
}
