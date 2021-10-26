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
		internet.inicializar("./data/smallindex", "./data/smallpld-arc");
		
		Diccionario diccionario = Diccionario.getInstance();
		diccionario.inicializar("./data/words.txt");
		
		System.out.println();
		
		int opcion = 1;
		Scanner sc = new Scanner(System.in);
		String pal;
		while(opcion!=0) {
			System.out.println("Que deseas hacer?");
			System.out.println("1. Buscar webs por palabra clave");
			System.out.println("0. Salir");
			System.out.println();
			System.out.print("Seleccion: ");
			opcion = Integer.parseInt(sc.nextLine());
			switch(opcion) {
			case 1: 
				System.out.println();
				System.out.print("Introduce una palabra: ");
				pal = sc.nextLine();
				System.out.println();
				System.out.println("------RESULTADOS------");
				internet.buscadorWeb(pal);
				break;
			default: 
				break;
			}
		}
		sc.close();

	}

}