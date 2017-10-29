package cursos;
import java.util.Scanner;

public class Cursos {

  
    public static void main(String[] args) {

    String[] Cursos = {"Curso1", "Curso2", "Curso3", "Curso4", "Curso5", "Curso6", "Curso7",
        " Curso8", "Curso9", "Curso10"};  
    
    int [] Clave = {10040, 10041, 10042, 10043, 10044, 10045, 10046, 10047, 10048, 10049};
    
    String[] Profesores ={"M.C. LUZ ELENA ARÉVALO LEÓN", "M.C. ROSA ELENA TORRES RUIZ ",
"QFB. RUTH CALDERÓN VÁZQUEZ", "D.C. ESTHER GARCÍA GARIBAY ", "QFB. RICARDO VEGA TAVERA", 
"M.F.B. KARLA LILIANA GARCÍA CHÁVEZ", "QFB. OSCAR ANTONIO MUÑOS LOPES", "I.BQ. RODRIGO MERLOS ROJAS", 
"D.C. SANDRA GUADALUPE SANCHEZ CEJA", "QFB. SANDRA MARÍA SUÁREZ MORENO"};
 
    
    int [] AlumnosInscritos = { 20, 30,25, 45, 15, 23, 32, 45, 21, 36}; 
    String[] A = {"Calculo", "Calculo II", "Calculo III", "Calculo IV", "Calculo Vectorial", "Algebra Superior I",
        "Algebra Superior II", "Algebra Lineal" , "Algebra Lineal II", "Metodos Numericos"};
    String[] B = {"Computacion", "Computacion II", "Fisica", "Fisica II", "Probabilidad y Estadistica", "Calculo Complejo",
        "Ecuaciones Diferenciales Ordinarias", "Analisis Complejo", "Analisis Numericos", "Ecuaciones Parciales"};
    String[] C = {"Fisica General", "Fisica I", "Fisica Moderna", "Fisica III", "Teoria de Modulos",
        "Algebra Moderna", "Analisis Complejo", "Topologia", "Teoria de Numeros", "Analisis Matematicos"};
    String[] D = {"Geometria Analitica", "Geometria Vectorial", "Geometria Euclidiana", "Introduccion al Algebra Honologica", 
        "Topologia de Conjuntos", "Topologia Algebraica", "Analisis Funcional", "Teoria de la Medida", "Ecuaciones Diferenciales II", 
        "Matematicas Discretas"};
    String[] E = {"Logica", "Analisis Numericos", "Teoria de Categorias", "Calculo de Variaciones", "Analisis Complejo II", 
        "Teoria De Campos", "Analisis Funcional", "Geometria Moderna", "Algebra Lineal Numerica", "Matematicas Discretas II"};
    String[] F = {"Estadistica I", "Computablidad", "Analisis de Algoritmos", "Optimizacion", "Lenguajes Formales", 
        "Estadistica II", "Teoria de Categorias II", "Topologia Diferencial", "Teoria de Numeros II", "Teoria de Numero III"};
    
        Scanner T = new Scanner(System.in);
            System.out.println("Ingrese el nombre del Curso: ");
            System.out.println("Curso1");
            System.out.println("Curso2");
            System.out.println("Curso3");
            System.out.println("Curso4");
            System.out.println("Curso5");
            System.out.println("Curso6");
            System.out.println("Curso7");
            System.out.println("Curso8");
            System.out.println("Curso9");
            System.out.println("Curso10");
                        

            
            String x = T.nextLine();
            for( int i=0; i<10; i++){
               if ( x.equals(Cursos[i])){ 
                   System.out.println("El curso elegido fué: " + Cursos[i] +" \n " + "Profesor que la imparte: " +
                           Profesores[i] + " \n " + "Alumnos inscritos: " + AlumnosInscritos[i] + " \n " + "Clave del Curso: " 
                           + Clave[i] + "\n" + "Materias del Curso: " + "\n" + A[i] + "\n" + B[i] + "\n" + C[i] + "\n" + D[i] + "\n" 
                           + E[i] + "\n" + F[i] );
               
               }
            }
            
                   
                   
                           
            }              
            }
               
  
    
