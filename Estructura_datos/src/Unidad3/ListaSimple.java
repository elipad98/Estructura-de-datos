package Unidad3; //Nombre del paquete al que pertenece la clase

public class ListaSimple {// Inicio de la clase Lista Simple
	private NodoSimple cabeza; // Creamos una variable del tipo Nodo Simple
	
		public ListaSimple() { // Creamos un metodo publico con el nombre ListaSimple
			this.cabeza=null;// Mandamos llamar a la variable cabeza y la inicializamos en null
		}// fin del metodo ListaSimple 
		
		public NodoSimple getCabeza() { // creamos setters and getters de cabeza
			return cabeza;
		}
		
		public void setCabeza(NodoSimple cabeza) {
			this.cabeza = cabeza;
		}
		
		public boolean isVacio() {// creamos el metodo de tipo booleano isVacio 
			boolean respuesta=true; // creamos una variable boolean con el nombre="respuesta" y la inicializamos en true
			if(this.cabeza!=null) {// ponemos la condicion de que si la cabeza es diferente a null aga lo que hay dentro del ciclo
				respuesta=false;// asignamos a la variable respuesta un false
			}
			return respuesta;// regresamos la variable respuesta 
		}
		
		public void insertar(int valor) {// creamos un  metodo de tipo void con el nombre insertar al cual le mandaremos una variable int con el nombre valor
			NodoSimple nuevo=new NodoSimple();// Creamos una instancia con el nombre de nuevo, la cual nos va a referenciar a la clase NodoSimple
			nuevo.setDato(valor);// ponemos el valor que recibimos del metodo en el nodo 
			nuevo.setSiguiente(null);// le asignamos el valor de null al siguiente nodo
			this.cabeza=nuevo;// le asignamos a cabeza el valor del nuevo nodo
		}
		
		public void insertarPrincipio(int valor) {// creamos un metodo con el nombre insertarPrincipio que recivira un valord de tipo entero
			if(this.isVacio()) {// abrimos un if para verificar si el nodo esta vacio 
				this.insertar(valor);// si el nodo esta vacio se inserta el valor 
			}else {// si no esta vacio se hace lo siguiente
				NodoSimple nuevo=new NodoSimple();// Creamos una instancia con el nombre de nuevo de tipo NodoSimple
				nuevo.setDato(valor);// ponemos el valor que recibimos del metodo en el nodo
				nuevo.setSiguiente(this.cabeza);// Ponemos en el nodo siguiente el valor que hay en cabeza 
				this.cabeza=nuevo;// Le asignamos el valor de nuevo a la cabeza
			}
		}
		
		public void insertarFinal(int valor) {//creamos un  metodo de tipo void con el nombre insertarFinal al cual le mandaremos una variable int con el nombre valor
			if(this.isVacio()) {// verificamos si la lista esta vacia
				this.insertar(valor);//en caso de que este vacia se inserta el valor en la lista
			}else {// si no es asi se realiza lo siguiente
				NodoSimple nuevo=new NodoSimple();//Creamos una instancia con el nombre de nuevo referenciando a la clase NodoSimple
				nuevo.setDato(valor);// Insertamos en el nodo el valor que recibimos 
				nuevo.setSiguiente(null);//Ponemos el siguiente nodo en null 
				
				NodoSimple temporal=this.cabeza;// creamos una variable de tipo Nodosimple donde guardaremos el valor de la cabeza del nodo
				while(temporal.getSiguiente()!=null) {// Hacemos el recorrido de la lista hasta que el valor del siguiente nodo sea null
					temporal=temporal.getSiguiente();
				}
				temporal.setSiguiente(nuevo);// ponemos el nuevo valor en la ultima  posicion de la lista
			}
		}
		public int contar() {// Creamos un metodo con el nombre de contar, que nos regresara un valor entero
			int respuesta=0;// creamos una variable con el nombre de respuesta de tipo entero y la inicializamos en 0
			NodoSimple temporal=this.cabeza;// Creamos una variable de tipo NodoSimple con el nombre de temporal que va a tener el valor de la cabeza del nodo
			while(temporal!=null) {//Mientras que el nodo sea diferente a nulo se recorre la lista
				respuesta++;//se incrementa la variable respuesta
				temporal=temporal.getSiguiente();//se recorre el nodo
			}
			return respuesta;// se regresa el valor de la variable respuesta
		}
		public NodoSimple encontrar(int posicion) {// Creamos un metodo de tipo NodoSimple con el nombre encontrar que recibira un valor entero
			NodoSimple temporal=this.cabeza;//Creamos una variable de tipo NodoSimple con el nombre de temporal que va a almacenar el valor de la cabeza del nodo
			NodoSimple anterior=null;//Creamos una variable de tipo  NodoSimple con el nombre anterior que tendra el valor de null
			int i=0;// creamos una variable de tipo entero que nos servira de contador
			while(i<posicion) {// recorremos la lista
				i++;//incrementamos i
				anterior=temporal;//asignamos al nodo anterior el nodo temporal para no perderlo
				temporal=temporal.getSiguiente();//asignamos a temporal el valor del nodo siguiente
			}
			return anterior;// se regresa el valor de anterior
		}
		public void insertarPosicion(int valor, int posicion) {// Creamos un metodo de tipo void con el nombre insertarPosicion que recibira dos valores enteros
			if(posicion>0 && this.contar()>1 && posicion<=this.contar()) {// verificamos que la lista tenga almenos una posicion
				if(posicion==1) {// si tiene una posicion se inserta al principio el valor que se recibe 
					this.insertarPrincipio(valor);
				}else if(posicion==this.contar()) {// si el numero que recibe para la posicion es igual a el final del array se inserta ahi
					this.insertarFinal(valor);
				}else {// si no se busca la posicion
					NodoSimple anterior=this.encontrar(posicion-1);// Creamos una variable de tipo NodoSimple con el nombre anterior que va a tener el valor de la posicion anterior a la que buscamos
					NodoSimple nuevo=new NodoSimple();//Creamos una instancia con el nombre de nuevo referenciando a la clase NodoSimple
					nuevo.setDato(valor);// Insertamos en el nodo el valor que recibimos 
					nuevo.setSiguiente(anterior.getSiguiente());// asignamos al siguiente nodo el valor que contenia el nodo anterior 
					anterior.setSiguiente(nuevo);// le asignamos el valor de nuevo, a la variable anterior
				}
				
			}
		}
		public boolean localizar(int valor) {// creamos un metodo de tipo booleano con el nombre de localizar que recibira un valor entero
			boolean respuesta=false;// creamos una variable de tipo booleano y la inicializamos en false
			
			NodoSimple temporal=this.cabeza;// creamos una variable de tipo NodoSimple con el nombre de temporal y le damos el valor de la cabeza
			while(temporal!=null) {// mientras 	que la cabeza no sea nula se hace el recorrido 
				if(temporal.getDato()==valor) {// si el valor de la cabeza es igual al valor que recibimos
					respuesta=true;// si la condicion se cumple true ahora va a contener el valor de true
				}
				temporal=temporal.getSiguiente();// se le asigna el valor de el siguiente nodo a la variable temporal
			}
			
			return respuesta;// se regresa la variable respuesta
		}
		
		public void buscar(int valor) {// creamos un metodo de tipo void con el nombre de buscar que recibira un valor entero
			boolean respuesta=false;//creamos una variable de tipo boolean y la inicializamos en false
			
			NodoSimple temporal=this.cabeza;// creamos una variable de tipo NodoSimple con el nombre de temporal que almacenara el valor de la cabeza del nodo
			while(temporal!=null) {// hacemos el recorrido de la lista mientras que la cabeza del nodo no apunte a nulo 
				if(temporal.getDato()==valor) {// si el valor de la variable temporal es igual a el valor que recibimos se hace lo siguiente
					respuesta=true;// se le asigna el valor de true a la variable respuesta
					System.out.println("El valor encontrado es:"+temporal.getDato());// mostramos un mensaje con el dato que encontramos
				}
				temporal=temporal.getSiguiente();// le asignamos a la variable temporal el valor del siguiente nodo
			}
			if(respuesta==false) {// si la variable respuesta tiene un valor falso se muestra el siguiente mensaje
				System.out.println("El valor no fue encontrado");
			}
			
		}
		
		public boolean eliminar(int valor,int posicion)// Creamos un metodo de tipo boolean con el nombre eliminar que recibira dos valores enteros
		{
			boolean respuesta=false;// creamos una variable de tipo boolean y la inicializamos en false
			if(posicion==1)// si la posicion que recibimos es igual a 1 se hace lo siguiente
			{
				this.setCabeza(this.cabeza.getSiguiente());// insertamos el valor de el nodo que estaba despues de el nodo que eliminamos en el nodo que eliminamos
				respuesta=true;// le damos el valor de true a la variable respuesta
			}else// si la posicion no es igual a 1 entonces se hace lo siguiente
			{
				NodoSimple temporal=this.encontrar(posicion-1);//cremos una variable de tipo NodoSimple que va a ser igual a la posicion que buscamos -1
				temporal.setSiguiente(temporal.getSiguiente().getSiguiente());//ponemos el valor del nodo que esta despues del nodo que eliminamos en el nodo que eliminamos y lo referenciamos con el de atras
				respuesta=true;// le damos el valor de true a la variable respuesta
			}
			return respuesta;// regresamos el valor de la variable respuesta
		}
		
		public StringBuilder imprimir() {// creamos un metodo de tipo StringBuilder con el nombre de imprimir
			StringBuilder cadena=new StringBuilder();// Creamos una instancia para poder usar la clase StringBuilder
			cadena.append("Cabeza-->");// mostramos el mensaje de cabeza al principio
			NodoSimple temporal=this.cabeza;//creamos una variable de tipo NodoSimple con el nombre de temporal y le asignamos el valor de la cabeza 
			while(temporal!=null) {// hacemos el recorrido hasta que la cabeza sea diferente a nulo
				cadena.append(temporal.getDato());//Mostramos los datos que se vallan almacenando en temporal 
				cadena.append("-->");// Mostramos una flecha para separar los datos en cada vuelta
				temporal=temporal.getSiguiente();// le asignamos el valor del siguiente nodo a la variable temporal 
			}
			cadena.append("NULL");// mostramos el mensaje de null al final de la lista
			return cadena;// regresamos el valor de cadena 
		}

}