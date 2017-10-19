package estructura;


public class Alumno implements Comparable {
	private String numeroControl;
	private String nombre;
	private String direccion;
	public String getNumeroControl() {
		return numeroControl;
	}
	public void setNumeroControl(String numeroControl) {
		this.numeroControl = numeroControl;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Numero de control: "+this.numeroControl+ " Nombre del alumno: " + this.nombre+ " Direccion del alumno: "+ this.direccion+"]";
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int compareTo(String arg0) {
		return direccion.compareTo(arg0);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Alumno alumno=(Alumno) o;
		return this.getNumeroControl().compareTo(alumno.getNumeroControl());
	}
	public int getMatricula() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
