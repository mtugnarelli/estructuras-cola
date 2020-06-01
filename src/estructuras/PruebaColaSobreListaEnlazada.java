package estructuras;

import org.junit.Assert;
import org.junit.Test;

public class PruebaColaSobreListaEnlazada {

	@Test
	public void alCrearEstaVacia() {
		
		Cola<Integer> cola = new ColaSobreListaEnlazada<Integer>();
		
		Assert.assertTrue(cola.estaVacia());
	}
	
	@Test
	public void acolarUnElemento() {
		
		Cola<String> cola = new ColaSobreListaEnlazada<String>();
		
		cola.acolar("fisica");
		
		Assert.assertFalse(cola.estaVacia());
		Assert.assertEquals("fisica", cola.obtenerFrente());
	}
	
	@Test
	public void acolarDosElementos() {
		
		Cola<String> cola = new ColaSobreListaEnlazada<String>();
		
		cola.acolar("fisica");
		cola.acolar("quimica");
		
		Assert.assertFalse(cola.estaVacia());
		Assert.assertEquals("fisica", cola.obtenerFrente());
	}
	
	@Test
	public void acolarDosElementosLuegoDesacolarUno() {
		
		Cola<String> cola = new ColaSobreListaEnlazada<String>();
		
		cola.acolar("fisica");
		cola.acolar("quimica");
		String desacolado = cola.desacolar();
		
		Assert.assertFalse(cola.estaVacia());
		Assert.assertEquals("fisica", desacolado);
		Assert.assertEquals("quimica", cola.obtenerFrente());
	}
	
	@Test
	public void acolarDosElementosLuegoDesacolarDos() {
		
		Cola<String> cola = new ColaSobreListaEnlazada<String>();
		
		cola.acolar("fisica");
		cola.acolar("quimica");
		String primero = cola.desacolar();
		String segundo = cola.desacolar();
		
		Assert.assertTrue(cola.estaVacia());
		Assert.assertEquals("fisica", primero);
		Assert.assertEquals("quimica", segundo);
	}
	
	@Test(expected = NoExisteElElemento.class)
	public void lanzaExcepcionAlObtenerElTopeSiEstaVacia() {
		
		Cola<Object> cola = new ColaSobreListaEnlazada<Object>();
		
		cola.obtenerFrente();
	}

	@Test(expected = NoExisteElElemento.class)
	public void lanzaExcepcionAlDescacolarSiEstaVacia() {
		
		Cola<Object> cola = new ColaSobreListaEnlazada<Object>();
		
		cola.desacolar();
	}
	
	@Test
	public void acolarDiezElementosConCapacidadInicialDeTres() {
		
		Cola<Integer> cola = new ColaSobreListaEnlazada<Integer>();
		
		cola.acolar(1);
		cola.acolar(2);
		cola.acolar(3);
		cola.acolar(4);
		cola.acolar(5);
		cola.acolar(6);
		cola.acolar(7);
		cola.acolar(8);
		cola.acolar(9);
		cola.acolar(10);
		
		int uno = cola.desacolar();
		int dos = cola.desacolar();
		int tres = cola.desacolar();
		int cuatro = cola.desacolar();
		int cinco = cola.desacolar();
		int seis = cola.desacolar();
		int siete = cola.desacolar();
		int ocho = cola.desacolar();
		int nueve = cola.desacolar();
		int diez = cola.desacolar();
		
		Assert.assertTrue(cola.estaVacia());
		Assert.assertEquals(1, uno);
		Assert.assertEquals(2, dos);
		Assert.assertEquals(3, tres);
		Assert.assertEquals(4, cuatro);
		Assert.assertEquals(5, cinco);
		Assert.assertEquals(6, seis);
		Assert.assertEquals(7, siete);
		Assert.assertEquals(8, ocho);
		Assert.assertEquals(9, nueve);
		Assert.assertEquals(10, diez);
	}
	
	@Test
	public void acolarTresLuegoDesacolarDosLuegoAcolarUnoLuegoDesacolaTodos() {
		
		Cola<String> cola = new ColaSobreListaEnlazada<String>();
		
		cola.acolar("fisica");
		cola.acolar("quimica");
		cola.acolar("biologia");
		String primero = cola.desacolar();
		String segundo = cola.desacolar();
		cola.acolar("matematica");
		String tercero = cola.desacolar();
		String cuarto = cola.desacolar();
		
		Assert.assertTrue(cola.estaVacia());
		Assert.assertEquals("fisica", primero);
		Assert.assertEquals("quimica", segundo);
		Assert.assertEquals("biologia", tercero);
		Assert.assertEquals("matematica", cuarto);
	}
}
