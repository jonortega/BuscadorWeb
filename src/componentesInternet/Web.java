package componentesInternet;

public class Web {
	
	private int indice;
	private ListaWebs links;

	/**
	 * Constructora de la clase Web
	 * @param nombre: el nombre de la web
	 * @param indice: el indice de la web
	 */
	public Web(int indice) {
		this.indice = indice;
		links = new ListaWebs();
	}
	
	/**
	 * Getter para el atributo indice
	 * @return indice: el indice de la web
	 */
	public int getIndice() {
		return indice;
	}
	
	/**
	 * Añade la web con la que hace enlace la web actual
	 * @param idEnlace: el id de la web con la que existe un enlace
	 */
	public void anadirEnlace(int idEnlace) {
		links.anadirWeb(new Web(idEnlace));
	}

}
