package componentesDiccionario;

import componentesInternet.ListaWebs;

public class Palabra {

	String info;
	ListaWebs coincidencias;
	
	public Palabra(String pal) {
		info = pal;
		coincidencias = new ListaWebs();
	}

}
