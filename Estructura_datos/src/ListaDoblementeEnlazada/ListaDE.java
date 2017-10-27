package ListaDoblementeEnlazada;

import javax.swing.JOptionPane;

import Unidad3.NodoSimple;

public class ListaDE {
	private NodoDE cola;
	private NodoDE cabeza;
	
	
	
	
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
		NodoDE nunod=new NodoDE();
		nunod.setDatos(datos);// ponemos el valor que recibimos del metodo en el nodo 
		nunod.setAnterior(null);
		nunod.setSiguiente(null);// le asignamos el valor de null al siguiente nodo
		this.cabeza=nunod;
	}
	
	public void insertarPrincipio(Musica datos) {// creamos un metodo con el nombre insertarPrincipio que recivira un valord de tipo entero
		NodoDE nod=new NodoDE();
		if(isVacio()) {// abrimos un if para verificar si el nodo esta vacio 
			this.insertar(datos);// si el nodo esta vacio se inserta el valor 
		}else {// si no esta vacio se hace lo siguiente
			

			nod.setDatos(datos);
			nod.setSiguiente(this.cabeza);
			this.cabeza.setAnterior(nod);
			nod.setAnterior(this.cabeza);// Ponemos en el nodo siguiente el valor que hay en cabeza 
			this.cabeza=nod;// Le asignamos el valor de nuevo a la cabeza
		}
		System.out.println(cabeza.getDatos().getCancion());
		System.out.println(nod.getSiguiente());
	JOptionPane.showMessageDialog(null, "Dato insertado al principio");
	

}
	public void insertarFinal(Musica datos)
	{
		NodoDE nud=new NodoDE();
        if(this.iscolaVacio()){
        nud.setDatos(datos);
        nud.setSiguiente(null);
        this.cola=nud;
        }else{
        
        NodoDE aux = cola;
        while(aux.getSiguiente() != null){
        aux = aux.getSiguiente();
       
        }
        aux.setSiguiente(nud);
        nud.setAnterior(aux);
        

        }
        System.out.println(cola.getDatos().getCancion());
		System.out.println(nud.getAnterior());
        JOptionPane.showMessageDialog(null, "Dato insertado al final");
	}
	public boolean eliminarprimer()// Creamos un metodo de tipo boolean con el nombre eliminar que recibira dos valores enteros
	{
		boolean respuesta=false;
		
	     if (isVacio()!=true){
             NodoDE aux = this.cabeza;
             NodoDE ant = null;
             while (aux != null){
            	 this.cabeza = aux.getSiguiente();
                 aux.setSiguiente(null);
                 aux.setAnterior(null);
                 aux= cabeza;
                 respuesta=true;
                         }
             aux.setAnterior(null);
             aux.setSiguiente(null);
             this.cabeza=null;
             }
	     
	     
	     JOptionPane.showMessageDialog(null,"Nodo eliminado");
		return respuesta;// regresamos el valor de la variable respuesta
	}
	public boolean eliminarultimo()// Creamos un metodo de tipo boolean con el nombre eliminar que recibira dos valores enteros
	{
		boolean respuesta=false;
	     if (isVacio()!=true){
             NodoDE aux = this.cabeza;
             NodoDE ant = null;
             while (aux != null){
            	 this.cabeza =null;
                 aux.setSiguiente(null);
                 aux.setAnterior(null);
                 aux= cabeza;
                 respuesta=true;
                         }
             while(aux.getSiguiente()!=null)
             {
            	 aux=aux.getSiguiente();
             }
             aux.getAnterior().setSiguiente(null);
             aux.setAnterior(null);
             aux.setSiguiente(null);
             this.cabeza=null;
             }
	     JOptionPane.showMessageDialog(null,"Nodo eliminado");

		return respuesta;// regresamos el valor de la variable respuesta
	}
	public StringBuilder imprimiradelante(){
		StringBuilder cadena = new StringBuilder();
		cadena.append("Cabeza/Null <===>");
		NodoDE temporal = this.cabeza;		
		while(temporal!=null){
			cadena.append(temporal.getDatos().getCancion()+"<===>");
			temporal=temporal.getSiguiente();
		}
		cadena.append("Null");
		return cadena;
	}
	public StringBuilder imprimiratras(){
		StringBuilder cadena = new StringBuilder();
		if(isVacio()){
			cadena.append("Null <===> Cabeza/Null");
		}else{
			cadena.append("Null <===>");
			NodoDE temporal = this.cola;
			while(temporal.getSiguiente()!=null){
				temporal=temporal.getSiguiente();
			}
			while(temporal!=null){
				
					cadena.append(temporal.getDatos().getCancion()+"<===>");
					temporal=temporal.getAnterior();
			}
			cadena.append("Cabeza/Null");
		}
		return cadena;
	}
	
}
