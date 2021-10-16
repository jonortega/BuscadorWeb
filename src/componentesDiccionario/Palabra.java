package componentesDiccionario;

public class Palabra<T> {

	String info;
	Palabra<T> next;
	Palabra<T> prev;
	
	public Palabra(String pal) {
		info = pal;
	}

}
