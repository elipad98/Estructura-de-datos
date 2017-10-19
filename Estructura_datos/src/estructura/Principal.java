package estructura;

import java.util.Arrays;
import java.util.Scanner;


public class Principal {
	private static 	Principal p=new Principal();

	private static Alumno [] est;
	private static Alumno [] copia;
	private static Alumno[] a;
	private static int n,opc,opc2;
	private static String nc,nombre,dir;
	private static IngresarAlumnos ia=new IngresarAlumnos();
	private static busquedaSecuencial bs=new busquedaSecuencial();
	private static Burbuja bur=new Burbuja();
	private static Quicksort quick=new Quicksort();
	private static Mergesort merge=new Mergesort();
	private static Binario mb=new Binario();
	private static Shellsort sell=new Shellsort();
	private static Mergesortcadena mg=new Mergesortcadena();
	private static Scanner leer=new Scanner(System.in);

	public static void menu()
	{
		while(p.opc!=8)
		{
		System.out.println("Seleccione la opcion");
		System.out.println("1.-Busqueda secuencial");
		System.out.println("2.-Busqueda binaria");
		System.out.println("3.-Ordenamiento de la burbuja");
		System.out.println("4.-Ordenamiento Quick sort");
		System.out.println("5.-Ordenamiento Merge sort");
		System.out.println("6.-Ordenamiento Sell sort");
		System.out.println("7.-Imprimir Base de Datos ");
		System.out.println("8.-Salir");

		p.opc=leer.nextInt();
		leer.nextLine();
		
		switch(p.opc)
		{
		case 1:
		{
			System.out.println("Como deseas realizar tu busqueda: \n 1.-Por numero de control \n 2.- Por nombre \n 3.-Por direccion");
			
			p.opc2=leer.nextInt();
			leer.nextLine();
			switch(p.opc2)
			{
			case 1:
			{
				System.out.println("Ingresa numero de control a buscar: ");
				p.nc=leer.nextLine();
				
				if(p.bs.buscarnc(p.nc,p.a))
				{
					System.out.println("Se encontro el alumno");
				}else
				{
					System.out.println("No se encontro el alumno");
				}
				break;
			}
			case 2:
			{
				System.out.println("Ingresa nombre a buscar: ");
				
				p.nombre=leer.nextLine();

				
				if(p.bs.buscarnombre(p.nombre,p.a))
				{
					System.out.println("Se encontro el alumno");
				}else
				{
					System.out.println("No se encontro el alumno");
				}
				break;
			}
			case 3:
			{
				System.out.println("Ingresa la direccion a buscar: ");
			
				p.dir=leer.nextLine();
				
				if(p.bs.buscardireccion(p.dir,p.a))
				{
					System.out.println("Se encontro el alumno");
				}else
				{
					System.out.println("No se encontro el alumno");
				}
				break;
			}
			
			}
		
			
			
			
			break;
		}
		case 2:
		{
			System.out.println("Como deseas realizar tu busqueda: \n 1.-Por numero de control \n 2.- Por nombre \n 3.-Por direccion");
			
			p.opc2=leer.nextInt();
			leer.nextLine();
			switch(p.opc2)
			{
			case 1:
			{
				
				System.out.println("Ingrese el numero de control a buscar= ");
				p.nc=leer.nextLine();
				boolean resultado = p.mb.buscarnc(p.nc, p.a);
				
				 if (resultado = true) {
				     System.out.println ( "Encontrado en: "+  resultado);
				 } else {
				     System.out.println ( "El dato no se encuentra en el arreglo, o el arreglo no está ordenado."  );
				 }
				
				 break;
				}
				
			
			case 2:
			{
				System.out.println("Ingrese el nombre a buscar= ");
				Principal.nombre=leer.nextLine();
				boolean resultado = Binario.buscarnombre(Principal.nombre, Principal.a);
				
				 if (resultado = true) {
				     System.out.println ( "Encontrado en: "+  resultado);
				 } else if(resultado=false) {
				     System.out.println ( "El dato no se encuentra en el arreglo, o el arreglo no está ordenado."  );
				 }
				
				 break;
				}
				
			
			case 3:
			{
				System.out.println("Ingrese la direccion a buscar= ");
				Principal.dir=leer.nextLine();
				boolean resultado = Binario.buscardir(Principal.dir, Principal.a);
				
				 if (resultado = true) {
				     System.out.println ( "Encontrado en: "+  resultado);
				 } else if(resultado=false) {
				     System.out.println ( "El dato no se encuentra en el arreglo, o el arreglo no está ordenado."  );
				 }
				
				 break;
				
			}
			}
			break;
		}
		case 3:
		{
			for (int i=0; i<copia.length; i++){
				copia[i]=a[i];
			}
			p.bur.burbujanc(copia);
			for(int i=0; i<copia.length; i++){
				System.out.println(copia[i]);
			}
			menu();
			break;
		}
		case 4:
		{
			for (int i=0; i<copia.length; i++){
				copia[i]=a[i];
			}
				Quicksort.quick(Principal.a, 0, Principal.a.length-1);
			for(int i=0; i<copia.length; i++){
				System.out.println(copia[i]);
			}
			menu();
			break;
		}
		case 5:
		{
			Alumno[] sortedArray = p.mg.mergeSort(p.a);
            for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Vector ordenado= "+sortedArray[i] + " ");
            }
            menu();
			break;
		}
		case 6:
		{
			
			p.sell.sort(p.a);
            for (int i = 0; i < p.a.length; i++) {
            System.out.println("Vector ordenado= "+p.a[i] + " ");
            }
            menu();
            break;
		}
		case 7 :System.out.println("Vector original "+Arrays.toString(a)); 
		case 8 :
		{   System.out.println("BYE");

			
		}
			default:
				System.out.println("Selecciona una opcion correcta");
				
				
		}
		}




		
		
		System.out.println(p.a[0]);
		System.out.println(p.a[1]);
		System.out.println(p.a[0].compareTo(p.a[1]));
		System.out.println(p.a[1].compareTo(p.a[0]));
	}
	public static void main(String[] args) 
	{
		System.out.println("Numero de elementos: ");
		leer=new Scanner(System.in);
		
		p.n=leer.nextInt();
		leer.nextLine();
		est = new Alumno[n];
		copia = new Alumno[n];
		p.a=new Alumno[p.n];
		
		p.ia.ingresar(p.n,p.a);
		p.opc=0;
		p.menu();
		

	}
	

}
