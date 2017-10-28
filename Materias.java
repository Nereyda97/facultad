
package materias;

import java.util.Scanner;

public class Materias {

    
     
    public static void main(String[] args) {
               String[] Alumno = {"Calculo I", "Algebra Superior I", "Geometria", "Computacion I", 
                   "Fisica General", "Calculo II", "Algebra Superior II", "Computacion II", "Fisica I", 
                   "Calculo III", "Algebra Lineal I", "Probabilidad y Estadistica", 
                   "Ecuaciones Diferenciales Ordinarias", "Fisica II", "Calculo IV", "Algebra Lineal II", 
                   "Fisica III", "Fisica Moderna", "Analisis Matematicos I", "Metodos Numericos", 
                   "Geometria Euclidiana", "Algebra Moderna", "Analisis Matematicos II", "Teoria de Modulos", 
                   "Analisis Complejo", "Topología", "Teoria de Conjuntos", "Geometria Diferencial", 
                   "Teoria de Numeros", "Matematicas Discretas", "Geometria Moderna",
                   "Ecuaciones Diferenciales Ordinarias II", "Teoria de Medidas", "Analisis Funcional", 
                   "Topologia Diferencial", "Teoria de Campos", " Introduccion al Algebra Homologica", 
                   "Topologia de Conjuntos", "Introduccion a la topologia Algebraica", 
                   "Matematicas Discretas II", " Ecuaciones Diferenciales Parciales I", 
                   "Calculo de Variaciones", "Ecuaciones Diferenciales Parciales II", "Geometria Proyectiva", 
                   "Logica", "Teoria de Categorias", "Algebra Lineal Numerica", "Analisis Numerico I", 
                   "Analisis Numericos II", "Soluciones Numericas de Ecuaciones Diferenciales Ordinarias", 
                   "Estadisticas I", "Estadisticas II", "Optimizacion", "Algoritmos I", 
                   "Analisis de Algoritmos I", "Lenguajes Formales", "Computabilidad"};
       String[] A = {"TC1", "TC2", "TC3", "TC4", "TC5", "TC6", "TC7", "TC8", "TC9", "TC10", "TC11", "TC12", "TC13", 
           "TC14", "TC15", "TC16", "TC17", "TC18", "TC19", "M1", "M2", "M3", "M3", "M4", "M5", "M6", "M7", "M8", "M9", 
           "M10", "M11", "M12", "M13", "M14", "M15", "M16", "M17", "M18", "M19", "M20", "M21", "M22", "M23", "M24", 
           "M25", "M26", "M27", "M28", "M29", "M30", "M31", "M32", "M33", "M34", "M35", "M37", "C1", "C2", "C3", "C4" };
       int[] B = {6,4,4,5,4,6,4,4,5,6,4,4,4,5,6,4,4,5,4,5,5,4,5,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,
           4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
       int[] C = {12,8,8,6,8,12,8,6,10,12,8,8,8,10,12,8,8,10,8,10,8,8,10,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8
               ,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
       
       
            Scanner T = new Scanner(System.in);
            System.out.println("Ingrese un nombre: ");
            String x = T.nextLine();
            for( int i=0; i<36; i++){
               if ( x.equals(Alumno[i])){ 
                   System.out.println("EL nombre es " + Alumno[i] +" \n " + A[i] + " " + B[i] + " " + C[i] + " " +D[i]);
                  
               }
                }   

    }
    
}
