package estructura;

import java.util.Scanner;

public class IngresarAlumnos 
{
	static Scanner leer=new Scanner(System.in);

	public boolean ingresar(int n, Alumno[] a) 
	{
		leer=new Scanner(System.in);
		
		for(int i=0;i<n;i++)
		{
			a[i]=new Alumno();
			System.out.println("Ingrese numero de control del alumno" +(i+1));
			a[i].setNumeroControl(leer.nextLine());
			System.out.println("Ingrese Nombre del alumno" +(i+1));
			a[i].setNombre(leer.nextLine());
			System.out.println("Ingrese direccion del alumno" +(i+1));
			a[i].setDireccion(leer.nextLine());
			
			
		}
		
		return false;
		
	}

}
