package estructura;


public class Burbuja {

	public void burbujanc(Alumno [] a)
	{	Alumno aux;
		 
		 for (int i=0; i<a.length; i++){
				for (int j=i+1; j<a.length; j++){
					int n=a[i].compareTo(a[j]);
					if(n>0){
						aux=a[i];
						a[i]=a[j];
						a[j]=aux;
					}
				}
		 }
	
	}
}