package componentesDiccionario;
//comentario
public class ListaPalabras {

	private Palabra<String> first;
	private Palabra<String> last;
	
	/**
	 * Constructora: Genera una lista vacia
	 */
	public ListaPalabras() {
		first = null;
		last = null;
	}
	
	/**
	* Añade una palabra a la lista
	* @param palabra: palabra a añadir
	*/
	public void anadirPalabra(Palabra<String> palabra) {
		if (first == null) {
			first = palabra;
			last = palabra;
			palabra.prev = null;
			palabra.next = null;
		} else {
			last.next = palabra;
			palabra.prev = last;
			palabra.next = null;
			last = palabra;
		}
	}
	
	/**
	* Busca una palabra en la lista y la devuelve
	* @param sPalabra: texto de la palabra a buscar
	* @return la Palabra (si está en la lista), null en caso contrario
	*/
	public Palabra<String> buscarPalabra(String sPalabra) {
		Palabra<String> devol = null;
		Palabra<String> actual = first;
		boolean found = false;
		
		while((actual.next != null) && (!found)) {
			if(actual.info.equals(sPalabra)) devol = actual;
		}
		
		return devol;
	}

}
