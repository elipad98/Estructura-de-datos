package ListaDoblementeEnlazada;

public class NodoDE {
	private Musica datos;
	private NodoDE siguiente,anterior;
	public Musica getDatos() {
		return datos;
	}
	public void setDatos(Musica datos) {
		this.datos = datos;
	}
	public NodoDE getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoDE siguiente) {
		this.siguiente = siguiente;
	}
	public NodoDE getAnterior() {
		return anterior;
	}
	public void setAnterior(NodoDE anterior) {
		this.anterior = anterior;
	}
	
	

	
	

}
