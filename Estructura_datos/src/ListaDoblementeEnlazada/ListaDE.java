package ListaDoblementeEnlazada;

import javax.swing.JOptionPane;

import Unidad3.NodoSimple;

public class ListaDE {
	private NodoDE cola;
	private NodoDE cabeza;
	private NodoDE nd=new NodoDE();
	
	
	
	public NodoDE getCola() {
		return cola;
	}

	public void setCola(NodoDE cola) {
		this.cola = cola;
	}	
	
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
	public boolean iscolaVacio() {// creamos el metodo de tipo booleano isVacio 
		boolean respuesta=true; // creamos una variable boolean con el nombre="respuesta" y la inicializamos en true
		if(this.cola!=null) {// ponemos la condicion de que si la cabeza es diferente a null aga lo que hay dentro del ciclo
			respuesta=false;// asignamos a la variable respuesta un false
		}
		return respuesta;// regresamos la variable respuesta 
	}
	
	public void insertar(Musica datos) {// creamos un  metodo de tipo void con el nombre insertar al cual le mandaremos una variable int con el nombre valor
		nd.setDatos(datos);// ponemos el valor que recibimos del metodo en el nodo 
		nd.setSiguiente(null);// le asignamos el valor de null al siguiente nodo
		this.cabeza=nd;
	}
	
	public void insertarPrincipio(Musica datos) {// creamos un metodo con el nombre insertarPrincipio que recivira un valord de tipo entero
		
		if(this.isVacio()) {// abrimos un if para verificar si el nodo esta vacio 
			this.insertar(datos);// si el nodo esta vacio se inserta el valor 
		}else {// si no esta vacio se hace lo siguiente
			nd.setDatos(datos);
			nd.setSiguiente(this.cabeza);// Ponemos en el nodo siguiente el valor que hay en cabeza 
			this.cabeza=nd;// Le asignamos el valor de nuevo a la cabeza
		}
		System.out.println(cabeza.toString());
		System.out.println(nd.getSiguiente());
	JOptionPane.showMessageDialog(null, "Dato insertado al principio");
	

}
	public void insertarFinal(Musica datos)
	{
        if(this.iscolaVacio()){
        nd.setDatos(datos);
        nd.setSiguiente(null);
        this.cola=nd;
        }else{
        
        NodoDE aux = cola;
        while(aux.getSiguiente() != null){
        aux = aux.getSiguiente();
       
        }
        aux.setSiguiente(nd);
        nd.setAnterior(aux);

        }
	}
	public boolean eliminarprimer()// Creamos un metodo de tipo boolean con el nombre eliminar que recibira dos valores enteros
	{
	     if (isVacio()!=true){
             NodoDE aux = this.cabeza;
             NodoDE ant = null;
             while (aux != null){
                         if (aux.getDatos() == valor ){
                                     if (ant == null){
                                                 inicio = inicio.getSiguiente();
                                                 aux.setSiguiente(null);
                                                 aux= inicio;
                                    
                                     }else {
                                                 ant.setSiguiente(aux.getSiguiente());
                                                 aux.setSiguiente(null);
                                                 aux = ant.getSiguiente();
                                     }                                             
                                     }else{
                                                 ant = aux;
                                                 aux = aux.getSiguiente();
                                     }
                         }
             }
		return respuesta;// regresamos el valor de la variable respuesta
	}
	public StringBuilder imprimiradelante() {// creamos un metodo de tipo StringBuilder con el nombre de imprimir
		StringBuilder cadena=new StringBuilder();// Creamos una instancia para poder usar la clase StringBuilder
		cadena.append("Cabeza-->");// mostramos el mensaje de cabeza al principio
		NodoDE temporal=this.cabeza;//creamos una variable de tipo NodoSimple con el nombre de temporal y le asignamos el valor de la cabeza 
		while(temporal!=null) {// hacemos el recorrido hasta que la cabeza sea diferente a nulo
			cadena.append(temporal.getDatos().getCancion());//Mostramos los datos que se vallan almacenando en temporal 
			cadena.append("-->");// Mostramos una flecha para separar los datos en cada vuelta
			temporal=temporal.getSiguiente();// le asignamos el valor del siguiente nodo a la variable temporal 
		}
		cadena.append("NULL");// mostramos el mensaje de null al final de la lista
		System.out.println(cadena);
		return cadena;// regresamos el valor de cadena 
	}
	
}
