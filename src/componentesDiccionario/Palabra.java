package componentesDiccionario;

import componentesInternet.ListaWebs;
import componentesInternet.Web;

public class Palabra {

	String info;
	ListaWebs coincidencias;
	
	public Palabra(String pal) {
		info = pal;
		coincidencias = new ListaWebs();
	}
	
	/**
	 * Getter para el atributo info
	 * @return El atributo info
	 */
	public String getInfo() {
		return info;
	}
	
	/**
	 * Getter para el atributo coincidncias
	 * @return El atributo coincidencias
	 */
	public ListaWebs getCoincidencias() {
		return coincidencias;
	}
	
	/**
	 * Imprime la lista de las webs que coinciden con la palabra
	 */
	public void implimirCoincidencias() {
		for(Web w : coincidencias) {
			System.out.println(w.getNombre());
		}
	}

}
