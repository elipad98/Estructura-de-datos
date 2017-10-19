package ListaDoblementeEnlazada;

public class NodoDE {
	private String genero,cancion,album,artista;
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	private int id;
	private NodoDE siguiente,anterior;
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCancion() {
		return cancion;
	}
	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
