package estructura;
import java.util.Scanner;

public class Quicksort {
	static Scanner leer=new Scanner(System.in);
	
	public static void quick(Alumno [] a,int start,int end)
	{
        int i = start;
        int j = end;

        if (j - i >= 1)
        {
            Alumno pivot = a[i];
            while (j > i)
            {
               
                while (a[i].compareTo(pivot) <= 0 && i < end && j > i){
                    i++;
                }
               
                while (a[j].compareTo(pivot) >= 0 && j > start && j >= i){
                    j--;
                }
                if (j > i)
                    Intercambiar(a, i, j);
            }
            
            Intercambiar(a, start, j);
            quick(a, start, j - 1);
            quick(a, j + 1, end);
        }
    }
	private static void Intercambiar(Alumno[] a, int i, int j)
    {
    Alumno temp = a[i];
    a[i] = a[j];
    a[j] = temp;
    }
	

}
