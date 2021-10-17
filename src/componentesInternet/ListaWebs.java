package componentesInternet;

import java.util.ArrayList;

public class ListaWebs {
	
	private ArrayList<Web> miLista;

	public ListaWebs() {
		miLista = new ArrayList<Web>();
	}
	
	/**
	 * Añade una web a la lista
	 * @param web: la web a añadir
	 * PRE: web no está en la lista
	 */
	public void anadirWeb(Web web) {
		miLista.add(web);
	}
	
	/**
	* Añade un enlace a una web de la lista
	* @param idWebOrigen: id de la web de origen
	* @param idWebDestino: id de la web de destino
	* PRE: las webs con id idWebOrigen e idWebDestino están en la lista
	*/ 
	public void anadirEnlace(int idWebOrigen, int idWebDestino) {
		//TODO Buscar la web de origen en la lista y añadirle las web destino
		/*
		 * Si sabemos que los indices van a estar siempre en orden en el archivo,
		 * se puede guardar en orden el el ArrayList y así acceder directamente
		 * a esa posición.
		 * 
		 * Si pueden venir desordenadors, hayq ue mirar en cada posición del
		 * ArrayList el valor de su atributo indice hasta que coincida.
		 * En este caso hay que usar algún algoritmo de búsqueda eficiente.
		 */
	}
	
}
