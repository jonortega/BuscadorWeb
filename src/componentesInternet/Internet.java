package componentesInternet;

public class Internet {
	
	private static final Internet miInternet;

	private Internet() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Devuelve la única instancia de la clase
	 * @return miInternet: la única instancia de la clase Internet
	 */
	public static Internet getInstance() {
		if(miInternet == null) {
			miInternet = new Internet();
		}
		return miInternet;
	}
	
	/**
	* Carga las webs contenidas en el fichero indicado
	* @param nomFich: nombre del fichero que contiene las webs
	*/
	private void cargarWebs(String nomFich) {} //Ver ayuda en el PDF
	
	/**
	* Carga los enlaces contenidos en el fichero indicado
	* @param nomFich: nombre del fichero que contiene los enlaces
	*/
	private void cargarEnlaces(String nombFich) {} //Ver ayuda en el PDF
	
	/**
	* Inicializa la clase cargando las webs y los enlaces
	* @param nomFichWebs: nombre del fichero que contiene las webs
	* @param nomFichEnlaces: nombre del fichero que contiene los enlaces
	*/
	public void inicializar(String nomFickWebs, String nomFickEnlaces) {}
	
	/**
	* Dado un string que contiene una palabra, imprime por pantalla las webs
	* que tienen dicha palabra clave
	* @param sPalabra: string con la palabra
	*/
	public void buscadorWeb(String sPalabra) {}

}
