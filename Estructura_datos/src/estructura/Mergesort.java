package estructura;
import java.util.Scanner;
import java.util.Arrays;

public class Mergesort {
	static Scanner leer=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int con=0,n=0;
		
		System.out.println("Ingrese el tamaño del arreglo= ");
		n=leer.nextInt();
		int[] vec=new int [n];
		while(con<vec.length)
		{
			System.out.println("Ingrese el numero= "+con);
			vec[con]=leer.nextInt();
			con++;
		}
      
        System.out.println("Vector original "+Arrays.toString(vec));
        ordenacionMergeSort(vec);
        System.out.println("\nVector ordenado "+Arrays.toString(vec));
	}

		public static void ordenacionMergeSort(int vec[])
		{
		        if(vec.length<=1) return;
		        int mitad= vec.length/2;
		        int izq[]=Arrays.copyOfRange(vec, 0, mitad);
		        int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
		        ordenacionMergeSort(izq);
		        ordenacionMergeSort(der);       
		        combinarVector(vec, izq, der);
		}
		
		public static void combinarVector(int v[], int izq[],int der[])
		{
		        int i=0;
		        int j=0;
		        for(int k=0;k<v.length;k++){
		                if(i>=izq.length){
		                        v[k]=der[j];
		                        j++;
		                        break;
		                }
		                if(j>=der.length){
		                        v[k]=izq[i];
		                        i++;
		                        break;
		                }
		                if(izq[i]<der[j]){
		                        v[k]=izq[i];
		                        i++;
		                }else{
		                        v[k]=der[j];
		                        j++;
		                }
		        }
		}
		
}
