package estructura;

public class busquedaSecuencial {
	
	public boolean buscarnc(String nc, Alumno[] a)
	{
		boolean respuesta=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i].getNumeroControl().equals(nc))
			{
				
				respuesta=true;
				
			}
		}
		return respuesta;
	}
	public boolean buscarnombre(String nombre, Alumno[] a)
	{
		boolean respuesta=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i].getNombre().equals(nombre))
			{
				
				respuesta=true;
				
			}
		}
		return respuesta;
	}
	public boolean buscardireccion(String direccion, Alumno[] a)
	{
		boolean respuesta=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i].getDireccion().equals(direccion))
			{
				
				respuesta=true;
				
			}
		}
		return respuesta;
	}

}
