package componentesDiccionario;

//prueba push

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import componentesInternet.Web;


public class Diccionario {
	
	private static Diccionario miDiccionario;
	private ListaPalabras palabras;

	/**
	 * Constructora de la clase Diccionario
	 */
	public Diccionario() {
		palabras = new ListaPalabras();
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
	private void cargarPalabras(String nomFich) {
		try {
			Scanner fe = new Scanner(new FileReader(nomFich));
			
			while(fe.hasNext()) {
				//Obtener la palabra desde el fichero
				String nuevaPalabraString = fe.nextLine().trim();
				
				//Crear una web nueva y añadirla a la lista de webs
				Palabra nuevaPalabra = new Palabra(nuevaPalabraString);
				palabras.anadirPalabra(nuevaPalabra);
			}
			fe.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido leer el archivo");
		}
	}
	
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
	public void inicializar(String nomFich) {
		cargarPalabras(nomFich);
		computarWebsDePalabras();
	}
	
	/**
	* Busca una palabra en el diccionario y la devuelve
	* @param sPalabra: texto de la palabra a buscar
	* @return la Palabra (si está en el diccionario), null en caso contrario
	*/
	public Palabra buscarPalabra(String sPalabra) {
		return palabras.buscarPalabra(sPalabra);
	}

}
