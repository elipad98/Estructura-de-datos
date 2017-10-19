package estructura;

public class Binario {
	
    public static boolean buscarnc( String nc, Alumno [] a) {
		 int inicio = 0;
		 int nc2=Integer.valueOf(nc);
		 int fin = a.length - 1;
		 int pos = 0,medio;
		 while (inicio <= fin) {
				medio=a[pos].getMatricula();

	     pos = (inicio+fin) / 2;
			     if ( medio == nc2 )
			     {
			       return true;
			     }
			 
			     else if ( medio < nc2 ) {
			  inicio = pos+1;
			     } else {
			  fin = pos-1;
			     }
			 }
			 return false;
			    }
    
    public static boolean buscarnombre( String nombre, Alumno [] a) {
    	String medio;
		int inicio = 0, fin = a.length - 1,pos=0; 

    	while (inicio <= fin) { 
    	medio=a[pos].getNombre();
    	pos = (fin + inicio) / 2; 
    	if (medio.compareTo(nombre) == 0) { 
    	return true; 
    	} else if (medio.compareTo(nombre) < 0) { 
    	fin = pos - 1; 
    	} else { 
    	inicio = pos + 1; 
    	} 
    	} 
    	return false; 
    	} 
    public static boolean buscardir( String dir, Alumno [] a) {
    	String medio;
		int inicio = 0, fin = a.length - 1,pos=0; 

    	while (inicio <= fin) { 
    	medio=a[pos].getDireccion();
    	pos = (fin + inicio) / 2; 
    	if (medio.compareTo(dir) == 0) { 
    	return true; 
    	} else if (medio.compareTo(dir) < 0) { 
    	fin = pos - 1; 
    	} else { 
    	inicio = pos + 1; 
    	} 
    	} 
    	return false; 
    	} 
			

			
}


			
