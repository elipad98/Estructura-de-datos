package ListaDoblementeEnlazada;

import javax.swing.JOptionPane;

import Unidad3.NodoSimple;

public class ListaDE {
	private NodoDE cola;
	public NodoDE getCola() {
		return cola;
	}

	public void setCola(NodoDE cola) {
		this.cola = cola;
	}

	private NodoDE cabeza; // Creamos una variable del tipo Nodo Simple
	
	public ListaDE() { // Creamos un metodo publico con el nombre ListaSimple
		this.cabeza=null;// Mandamos llamar a la variable cabeza y la inicializamos en null
	}// fin del metodo ListaSimple 
	
	public NodoDE getCabeza() { // creamos setters and getters de cabeza
		return cabeza;
	}
	
	public void setCabeza(NodoDE cabeza) {
		this.cabeza = cabeza;
	}
	
	public boolean isVacio() {// creamos el metodo de tipo booleano isVacio 
		boolean respuesta=true; // creamos una variable boolean con el nombre="respuesta" y la inicializamos en true
		if(this.cabeza!=null) {// ponemos la condicion de que si la cabeza es diferente a null aga lo que hay dentro del ciclo
			respuesta=false;// asignamos a la variable respuesta un false
		}
		return respuesta;// regresamos la variable respuesta 
	}
	
	public void insertar(String Id,String genero,String artista,String cancion,String album) {// creamos un  metodo de tipo void con el nombre insertar al cual le mandaremos una variable int con el nombre valor
		int idint;
		idint=Integer.parseInt(Id);
		NodoDE nuevo=new NodoDE();// Creamos una instancia con el nombre de nuevo, la cual nos va a referenciar a la clase NodoSimple
		nuevo.setId(idint);// ponemos el valor que recibimos del metodo en el nodo
		nuevo.setGenero(genero);
		nuevo.setArtista(artista);
		nuevo.setCancion(cancion);
		nuevo.setAlbum(album);
		nuevo.setSiguiente(null);// le asignamos el valor de null al siguiente nodo
		this.cabeza=nuevo;// le asignamos a cabeza el valor del nuevo nodo
	}
	
	public void insertarPrincipio(String Id,String genero,String Artista,String Cancion,String Album) {// creamos un metodo con el nombre insertarPrincipio que recivira un valord de tipo entero
		int idint;
		idint=Integer.parseInt(Id);
		if(this.isVacio()) {// abrimos un if para verificar si el nodo esta vacio 
			this.insertar(Id, genero, Artista, Cancion, Album);// si el nodo esta vacio se inserta el valor 
		}else {// si no esta vacio se hace lo siguiente
			NodoDE nuevo=new NodoDE();// Creamos una instancia con el nombre de nuevo de tipo NodoSimple
			nuevo.setId(idint);// ponemos el valor que recibimos del metodo en el nodo
			nuevo.setGenero(genero);
			nuevo.setArtista(Artista);
			nuevo.setCancion(Cancion);
			nuevo.setAlbum(Album);
			nuevo.setSiguiente(this.cabeza);// Ponemos en el nodo siguiente el valor que hay en cabeza 
			this.cabeza=nuevo;// Le asignamos el valor de nuevo a la cabeza
		}
	JOptionPane.showMessageDialog(null, "Dato insertado al principio");
	

}
	
}
