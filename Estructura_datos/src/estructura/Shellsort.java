package estructura;

public class Shellsort 
{
	public static void sort(Alumno[] a) {
        int n = a.length;

        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ... 
        int h = 1;
        while (h < n/3) h = 3*h + 1; 

        while (h >= 1) {
            // h-sort the array
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && menos(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
             cortarh(a, h); 
            h /= 3;
        }
         cortar(a);
	}
	 private static boolean menos(Alumno v, Alumno w) {
	        return v.compareTo(w) < 0;
	    }
	        
	    // exchange a[i] and a[j]
	    private static void exch(Alumno[] a, int i, int j) {
	        Alumno swap = a[i];
	        a[i] = a[j];
	        a[j] = swap;
	    }


	  
	    private static boolean cortar(Alumno [] a) {
	        for (int i = 1; i < a.length; i++)
	            if (menos(a[i], a[i-1])) return false;
	        return true;
	    }

	    // is the array h-sorted?
	    private static boolean cortarh(Alumno [] a, int h) {
	        for (int i = h; i < a.length; i++)
	            if (menos(a[i], a[i-h])) return false;
	        return true;
	    }

	   
}
