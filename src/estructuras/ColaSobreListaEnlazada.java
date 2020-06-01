package estructuras;

import java.util.LinkedList;

/**
 * Implementación de Cola (Queue) basada en una ListaEnlazada.
 * 
 */
public class ColaSobreListaEnlazada<T> implements Cola<T> {

	private LinkedList<T> elementos;
	
	public ColaSobreListaEnlazada() {
		
		elementos = new LinkedList<T>();
	}
	
	@Override
	public boolean estaVacia() {

		return elementos.isEmpty();
	}

	@Override
	public void acolar(T nuevoElemento) {
		
		elementos.addLast(nuevoElemento);
	}

	@Override
	public T desacolar() {

		return null;
	}

	@Override
	public T obtenerFrente() {

		return null;
	}
}
