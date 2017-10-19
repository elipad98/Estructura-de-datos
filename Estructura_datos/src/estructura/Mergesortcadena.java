package estructura;

public class Mergesortcadena {
	 private static void merge(Alumno [] data, int first, int n1, int n2)
	    {
	        Alumno[] temp = new Alumno[n1 + n2];
	        int copied = 0;
	        int copied1 = 0;
	        int copied2 = 0;

	        while ((copied1 < n1) && (copied2 < n2))
	        {
	            if (data[first + copied1].compareTo(data[first + n1 + copied2]) < 0)
	                temp[copied++] = data[first + (copied1++)];
	            else
	                temp[copied++] = data[first + n1 + (copied2++)];
	        }

	        while (copied1 < n1)
	            temp[copied++] = data[first + (copied1++)];
	        while (copied2 < n2)
	            temp[copied++] = data[first + n1 + (copied2++)];

	        for (int i = 0; i < copied; i++)
	            data[first + i] = temp[i];

	    }
	 public static void mergesort(Alumno[] data, int first, int n) {
		    int n1 = 0;
		    int n2 = 0;

		    if(n > 1) {
		        n1 = n/2;
		        n2 = n-n1;

		        mergesort(data, first, n1);
		        mergesort(data, first + n1, n2);
		    }

		    merge(data, first, n1, n2);

		    for(Alumno element: data)
		        System.out.print(element +" ");
		}
	 public static Alumno[] mergeSort(Alumno[] list) {
	        Alumno [] sorted = new Alumno[list.length];
	        if (list.length == 1) {
	            sorted = list;
	        } else {
	            int mid = list.length/2;
	            Alumno[] left = null; 
	            Alumno[] right = null;
	            if ((list.length % 2) == 0) {
	                left = new Alumno[list.length/2];
	                right = new Alumno[list.length/2];
	            } else { 
	                left = new Alumno[list.length/2];
	                right = new Alumno[(list.length/2)+1];
	            }
	            int x=0;
	            int y=0;
	            for ( ; x < mid; x++) {
	                left[x] = list[x];
	            }
	            for ( ; x < list.length; x++) {
	                right[y++] = list[x];
	            }
	            left = mergeSort(left);
	            right = mergeSort(right);
	            sorted = mergeArray(left,right);
	        }

	        return sorted;
	    }

	    private static Alumno[] mergeArray(Alumno[] left, Alumno[] right) {
	        Alumno[] merged = new Alumno[left.length+right.length];
	        int lIndex = 0;
	        int rIndex = 0;
	        int mIndex = 0;
	        int comp = 0;
	        while (lIndex < left.length || rIndex < right.length) {
	            if (lIndex == left.length) {
	                merged[mIndex++] = right[rIndex++];
	            } else if (rIndex == right.length) {
	                merged[mIndex++] = left[lIndex++];
	            } else {  
	                comp = left[lIndex].compareTo(right[rIndex]);
	                if (comp > 0) {
	                    merged[mIndex++] = right[rIndex++];
	                } else if (comp < 0) {
	                    merged[mIndex++] = left[lIndex++];
	                } else { 
	                    merged[mIndex++] = left[lIndex++];
	                }
	            }   
	        }
	        return merged;
	    }


}
