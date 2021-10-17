package componentesDiccionario;

public class Diccionario {
	
	private static final Diccionario miDiccionario;

	public Diccionario() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Devuelve la única instancia de la clase
	 * @return miDiccionario: la única instancia de la clase Diccionario
	 */
	public static Diccionario getInstance() {
		if(miDiccionario == null) {
			miDiccionario = new Diccionario();
		}
		return miDiccionario;
	}
	
	/**
	* Carga el diccionario desde el fichero indicado
	* @param nomFich: nombre del fichero que contiene el diccionario
	*/
	private void cargarPalabras(String nomFich) {}
	
	/**
	* Asigna a cada palabra del diccionario las webs a las que hace
	* referencia
	* Pre: Internet y el diccionario ya están cargados
	*/
	private void computarWebsDePalabras() {} //Ver ayuda en el PDF
	
	/**
	* Carga el diccionario desde el fichero indicado y asigna a cada palabra
	* del diccionario las webs a las que hace referencia
	* Pre: Internet ya está cargado
	* @param nomFich: nombre del fichero que contiene el diccionario
	*/
	public void inicializar(String nomFich) {}
	
	/**
	* Busca una palabra en el diccionario y la devuelve
	* @param sPalabra: texto de la palabra a buscar
	* @return la Palabra (si está en el diccionario), null en caso contrario
	*/
	public Palabra buscarPalabra(String sPalabra) {
		return null;
	}

}
