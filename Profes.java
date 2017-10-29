
package profes;

import java.util.Scanner;
public class Profes {

    
     
    public static void main(String[] args) {
       String[] Profesor = {"M.C. LUZ ELENA AREVALO","M.C. ROSA ELENA TORRES RUIZ","QFB. RUTH CALDERON VELAZQUEZ",
"D.C. ESTHER GARCIA GARIBAY","QFB. RICARDO VEGA TAVERA", "M.F.B. KARLA LILIANA GARCIA CHAVEZ","QFB. RAMON ANTONIO MUÃ‘OS LOPES",
"I.BQ. RODRIGO MERLOS ROJAS","D.C. SANDRA GUADALUPE SANCHEZ CEJA","QFB. SANDRA MARIA SUAREZ MORENO", "M.C. ALMA ROSA GARCIA RAMOS",
"D.C. JUDIT ARACELI AVILA VERDUZCO","QFB. RICARDO VEGA TAVERA","M.F.B. KARLA LILIANA GARCIA CHAVEZ","QFB. OSCAR ANTONIO LOPES MUÃ‘OS",
"I.BQ. RODRIGO MERLOS ROJAS","QFB. RICARDO VEGA TAVERA","M.F.B. KARLA LILIANA GARCIA CHAVEZ","I.BQ. RODRIGO MERLOS ROJAS","M.C. ROSA MA. GARCIA MARTINEZ", 
"QFB. MARTHA JOSEFINA DE LOS DOLORES TORRES","D.Q. MARIO ARMANDO GÃƒâ€œMEZ HURTADO","M.C. LUIS RAFAEL CHAVEZ GARIBAY","M.F.B. KARLA LILIANA GARCIA CHAVEZ"
};
       int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24 };
       int[] B = {0,1,3,2,3,0,1,2,3,0,0,3,2,1,3,2,2,1,2,3,4,2,1,0};
       
       
            Scanner T = new Scanner(System.in);
            System.out.println("Ingrese un nombre: ");
            String x = T.nextLine();
            for( int i=0; i<=24; i++){
               if ( x.equals(Profesor[i])){ 
                   System.out.println("EL nombre es " + Profesor[i] +" \n " + A[i] + " " + B[i]);
               }
                }   
        
        
        
        
    }
}
