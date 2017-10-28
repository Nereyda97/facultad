 
package Alumnos;

import java.util.Scanner;
public class Terminado {

    
     
    public static void main(String[] args) {
       String[] Alumno = {"Lidia","Alexis","Edgar", "Jorge", "Alejandro", "Victoria", "Guadalupe", "Rachel", "Jose", 
           "Beatriz", "Paola", "Anna", "Alfonso", "Ricardo", "Martha", "Maria", "Fernanda", "Jessica", "Carlos", 
           "Roberto","Araceli", "Agus", "Elizabeth", "Sandra", "Vannesa", "Claudia", "Maribel", "Edgar", "René",
           "Fabiola", "Irán", "Antonio","Luis", "Paloma", "Karla", "Larissa" };
       int[] A = {2013, 2012, 1999, 2005,2013, 2012, 1999, 2005,2013, 2012, 1999, 2005,2013, 2012, 
           1999, 2005,2013, 2012, 1999, 2005,2013, 2012, 1999, 2005,2013, 2012, 1999, 2005,2013, 
           2012, 1999, 2005,2013, 2012, 1999, 2005 };
       int[] B = {2018, 2017, 2003, 2013,2018, 2017, 2003, 2013,2018, 2017, 2003, 2013,2018, 2017, 2003,
           2013,2018, 2017, 2003, 2013,2018, 2017, 2003, 2013,2018, 2017, 2003, 2013,2018, 2017, 2003, 
           2013,2018, 2017, 2003, 2013};
       int[] C = {1999, 1997, 1996, 1980,1999, 1997, 1996, 1980,1999, 1997, 1996, 1980,1999, 1997, 1996,
           1980,1999, 1997, 1996, 1980,1999, 1997, 1996, 1980,1999, 1997, 1996, 1980,1999, 1997, 1996, 
           1980,1999, 1997, 1996, 1980};
       int[] D = {123456, 654321, 234561, 789531,123456, 654321, 234561, 789531,123456, 654321, 234561, 
           789531,123456, 654321, 234561, 789531,123456, 654321, 234561, 789531,123456, 654321, 234561, 
           789531,123456, 654321, 234561, 789531,123456, 654321, 234561, 789531,123456, 654321, 234561, 789531};
       
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
 
    

