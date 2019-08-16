package controladora;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControladoraTest {

	@Test
	public void executarTest1() {
		Controladora controladora = new Controladora();
		assertEquals("001234321000", controladora.executar("..P...O....."));
	}
	
	@Test
	public void executarTest2() {
		Controladora controladora = new Controladora();
		assertEquals("012345", controladora.executar(".P...."));
	}
	
	@Test
	public void executarTest3() {
		Controladora controladora = new Controladora();
		assertEquals("000122222345", controladora.executar("...P.P...P.."));	
	}
	
	@Test
	public void executarTest4() {
		Controladora controladora = new Controladora();
		assertEquals("123210", controladora.executar("P..O.."));	
	}
	
	@Test
	public void executarTest5() {
		Controladora controladora = new Controladora();
		assertEquals("123333343210", controladora.executar("P..P...PO..."));
	}
	
	@Test
	public void executarTest6() {
		Controladora controladora = new Controladora();
		assertEquals("123432344444555", controladora.executar("P...O.O.P...P.."));
	}
	
	@Test
	public void executarTest7() {
		Controladora controladora = new Controladora();
		assertEquals("123455433332100", controladora.executar("P.....P.P..P..."));
	}
	
	@Test
	public void executarTest8() {
		Controladora controladora = new Controladora();
		assertEquals("000001234555555", controladora.executar("O..O.P......O.."));
	}
	
	@Test
	public void executarTest9() {
		Controladora controladora = new Controladora();
		assertEquals("11223", controladora.executar("PPPPP"));
	}
	
	@Test
	public void executarTest10() {
		Controladora controladora = new Controladora();
		assertEquals("121212", controladora.executar("P.OOOO"));
	}
	
	

}
