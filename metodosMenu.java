package Proyecto1;
//Lidia Nereyda Hernandez Campos
//lilinere97@gmail.com

//Iris Olivia Bruno Perez
//irisbruno721@gmail.com

//Lidia Marlen Gonzalez Urquidez 
//marlenegonzales541@gmail.com

//Jorge Luis Servin Tomas
//beckservin@hotmail.com

import java.util.Scanner;
public class metodosMenu {
//OBJETO CREADO DEL TIPO MENU		 
		  static Menu A=new Menu();
//VARIABLES PARA CONTROLAR EL NUMERO(NC-NUMEROCURSOS,NP-NUMEROPROFESOR,NA-NUMEROALUMNOS,NM-NUMEROMATERIAS)		  
		  static int NC=0;
		  static int NP=0;
		  static int NA=0;
		  static int NM=0;
		  
		  String nombrePre;		 
		  static String NombreInstitucion="";
		  static int anioFundacion=0;
//ARREGLOS 		 		 		 
		  static String[] NombresAlum;		 
		  static int[] anioNacimientoAlum;		 
		  static int[] anioNacimientoMaestros;		 
		  static int[] anioIngresoAlumno;		 
		  static int[] anioIngresoMaestro;		 
		  static int[] anioEgreso;		 
		  static int[] matricula;		 
		  static String[] NombreProf;		 
		  static int[] NumeroProf;	 
		  static String[] NombreMateria;	 
		  static String[] claveMateria;
		  static String[] nombreCursos;
		  static String[] profesorCursos;
		  static int[] alumnosCursos;
		  static int[] horasSemanas;	 
		  static int[] creditos;
		  static int[] claveCursos;
		  static int[] calificaciones;
//CONSTRUCTOR		 	 
		  metodosMenu(){		 
		    		 
		  }
		
//OBJETO DE TIPO SCANNER		  		 
		  static Scanner T=new Scanner(System.in);		 		  
//METODO PARA INGRESAR EL NUMERO DE MATERIAS		 
		  public void materias(){
			int numeroMaterias=0;
		    System.out.println("Ingrese la cantidad de Materias ");		 
		    numeroMaterias=T.nextInt();		 
		    A.ingresarInformacionMaterias(numeroMaterias);		 
		  }
//METODO PAR INGRESAR EL NUMERO DE ALUMNOS		 
		  public void Alumnos(){
		    int numeroAlumno=0;
		    System.out.println("Ingrese la cantidad de alumnos: ");		 
		    numeroAlumno=T.nextInt();		 
		    A.Informacionalumno(numeroAlumno);		 
		  }
//METODO PARA INGRESAR EL NUMERO DE MAESTROS		 
		  public void Maestros(){
			int numeroProfesores=0;
		    System.out.println("Ingrese la cantidad de Mestros: ");		 
		    numeroProfesores=T.nextInt();		 
		    A.ingresarInformacionMaestros(numeroProfesores);		 
		  }
//METODO PARA INGRESAR EL NUMERO DE CURSOS
		  public void curso(){
			    int numeroCurso=0;
			    System.out.println("Ingrese la cantidad de cursos: ");		 
			    numeroCurso=T.nextInt();		 
			    A.ingresarInformacionCurso(numeroCurso);		 
			  }
//METODO PARA PONER EL NUMBRE DE ALUMNO		  
		  public String[] ponerNombre(int numeroAlumno){
			  NA=numeroAlumno;
			  T.nextLine();
			  NombresAlum=new String[numeroAlumno];
			  int cont=0;
			  String nombre="";
		    while(cont<numeroAlumno){		 
		      System.out.println("Ingrese el nombre del alumno "+(cont+1)+": ");		 
		      nombre=T.nextLine();
		      NombresAlum[cont]=nombre; 
		      cont++;
		    }
		    return NombresAlum;
		  }
// METODO PARA PONER EL ANIO DE NACIMIENTO DEL ALUMNO		 
		  public int [] ponerFechaNaci(int numAlumnos){	
			  NA=numAlumnos;
			  anioNacimientoAlum=new int[numAlumnos];
			  int cont=0;
			  int nombre=0;
		    while(cont<numAlumnos){		 
		      System.out.println("Ingrese el año de nacimiento del alumno "+(cont+1)+": ");		 
		      nombre=T.nextInt();
		      anioNacimientoAlum[cont]=nombre; 
		      cont++;
		    }
		    return anioNacimientoAlum;		 
		  }
//METODO PARA PONER EL ANIO DE INGRESO DEL ALUMNO		 
		   public int[] ponerAnioIngreso(int numAlumnos){	
			   NA=numAlumnos;
			   	  T.nextLine();
				  anioIngresoAlumno=new int[numAlumnos];
				  int cont=0;
				  int nombre=0;
			    while(cont<numAlumnos){		 
			      System.out.println("Ingrese el año de ingreso del alumno "+(cont+1)+": ");		 
			      nombre=T.nextInt();
			      anioIngresoAlumno[cont]=nombre; 
			      cont++;
			    }
			    return anioIngresoAlumno;		 
		    }
//METODO PARA PONER EL ANIO DE EGRESO DEL ALUMNO		 
		   public int[] ponerAnioEgreso(int numAlumnos){	
			   NA=numAlumnos;
			      T.nextLine();
				  anioEgreso=new int[numAlumnos];
				  int cont=0;
				  int nombre=0;
			    while(cont<numAlumnos){		 
			      System.out.println("Ingrese el año de egreso del alumno "+(cont+1)+": ");		 
			      nombre=T.nextInt();
			      anioEgreso[cont]=nombre; 
			      cont++;
			    }
			    return anioEgreso;		 
		    }
//METODO PARA PONER LA MATRICULA MANUALMENTE 		 
		   public int[] matriculaManualmente(int numAlumnos){
			   NA=numAlumnos;
			   T.nextLine();
				  matricula=new int[numAlumnos];
				  int cont=0;
				  int nombre=0;
			    while(cont<numAlumnos){		 
			      System.out.println("Ingrese la matricula del alumno "+(cont+1)+": ");		 
			      nombre=T.nextInt();
			      matricula[cont]=nombre; 
			      cont++;
			    }
			    return matricula;		 
		   }
//METODO PARA GENERAR LA MATRICULA ALEATORIAMENTE 	 
		  static public int[] generarMatricula(int numAlumnos){
			   NA=numAlumnos;
			 matricula=new int[numAlumnos];
		     for(int i=0;i<numAlumnos;i++){		 
		     int Matricula=(int)(Math.random()*1000000);		 
		     matricula[i]=Matricula;		 
		     }
		     return matricula;
		   }
//METODO PARA INGRESAR EL NOMBRE DE PROFESOR 
		   public String[] ponerNombreProfesor(int numeroProfesores){
			   	  NP=numeroProfesores;
			   	  T.nextLine();
				  NombreProf=new String[numeroProfesores];
				  int cont=0;
				  String nombre="";
			    while(cont<numeroProfesores){		 
			      System.out.println("Ingrese el nombre del maestro"+(cont+1)+": ");		 
			      nombre=T.nextLine();
			      NombreProf[cont]=nombre; 
			      cont++;
			    }
			    return NombreProf;	      
		    }
//METODO PARA INGRESAR EL NUMERO O MATRICULA DEL PROFESOR
		   public int[] ponerNumeroProfesor(int numeroProfesores){
			   NP=numeroProfesores;
			   T.nextLine();
				  NumeroProf=new int[numeroProfesores];
				  int cont=0;
				  int nombre=0;
			    while(cont<numeroProfesores){		 
			      System.out.println("Ingrese el numero del maestro "+(cont+1)+": ");		 
			      nombre=T.nextInt();
			      NumeroProf[cont]=nombre; 
			      cont++;
			    }
			    return NumeroProf;	 
		    }
//METODO PARA INGRESAR EL NOMBRE DE MATERIAS	 
		   public String[] ponerNombreMateria(int numMaterias){	 
			   NM=numMaterias;
			   T.nextLine();
				  NombreMateria=new String[numMaterias];
				  int cont=0;
				  String nombre="";
			    while(cont<numMaterias){		 
			      System.out.println("Ingrese el nombre de la materia "+(cont+1)+": ");		 
			      nombre=T.nextLine();
			      NombreMateria[cont]=nombre; 
			      cont++;
			    }
			    return NombreMateria;
			  }		 
//METODO PARA PONER EL ANIO DE NACIMIENTO DEL MAESTRO	 
		   public int[] ponerAnioNacimientoMaestros(int numeroProfesores){
			   NP=numeroProfesores;
			   T.nextLine();
				  anioNacimientoMaestros=new int[numeroProfesores];
				  int cont=0;
				  int nombre=0;
			    while(cont<numeroProfesores){		 
			      System.out.println("Ingrese el año de nacimiento del maestro "+(cont+1)+": ");		 
			      nombre=T.nextInt();
			      anioNacimientoMaestros[cont]=nombre; 
			      cont++;
			    }
			    return anioNacimientoMaestros;	 
		    }
//METODO PARA INGRESAR EL ANIO DE INGRESO DEL MAESTRO
		   public int[] ponerAnioIngresoMaestros(int numeroProfesores){		
			   NP=numeroProfesores;
			   T.nextLine();
				  anioIngresoMaestro=new int[numeroProfesores];
				  int cont=0;
				  int nombre=0;
			    while(cont<numeroProfesores){		 
			      System.out.println("Ingrese el año de Ingreso del maestro "+(cont+1)+": ");		 
			      nombre=T.nextInt();
			      anioIngresoMaestro[cont]=nombre; 
			      cont++;
			    }
			    return anioIngresoMaestro;	 
		    }
//METODO PARA INGRESAR LA CLAVE DE MATERIA 	 
		   public String[] ponerClaveMateria(int numMaterias){	
			   NM=numMaterias;
			   T.nextLine();
				  claveMateria=new String[numMaterias];
				  int cont=0;
				  String nombre="";
			    while(cont<numMaterias){		 
			      System.out.println("Ingrese la clave de la materia "+(cont+1)+": ");		 
			      nombre=T.nextLine();
			      claveMateria[cont]=nombre; 
			      cont++;
			    }
			    return claveMateria; 
		    }
//METODO PARA PONER LAS HORAS POR SEMANA DE LA MATERIA		 
		   public int[] ponerHorasSemana(int numMaterias){
			   NM=numMaterias;
			   T.nextLine();
				  horasSemanas=new int[numMaterias];
				  int cont=0;
				  int nombre=0;
			    while(cont<numMaterias){		 
			      System.out.println("Ingrese las horas por semana de la materia "+(cont+1)+": ");		 
			      nombre=T.nextInt();
			      horasSemanas[cont]=nombre; 
			      cont++;
			    }
			   return horasSemanas;
		    }
//METODO PARA PONER LOS CREDITOS DE LA MATERIA	 
		   public int[] ponerCreditos(int numMaterias){		 
			   NM=numMaterias;
			   T.nextLine();
				  creditos=new int[numMaterias];
				  int cont=0;
				  int nombre=0;
			    while(cont<numMaterias){		 
			      System.out.println("Ingrese los creditos de la materia "+(cont+1)+": ");		 
			      nombre=T.nextInt();
			      creditos[cont]=nombre; 
			      cont++;
			    }
			    return creditos;	 
		    }
//METODO PARA PONER LAS CALIFICACIONES DE LA MATERIA
		   public int[] ponerCalificacion(int numMaterias){		 
			   NM=numMaterias;
			   T.nextLine();
				  calificaciones=new int[numMaterias];
				  int cont=0;
				  int nombre=0;
			    while(cont<numMaterias){		 
			      System.out.println("Ingrese la calificaion de la materia "+(cont+1)+": ");		 
			      nombre=T.nextInt();
			      calificaciones[cont]=nombre; 
			      cont++;
			    }
			    return calificaciones;	 
		    }
//METODO PARA GENERAR LAS CALIFICACIONES ALEATORIAMENTE
		   public int[] ponerCalificacionAleatorio(int numMaterias){		 
			   NM=numMaterias;
			   T.nextLine();
				  calificaciones=new int[numMaterias];
				  int cont=0;
				  int nombre=0;
			    while(cont<numMaterias){			   		 
			      nombre=(int)Math.random()*10;
			      calificaciones[cont]=nombre; 
			      cont++;
			    }
			    return calificaciones;	 
		    }
//METODO PARA SACAR PROMEDIO
		   static public int promedio(int[] A){
			   int suma=0; 
			   for(int i=0;i<A.length;i++){
				   suma=suma+A[i];
			   }
			   int promedios=(int)(Math.round((suma/A.length)*100)/100d);
			   return promedios;
		   }
//METODO PARA PONER EL NOMBRE DEL CURSO	   
		   public String[] ponerNombreCurso(int numeroCurso){				  
				  NC=numeroCurso;
				  nombreCursos=new String[numeroCurso];
				  int cont=0;
				  String nombre="";
				  T.nextLine();
			    while(cont<numeroCurso){		 
			      System.out.println("Ingrese el nombre del curso "+(cont+1)+": ");
			      nombre=T.nextLine();
			      nombreCursos[cont]=nombre; 
			      cont++;
			    }
			    return nombreCursos;
			  }
//METDO PARA PONER LA CLAVE DEL CURSO
		   public int[] ponerClaveCurso(int numeroCurso){
				  T.nextLine();
				  claveCursos=new int[numeroCurso];
				  int cont=0;
				  int nombre=0;
			    while(cont<numeroCurso){		 
			      System.out.println("Ingrese la clave del curso "+(cont+1)+": ");		 
			      nombre=T.nextInt();
			      claveCursos[cont]=nombre; 
			      cont++;
			    }
			    return claveCursos;
			  }
//METODO PARA PONER EL NOMBRE DEL PROFESOR DEL CURSO
		   public String[] ponerProfesorCurso(int numeroCurso){
				  T.nextLine();
				  profesorCursos=new String[numeroCurso];
				  int cont=0;
				  String nombre="";
			    while(cont<numeroCurso){		 
			      System.out.println("Ingrese el nombre del profesor del curso "+(cont+1)+": ");		 
			      nombre=T.nextLine();
			      profesorCursos[cont]=nombre; 
			      cont++;
			    }
			    return profesorCursos;
			  }
//METODO PARA INGRESAR EL NUMERO DE ALUMNOS EN EL CURSO
		   public int[] ponerAlumnosCurso(int numeroCurso){				 
				  alumnosCursos=new int[numeroCurso];
				  int cont=0;
				  int nombre=0;
				  
			    while(cont<numeroCurso){		 
			      System.out.println("Ingrese el numero de alumnos inscritos en el curso "+(cont+1)+": ");
			      nombre=T.nextInt();
			      alumnosCursos[cont]=nombre; 
			      cont++;
			    }
			    return alumnosCursos;
			  }
//METODO PARA INGRESAR EL NOMBRE DE LA FACULTAD
		   public String ponerNombreInstitucion(){
				  System.out.println("Ingrese el nombre de la facultad: ");
				  NombreInstitucion=T.nextLine();				  
				  return NombreInstitucion;	    
			  }
//METODO PARA INGRESAR EL ANIO DE FUNDACION		   
		   public int ponerAnioFundacion(){
					  System.out.println("Ingrese el año de fundacion de la facultad: ");
					  anioFundacion=T.nextInt();					  
					  return anioFundacion;	    				      
			  }
//METODO PARA CONSULTAR LOS ALUMNOS QUE ESTAN YA PREDETERMINADOS
		   public void consultarAlumnos(){		 
		     String[] nombre = {"Lidia","Alexis","Edgar", "Jorge", "Alejandro", "Victoria", "Guadalupe", "Rachel", "Jose", 	 
		          "Beatriz", "Paola", "Anna", "Alfonso", "Ricardo", "Martha", "Maria", "Fernanda", "Jessica", "Carlos", 	 
		          "Roberto","Araceli", "Agus", "Elizabeth", "Sandra", "Vannesa", "Claudia", "Maribel", "Edgar", "René",		 
		          "Fabiola", "Irán", "Antonio","Luis", "Paloma", "Karla", "Larissa" };		 
		      int[] anioIngreso = {2013, 2012, 1999, 2005,2013, 2012, 1999, 2005,2013, 2012, 1999, 2005,2013, 2012, 		 
		          1999, 2005,2013, 2012, 1999, 2005,2013, 2012, 1999, 2005,2013, 2012, 1999, 2005,2013, 	 
		          2012, 1999, 2005,2013, 2012, 1999, 2005 };	 
		      int[] anioEgreso = {2018, 2017, 2003, 2013,2018, 2017, 2003, 2013,2018, 2017, 2003, 2013,2018, 2017, 2003,		 
		          2013,2018, 2017, 2003, 2013,2018, 2017, 2003, 2013,2018, 2017, 2003, 2013,2018, 2017, 2003, 		 
		          2013,2018, 2017, 2003, 2013};		 
		      int[] anioNacimiento = {1999, 1997, 1996, 1980,1999, 1997, 1996, 1980,1999, 1997, 1996, 1980,1999, 1997, 1996,		 
		          1980,1999, 1997, 1996, 1980,1999, 1997, 1996, 1980,1999, 1997, 1996, 1980,1999, 1997, 1996, 		 
		          1980,1999, 1997, 1996, 1980};		 
		      int[] matricula = {123456, 654321, 234561, 789531,123456, 654321, 234561, 789531,123456, 654321, 234561, 		 
		          789531,123456, 654321, 234561, 789531,123456, 654321, 234561, 789531,123456, 654321, 234561, 		 
		          789531,123456, 654321, 234561, 789531,123456, 654321, 234561, 789531,123456, 654321, 234561, 789531};		         
		 
		      Scanner T = new Scanner(System.in);	 
		      System.out.println("Ingrese un nombre: ");		 
		      String x = T.nextLine();		 
		      for( int i=0; i<36; i++){		 
		        if ( x.equals(nombre[i])){ 		 
		          System.out.println("EL nombre es " + nombre[i] +"\n Ingreso en " + anioIngreso[i] + "\n Egreso en " 		 
		              + anioEgreso[i] + "\n Nacio en "+ anioNacimiento[i] + "\n Su matricula es " +matricula[i]);                		 
		        }
		      }		 
		   }
//METODO PARA CONSULTAR INFORMACION DE LAS MATERIAS YA PREDETERMINADAS		 
		   public void consultarMateria(){
		     String[] materia = {"Calculo I", "Algebra Superior I", "Geometria", "Computacion I",  
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
		        String[] clave = {"TC1", "TC2", "TC3", "TC4", "TC5", "TC6", "TC7", "TC8", "TC9", "TC10", "TC11", "TC12", "TC13", 		 
		            "TC14", "TC15", "TC16", "TC17", "TC18", "TC19", "M1", "M2", "M3", "M3", "M4", "M5", "M6", "M7", "M8", "M9",  
		            "M10", "M11", "M12", "M13", "M14", "M15", "M16", "M17", "M18", "M19", "M20", "M21", "M22", "M23", "M24", 
		            "M25", "M26", "M27", "M28", "M29", "M30", "M31", "M32", "M33", "M34", "M35", "M37", "C1", "C2", "C3", "C4" };		 
		        int[] horasSemana = {6,4,4,5,4,6,4,4,5,6,4,4,4,5,6,4,4,5,4,5,5,4,5,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,		 
		            4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};		 
		        int[] creditos = {12,8,8,6,8,12,8,6,10,12,8,8,8,10,12,8,8,10,8,10,8,8,10,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8		 
		                   ,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};		 		            		 
		        Scanner T = new Scanner(System.in);		 
		        System.out.println("Ingrese un nombre: ");		 
		        String x = T.nextLine();		 
		        for( int i=0; i<36; i++){		 
		          if ( x.equals(materia[i])){ 		 
		                   System.out.println("La materia es: " + materia[i] +"\n La clave es: " + clave[i] + "\n Horas por semana: " 		 
		                + horasSemana[i] + "\n Creditos: "+ creditos[i]);              		 
		          }		 
		        }		 
		   }
//METODO PARA CONSULTAR INFORMACION DE LOS MAESTROS YA PREDETERMINADOS
		    public void consultarProfesores(){ 		      			    
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
			   String x = T.nextLine();
			   x=x.toLowerCase();
			   String cero="Computacion";
			   String uno="Matematicas";
			   String dos="Fisica";
			   String tres="Otro";
			   for( int i=0; i<=24; i++){ 
				   if ( x.equals(Profesor[i])&&B[i]==0){
					   System.out.println("EL nombre es " + Profesor[i] + "\n " + "Numero de Profesor: "+ A[i] + "\n" + "En area de "+cero + "\n" + "Numero de Empleado: " + C[i]);   
				   }else if ( x.equals(Profesor[i])&&B[i]==1){
					   System.out.println("EL nombre es " + Profesor[i] + "\n " + "Numero de Profesor: "+ A[i] + "\n" + "En area de "+uno+ "\n" + "Numero de Empleado: " + C[i]);   
				   }else if ( x.equals(Profesor[i])&&B[i]==2){
					   System.out.println("EL nombre es " + Profesor[i] + "\n " + "Numero de Profesor: "+ A[i] + "\n" + "En area de "+dos + "\n" + "Numero de Empleado: " + C[i]);   
				   }else if ( x.equals(Profesor[i])&&B[i]==3){
					   System.out.println("EL nombre es " + Profesor[i] + "\n " + "Numero de Profesor: "+ A[i] + "\n" + "En area de "+tres + "\n" + "Numero de Empleado: " + C[i]);   
				   }
			   }
		   }
//METODO PARA CONSULTAR LA INFORMACION DE LOS CURSOS
		    public void consultarCursos(){
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
			   
			   int[] alumCurso={20,30,25,45,15,23,32,45,21,36};
			   int[] caliCursoPorAlum;
			   int promedios=0;
			   
			   String x = T.nextLine();
			   for( int i=0; i<10; i++){
				   int valor1=alumCurso[i];
				   caliCursoPorAlum=new int[valor1];
				   if ( x.equals(Cursos[i])){ 
					   for(int j=0;j<valor1;j++){
						   int nombre=(int)(Math.random()*10 + 1);
						   caliCursoPorAlum[j]=nombre;
					   }
					   promedios=promedio(caliCursoPorAlum);
					   System.out.println("El curso elegido fué: " + Cursos[i] +" \n" + "Profesor que la imparte: " +
							   Profesores[i] + " \n" + "Alumnos inscritos: " + AlumnosInscritos[i] + " \n" + "Clave del Curso: " 
							   + Clave[i] + "\n" + "Materias del Curso: " + "\n" + A[i] + 
							   "\n" + B[i] + "\n" + C[i] + "\n" + D[i] + "\n" 
							   + E[i] + "\n" + F[i]+ "\n"+"Con promedio "+ promedios );		               
				   }
			   }		            			                   			                   			                           			         
		   }              		            
// METODO PARA CONSULTAR EL NOMBRE DE LA INSTITUCION PREDETERMINADA			     
		   public String nombreFacultaYaHecha(){
			   return "Fismat";
		   }
//METODO PARA CONSULTAR EL ANIO DE FUNDACION
		   public int anioFundacion(){
			   return 1963;
		   }
//METODO PARA PONER EL PROMEDIO DE LA INSTITUCION PREDETERMINADA
		   public int promeFacuMenu2(){
			   int[] alumCurso={20,30,25,45,15,23,32,45,21,36};
			   int[] caliCursoPorAlum;
			   int[]  promedios=new int[10];
			   int suma=0;
			   
			   String x = T.nextLine();
			   for( int i=0; i<10; i++){
				   int valor1=alumCurso[i];
				   caliCursoPorAlum=new int[valor1];
				    
					   for(int j=0;j<valor1;j++){
						   int nombre=(int)(Math.random()*10 + 1);
						   caliCursoPorAlum[j]=nombre;
					   }
					   promedios[i]=promedio(caliCursoPorAlum);
				   
			   }
			   for(int h=0;h<10;h++){
				   suma=suma+promedios[h];
			   }
			   return suma/10;
		   
		   }
		}