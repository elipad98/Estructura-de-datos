package estructura;

import java.util.Scanner;

public class Metodo_binari {

	
	public static void main(String[] args) 
	{
		int n=0,centro = 0,replace=0;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingresa el valor de n: ");
		n = leer.nextInt();
		
		int vect[]= new int [n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Ingresa el valor de la posicion"+ i +" del Vector: " );
			vect[i]= leer.nextInt();
		}
		
		for(int piv=0;piv<=n;piv++)
		{
			for(int pun=piv+1; pun<n;pun++)
			{
				if(vect[piv]>vect[pun])
				{
					replace=vect[piv];
					vect[piv]=vect[pun];
					vect[pun]=replace;
				}
				if(pun==vect.length)
				{
					
				}
				
			}
			
		}
		
		
		for(int i=0; i<n; i++)
		{
			System.out.println("POS"+i+" VALOR=" +vect[i]);
			
		}
		
		int b=0,psup=n,pinf=0;
		System.out.println("ingresa el numero a buscar= ");
		b=leer.nextInt();
		while(pinf<=psup)
		{
			
			centro=(pinf+psup)/2;
			if(vect[centro]==b)
			{
				System.out.println("Valor encontrado");
				pinf=psup+1;
			}
			else if(b<vect[centro])
			{
				psup=centro;
			}
			else
			{
				pinf=centro;
			}
			if(pinf==psup)
			{
				System.exit(0);
			}
			
		}
		if(centro!=b)
		{
			System.out.println("El numero "+b+" No fue encontrado");
			{
				
			}
		}

	}

}
