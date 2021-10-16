package fase1;

import java.io.IOException;
import java.util.Scanner;

import componentesDiccionario.Diccionario;
import componentesInternet.Internet;

public class AplicacionWeb {

	public AplicacionWeb() {
		
	}

	public static void main(String[] args) throws IOException {
		
		Internet internet = Internet.getInstance();
		internet.inicializar(null, null); //TO DO: inicializar Internet
		
		Diccionario diccionario = Diccionario.getInstance();
		diccionario.inicializar(null); //TO DO: inicializar Diccionario
		
		int opcion = 1;
		Scanner sc = new Scanner(System.in);
		String pal;
		while(opcion!=0) {
			System.out.println("Que deseas hacer?");
			System.out.println("1. Buscar webs por palabra clave");
			System.out.println("0. Salir");
			opcion = Integer.parseInt(sc.nextLine());
			switch(opcion) {
			case 1: //TO DO
				    break;
			default: break;
			}
		}
		sc.close();

	}

}