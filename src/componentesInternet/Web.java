package componentesInternet;

public class Web {
	
	private String nombre;
	private int indice;
	private ListaWebs linksSalientes;

	/**
	 * Constructora de la clase Web
	 * @param nombre: el nombre de la web
	 * @param indice: el indice de la web
	 */
	public Web(String nombre, int indice) {
		this.nombre = nombre;
		this.indice = indice;
		linksSalientes = new ListaWebs();
	}
	
	/**
	 * Getter para el atributo nombre
	 * @return nombre: el nombre de la web
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Getter para el atributo indice
	 * @return indice: el indice de la web
	 */
	public int getIndice() {
		return indice;
	}

}
