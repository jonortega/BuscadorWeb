package componentesInternet;

import java.util.ArrayList;

public class ListaWebs {
	
	private ArrayList<Web> webs;

	public ListaWebs() {
		webs = new ArrayList<Web>();
	}
	
	/**
	 * Añade una web a la lista
	 * @param web: la web a añadir
	 * PRE: web no está en la lista
	 */
	public void anadirWeb(Web web) {
		webs.add(web);
	}
	
	/**
	* Añade un enlace a una web de la lista
	* @param idWebOrigen: id de la web de origen
	* @param idWebDestino: id de la web de destino
	* PRE: las webs con id idWebOrigen e idWebDestino están en la lista
	*/ 
	public void anadirEnlace(int idWebOrigen, int idWebDestino) {}
	
}
