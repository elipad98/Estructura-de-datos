package ListaDoblementeEnlazada;

public class Musica {
	private String genero,cancion,album,artista;
	int id;
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
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String ToString(){
		String cad = "ID: "+this.getId()+"| Cancion: "+this.getCancion()+"| Autor: "+this.getArtista()+"| Album: "+this.getAlbum()+"| Genero: "+this.getGenero(); 
		return cad;
	}

}
