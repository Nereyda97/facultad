package profesores;

import java.util.Scanner;
public class Profesores {

    
     
    public static void main(String[] args) {
       String[] Profesor = {"LUZ ELENA AREVALO","ROSA ELENA TORRES RUIZ","RUTH CALDERON VELAZQUEZ",
"ESTHER GARCIA GARIBAY","RICARDO VEGA TAVERA", "KARLA LILIANA GARCIA CHAVEZ","RAMON ANTONIO MUÃ‘OS LOPES",
"RODRIGO MERLOS ROJAS","SANDRA GUADALUPE SANCHEZ CEJA","SANDRA MARIA SUAREZ MORENO", "ALMA ROSA GARCIA RAMOS",
"JUDIT ARACELI AVILA VERDUZCO","RICARDO VEGA TAVERA","KARLA LILIANA GARCIA CHAVEZ","OSCAR ANTONIO LOPES MUÃ‘OS",
"RODRIGO MERLOS ROJAS","RICARDO VEGA TAVERA","KARLA LILIANA GARCIA CHAVEZ","RODRIGO MERLOS ROJAS","ROSA GARCIA MARTINEZ", 
"MARTHA JOSEFINA DE LOS DOLORES TORRES","MARIO ARMANDO HURTADO","LUIS RAFAEL CHAVEZ GARIBAY","KARLA LILIANA GARCIA CHAVEZ"
};
       int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24 };
       int[] B = {0,1,3,2,3,0,1,2,3,0,0,3,2,1,3,2,2,1,2,3,4,2,1,0};
       int[] C = {143244 , 134532, 123512, 986547, 125423, 875932, 698546, 985703, 763750, 865748, 163759, 985674, 654722, 
           875632 , 846282 , 598765, 817364, 872364, 763542, 109823, 985672, 524263, 1652842, 918742};       
    
       Scanner T = new Scanner(System.in);
            System.out.println("Ingrese el nombre del profesor(a):  ");
            System.out.println("(Procurar usar mayúsculas)");
            
            String x = T.nextLine();
            for( int i=0; i<=24; i++){
               if ( x.equals(Profesor[i])){ 
                   System.out.println("EL nombre es " + Profesor[i] + "\n " + "Numero de Profesor: " 
                           + A[i] + "\n" + "No sé que esto: "+B[i] + "\n" + "Numero de Empleado: " + C[i]);
               }
                }   
        
        
        
        
    }
}
