package componentesDiccionario;

import componentesInternet.ListaWebs;

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

}
