
package calificacion;
import java.util.Scanner;

public class Calificacion {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        System.out.println("¿Cuántos alumnos son?: ");
        int a=in.nextInt();
        double[] calificaciones= new double [a];
        ponCalificacion(calificaciones);
        double promedio=Promedio(calificaciones);
        System.out.println("El promedio es : " + promedio);
        
        System.out.println("¿Cuántas calificaciones aleatorias quieres?: ");
        int n=in.nextInt();
        double [] aleatoria= new double[n];
        double p=generaCalificacion();
        p=Math.round(p*100/100d);
        generar(aleatoria,p);
        double promedio1=Promedio(aleatoria);	
		System.out.println("El promedio es : " + promedio1);
        
		

    }
  //METODO PARA PONER CALIFICACION
    public static void ponCalificacion(double []A){
         Scanner in =new Scanner(System.in);
         for(int i=0;i<A.length;i++){
            System.out.println("Dame la calificación del alumno " +(i+1)+ " : ");
            double b=in.nextDouble();
            A[i]=b;
        }
    }
    //METODO PARA PONER CALIFICACIONES ALEATORIAS
  private static double generaCalificacion(){
    
    return (double) Math.random() * 10;
         
     }
    public static void generar(double [] A, double p){
         for(int i=0;i<A.length;i++){
             A[i]=p;
            System.out.println("La calificación del alumno " +(i+1)+ " es: "+ A[i]);
            
            
        }
    }   
    

	public static double Promedio(double[] A){
	double suma=0;
	for(int h=0;h<A.length;h++){		
		suma=suma + A[h];
	}
	double promedio=(Math.round((suma/A.length)*100)/100d);// redondeamos a dos cifras
	return promedio;
	}
}

