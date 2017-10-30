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
public class Menu {
//CREACION DE UN OBJETO DE TIPO 'METODOSMENU'		
		static metodosMenu A=new metodosMenu();
//CONTADORES		
		static int contadorPreparatoria=0;
		static int contadorFacultad=0;
		static int contadorInstituto=0;
		static int contadorEscuela=0;
		static int contadorOtro=0;
		static int promedio;
		
		static String variable="";
//VARIABLES PARA CONSULTAR
		static String nomFacultad;
		static int anioFundacion;
		static String[] nombreCursoss;
		static int[] claveCurso;
		static String[] profesorCurso;
		static int[] alumnosInsCurso;
		static String[] nombrProfesores;
		static int[] numerProfesores;
		static int[] anioNacProfes;
		static int[] anioIngrProfes;
		static String[] nombrAlu;
		static int[] fechNac;
		static int[] anioIngr;
		static int[] anioEgr;
		static int[] matricul;
		static String[] nombrMat;
		static String[] clavMat;
		static int[] horSemanMat;
		static int[] creditMat;
		static int[] calificaci;
//OBJETO SCANNER		
		static Scanner T=new Scanner(System.in);
//OBJETOS PARA LOS WHILE-CASE		
		static boolean opcionSalir=true;
		static boolean opcionMenu=true;
		static boolean opcionMenuConsultar1=true;
		static boolean opcionMenuConsultar2=true;
		static boolean opcionMenuConsultarNomFacu=true;
		static boolean consultarAlumnos=true;
		static boolean consultarMaterias=true;
		static boolean IngInf=true;
		static boolean pregMatricula=true;
		static boolean InfAlumno=true;
		static boolean InfMaestros=true;
		static boolean InfMaterias=true;
		static boolean numerAlumnos=true;
		static boolean numProfesor=true;
		static boolean numeMaterias=true;
		static boolean numerosCursos=true;
		static boolean InfCursos=true;
		static boolean menuConsultarPrincipal=true;
		static boolean pregCalificacion=true;
		static boolean menuPreg=true;
//CONSTRUCTOR
		Menu(){			
		}
//METODO MAIN		
		public static void main(String[] args){
			Institucion();
		}
		
//MENU PRINCIPAL
		public static void Institucion(){		    
		    int respuesta=0;
		    while(opcionSalir){
		    	System.out.println("Que desea crear.? ");
		    	System.out.println("1. Prepa");
		    	System.out.println("2. Facultad");
		    	System.out.println("3. Instituto");
		    	System.out.println("4. Escuela");
		    	System.out.println("5. Otro");
		    	System.out.println("6. Salir");
		    	System.out.println("-------------------------");
		    	System.out.print(">>> ");
		    	respuesta=T.nextInt();
		    	T.nextLine();

		      switch(respuesta){
		      	case 1:
		      		contadorPreparatoria++;
		      		variable="Preparatoria";
		      		menuOpciones(variable);
		      		
		      		break;

		      	case 2:
		      		contadorFacultad++;
		      		variable="Facultad";
		      		menuOpciones(variable);
		      		break;

		      	case 3:
		      		contadorInstituto++;
		      		variable="Instituto";
		      		menuOpciones(variable);
		      		break;
		      	case 4:
		      		contadorEscuela++;
		      		variable="Escuela";
		      		menuOpciones(variable);
		      		break;

		      	case 5:
		      		contadorOtro++;
		      		variable="Otro";
		      		menuOpciones(variable);
		      		break;

		      	case 6:
		      		opcionSalir=false;
		      		break;

		      	default:
		      		System.out.println("Ingrese una opcion valida.-_-");
		      		break;
		      }
		    }
		
		}
		
//MENU OPCIONES 	
		static public void menuOpciones(String a){	
		    int respuesta=0;
		    while(opcionMenu){
		    	System.out.println(a);
		    	System.out.println("1. Crear");
		    	System.out.println("2. Consultar");
		    	System.out.println("3. Consultar Preguntas Hechas por Maestro.");
		    	System.out.println("4. Atras");
		    	System.out.println("5. Salir");
		    	System.out.println("-------------------------");
		    	System.out.print(">>> ");
		    	respuesta=T.nextInt();
		    	T.nextLine();
		      switch(respuesta){
		      	case 1:
		      		ingresarInformacion();
		      		break;

		      	case 2:
		      		menuConsultarPrincipal();
		      		break;
		      	case 3:
		      		menuPreguntas();
		      		break;	
		      	case 4:
		      		opcionMenu=false;
		      		break;
		      	case 5:
		      		opcionMenu=false;
		      		opcionSalir=false;
		      		break;

		      	default:
		      		System.out.println("Ingrese una opcion valida.-_-");
		      		break;
		      }
		    }
		}
//MENU PARA RESPONDER LAS PREGUNTAS QUE SE DEJARON
		static public void menuPreguntas(){
			int respuesta=0;
			while(menuPreg){
				System.out.println("1. Cual es el promedio de la facultad");
				System.out.println("2. Cual es el promedio de edad de alumnos");
				System.out.println("3. Cual es el promedio de edad de los maestros.");
				System.out.println("4. Cual es la materia con mayor numero de alumnos.");
				System.out.println("5. Atras");
				System.out.println("6. Salir");
				System.out.println("-------------------------");
				System.out.print(">>> ");
				respuesta=T.nextInt();
				T.nextLine();
				switch(respuesta){
				case 1:
					int promerdio=Promediofacultad();
					System.out.println("El promedio es: "+promerdio);
					break;
					
				case 2:
					int promedio=sacarEdadAlumno();
					System.out.println("La edad promedio es: "+promedio);
					break;
				case 3:
					int promedios=sacarEdadMaestro();
					System.out.println("La edad promedio es: "+promedios);
					break;
				case 4:
					MateMasAlumnos();
					break;	
				case 5:
					menuPreg=false;
					break;
				case 6:
					menuPreg=false;
					opcionMenu=false;
					opcionSalir=false;
					break;
					
				default:
					System.out.println("Ingrese una opcion valida.-_-");
					break;
				}
			}
		}
//MENU PARA ESCOJER CUAL INFORMACION QUIERES CONSULTAR
//LA OPCION 1 ESTARA DISPONIBLE SOLO AL CREAR PRIMERO LA INSTITUCION
		static public void menuConsultarPrincipal(){
			int respuesta=0;
			while(menuConsultarPrincipal){
				System.out.println("1. Consultar Institucion Recien Hecha");
				System.out.println("2. Consular Institucion ya Hecha");
				System.out.println("3. Atras");
				System.out.println("4. Salir");
				System.out.println("-------------------------");
				System.out.print(">>> ");
				respuesta=T.nextInt();
				T.nextLine();
				switch(respuesta){
					case 1:
						menuConsultarRecienHecha();
						break;
					case 2:
						menuConsultar();
						break;
					case 3:
						menuConsultarPrincipal=false;
						break;
					case 4:
						menuConsultarPrincipal=false;
						opcionMenu=false;
			      		opcionSalir=false;
						break;
					default:
						System.out.println("Ingrese una opcion valida.-_-");
						break;
				}
			}
		}
//MENU PARA CONSULTAR LA FACULTAD QUE EL USUARIO CREO
		static public void menuConsultarRecienHecha(){
			int respuesta=0;
			while(opcionMenuConsultar1){
				System.out.println("");
				System.out.println("1. Consultar Nombre Facultad");
				System.out.println("2. Consultar Cursos");
				System.out.println("3. Consultar Maestros");
				System.out.println("4. Consultar Alumnos");
				System.out.println("5. Consultar Materias");
				System.out.println("6. Consultar Salones");
				System.out.println("7. Atras");
				System.out.println("8. Salir");
				System.out.println("-------------------------");
				System.out.print(">>> ");
				respuesta=T.nextInt();
				T.nextLine();

				switch(respuesta){
					case 1:
						menuConsultarNomFacu();
						break;
					case 2:
						GuardarNombreCurso();
						GuardarClaveCurso();
						GuardarProfesorCurso();
						GuardarAlumnosCurso();
						 mostrarCursos();						
						break;
					case 3:
						GuardarNombresMaestros();
						GuardarNumeroMaestros();
						GuardarAnioNacMaestros();
						GuardarAnioIngreMaestros();
						mostrarMaestros();
						break;
					case 4:
						GuardarNombreAlumno();
						GuardarFechNacimAlumno();
						GuardarAnioIngrAlumno();
						GuardarAnioEgrAlumno();
						GuardarMatriculaAlumno();
						mostrarAlumnos();
						break;
					case 5:
						GuardarNombreMateria();
						GuardarClaveMateria();
						GuardarHorSemMateria();
						GuardarCreditosMateria();
						GuardarCalificacionsMateria();
						Promedios();
						mostrarMaterias();
						break;
					case 6:
						
						break;
					case 7:
						opcionMenuConsultar1=false;
						break;
					case 8:
						opcionMenuConsultar1=false;
						menuConsultarPrincipal=false;
						opcionMenu=false;
			      		opcionSalir=false;			      		
						break;
					default:
						System.out.println("Ingrese una opcion valida.-_-");
						break;
				}
			}
		}
//METODOS PARA EL MENU DE LA FACULTAD QUE EL USUARIO CREO 		
		
		static public void GuardarNombreCurso(){
			nombreCursoss=new String[A.NC];
			for(int i=0;i<A.NC;i++){
				nombreCursoss[i]=A.nombreCursos[i];
			}
		}
		static public void GuardarClaveCurso(){
			claveCurso=new int[A.NC];
			for(int i=0;i<A.NC;i++){
				claveCurso[i]=A.claveCursos[i];
			}
		}
		static public void GuardarProfesorCurso(){
			profesorCurso=new String[A.NC];
			for(int i=0;i<A.NC;i++){
				profesorCurso[i]=A.profesorCursos[i];
			}
		}
		static public void GuardarAlumnosCurso(){
			alumnosInsCurso=new int[A.NC];
			for(int i=0;i<A.NC;i++){
				alumnosInsCurso[i]=A.alumnosCursos[i];
			}
		}
		
		static public void mostrarCursos(){
			for(int i=0;i<A.NC;i++){
				System.out.println("El curso "+nombreCursoss[i]+" con clave "+claveCurso[i]+" la imparte el profesor(a)"+profesorCurso[i]+" y tiene "
						+alumnosInsCurso[i]+" alumnos inscritos.");
				}
		}
		static public void GuardarNombresMaestros(){
			nombrProfesores=new String[A.NP];
			for(int i=0;i<A.NP;i++){
				nombrProfesores[i]=A.NombreProf[i];
			}
		}
		static public void GuardarNumeroMaestros(){
			numerProfesores=new int[A.NP];
			for(int i=0;i<A.NP;i++){
				numerProfesores[i]=A.NumeroProf[i];
			}
		}
		static public void GuardarAnioNacMaestros(){
			anioNacProfes=new int[A.NP];
			for(int i=0;i<A.NP;i++){
				anioNacProfes[i]=A.anioNacimientoMaestros[i];
			}
		}
		static public void GuardarAnioIngreMaestros(){
			anioIngrProfes=new int[A.NP];
			for(int i=0;i<A.NP;i++){
				anioIngrProfes[i]=A.anioIngresoMaestro[i];
			}
		}
		static public void mostrarMaestros(){
			for(int i=0;i<A.NC;i++){
				System.out.println("El maestro "+nombrProfesores[i]+" con Matricula "+numerProfesores[i] +" con año de nacimieto "+anioNacProfes[i]+" y con año de ingreso "
						+anioIngrProfes[i]+".");
			}
		}
		static public void GuardarNombreAlumno(){
			nombrAlu=new String[A.NA];
			for(int i=0;i<A.NA;i++){
				nombrAlu[i]=A.NombresAlum[i];
			}
		}
		static public void GuardarFechNacimAlumno(){
			fechNac=new int[A.NA];
			for(int i=0;i<A.NA;i++){
				fechNac[i]=A.anioNacimientoAlum[i];
			}
		}
		static public void GuardarAnioIngrAlumno(){
			anioIngr=new int[A.NA];
			for(int i=0;i<A.NA;i++){
				anioIngr[i]=A.anioIngresoAlumno[i];
			}
		}
		static public void GuardarAnioEgrAlumno(){
			anioEgr=new int[A.NA];
			for(int i=0;i<A.NA;i++){
				anioEgr[i]=A.anioEgreso[i];
			}
		}
		static public void GuardarMatriculaAlumno(){
			matricul=new int[A.NA];
			for(int i=0;i<A.NA;i++){
				matricul[i]=A.matricula[i];
			}
		}
		static public void mostrarAlumnos(){
			for(int i=0;i<A.NA;i++){
				System.out.println("El alumno "+nombrAlu[i]+" con fecha de nacimiento "+fechNac[i]+" con año de ingreso "+anioIngr[i]+"y con año de egreso "
						+anioEgr[i]+" y matricula "+matricul[i]);
			}
		}
		static public void GuardarNombreMateria(){
			nombrMat=new String[A.NM];
			for(int i=0;i<A.NM;i++){
				nombrMat[i]=A.NombreMateria[i];
			}
		}
		static public void GuardarClaveMateria(){
			clavMat=new String[A.NM];
			for(int i=0;i<A.NM;i++){
				clavMat[i]=A.claveMateria[i];
			}
		}
		static public void GuardarHorSemMateria(){
			horSemanMat=new int[A.NM];
			for(int i=0;i<A.NM;i++){
				horSemanMat[i]=A.horasSemanas[i];
			}
		}
		static public void GuardarCreditosMateria(){
			creditMat=new int[A.NM];
			for(int i=0;i<A.NM;i++){
				creditMat[i]=A.creditos[i];
			}
		}
		static public void GuardarCalificacionsMateria(){
			calificaci=new int[A.NM];
			for(int i=0;i<A.NM;i++){
				calificaci[i]=A.calificaciones[i];
			}
		}
		static public void Promedios(){
			promedio=A.promedio(calificaci);
		}
		static public void mostrarMaterias(){
			for(int i=0;i<A.NM;i++){
				System.out.println("La materia "+nombrMat[i]+" con clave "+clavMat[i] +" tiene "+horSemanMat[i]+" horas a la semana y contiene "
						+creditMat[i]+" creditos y su calificacion es .");
			}
			System.out.println("Y promedio "+promedio);
		}
//METODO PARA SACAR EL PROMEDIO DE LA INSTITUCION QUE EL USUARIO CREO
		static public int Promediofacultad(){
			int suma=0;
			for(int i=0;i<A.NA;i++){
				GuardarCalificacionsMateria();
				Promedios();
				suma=suma+promedio;
			}
			int nuevoPromedio=suma/(A.NA);
			return nuevoPromedio;
		}
//METODO PARA SABER CUAL ES LA MATERIA CON MAS ALUMNOS
		static public void MateMasAlumnos(){
			int valor=0;
			int indice=0;
			GuardarNombreCurso();
			GuardarAlumnosCurso();
			for(int i=0;i<A.NC;i++){
				if(alumnosInsCurso[i]>valor){
					valor=alumnosInsCurso[i];
					indice=i;
				}else{
					continue;
				}				
			}		
			System.out.println("El curso de "+nombreCursoss[indice]+" es el que tiene mas alumnos inscritos ya "+
					"que cuenta con "+valor+" alumnos inscritos.");
		}
		static public int sacarEdadAlumno(){
			int[] edades=new int[A.NA];
			GuardarFechNacimAlumno();
			for(int i=0;i<A.NA;i++){
				edades[i]=(2017-fechNac[i]);
			}
			int promedioEdad=A.promedio(edades);
			return promedioEdad;
			
		}
		static public int sacarEdadMaestro(){
			int[] edades=new int[A.NP];
			GuardarAnioNacMaestros();
			for(int i=0;i<A.NP;i++){
				edades[i]=(2017-(anioNacProfes[i]));
			}
			int promedioEdad=A.promedio(edades);
			return promedioEdad;
		}
//MENU CONSULTAR INSTITUCION PREDETERMINADA
		static public void menuConsultar(){
			int respuesta=0;
			while(opcionMenuConsultar2){
				System.out.println("");
				System.out.println("1. Consultar Nombre");
				System.out.println("2. Consulatar Año Fundacion");
				System.out.println("3. Consultar Cursos");
				System.out.println("4. Consultar Alumnos");
				System.out.println("5. Consultar Maestros");
				System.out.println("6. Consultar Materias");
				System.out.println("7. Promedio Facultad");
				System.out.println("8. Atras");
				System.out.println("9. Salir");
				System.out.println("-------------------------");
				System.out.print(">>> ");
				respuesta=T.nextInt();
				T.nextLine();

				switch(respuesta){
					case 1:
						String nombre=A.nombreFacultaYaHecha();
						System.out.println("El nombre de la facultad es "+nombre);
						break;
					case 2:
						int anioFun=A.anioFundacion();
						System.out.println("El anio de fundacion es "+anioFun);
						break;
					case 3:
						A.consultarCursos();
						break;
					case 4:
						menuConsultarAlumnos();
						break;
					case 5:
						A.consultarProfesores();
						break;
					case 6:
						menuConsultarMaterias();
						
						break;
					case 7:
						int promedioFac=A.promeFacuMenu2();
						System.out.println("El promedio es: "+promedioFac);
						break;
					case 8:
						opcionMenuConsultar2=false;
						break;
					case 9:
						opcionMenuConsultar2=false;
						menuConsultarPrincipal=false;
						opcionMenu=false;
			      		opcionSalir=false;
						break;
					default:
						System.out.println("Ingrese una opcion valida.-_-");
						break;
				}
			}
		}
//METODO CONSULTAR NOMBRE Y ANIO DE FUNDACION DE LA INSTITUCION CREADA POR EL USUARIO
		static public void menuConsultarNomFacu(){
			int respuesta=0;
			while(opcionMenuConsultarNomFacu){
				System.out.println("El nombre de la facultad es: "+nomFacultad);
				System.out.println("El anio de findacion es: "+anioFundacion);
				System.out.println("1. Atras");
				System.out.println("2. Salir");
				System.out.println("-------------------------");
				System.out.print(">>> ");
				respuesta=T.nextInt();
				switch(respuesta){
					case 1:
						opcionMenuConsultarNomFacu=false;
						break;
					case 2:
						opcionMenuConsultarNomFacu=false;
						opcionMenuConsultar1=false;
						menuConsultarPrincipal=false;
						opcionMenu=false;
			      		opcionSalir=false;
						break;
					default:
						System.out.println("Ingrese una opcion valida.-_-");
						break;
				}
			}
		}
//MENU CONSULTAR ALUMNOS DE LA INSTITUCION PREDETERMINADA
		static public void menuConsultarAlumnos(){
			int respuesta=0;
			while(consultarAlumnos){
				System.out.println("1. Introduzca el nombre del alumno");
				System.out.println("2. Atras");
				System.out.println("3. Salir");
				System.out.println("-------------------------");
				System.out.print(">>> ");
				respuesta=T.nextInt();
				T.nextLine();
				switch(respuesta){
					case 1:
						A.consultarAlumnos();
						break;
					case 2:
						consultarAlumnos=false;
					case 3:
						consultarAlumnos=false;
						opcionMenuConsultar2=false;
						menuConsultarPrincipal=false;
						opcionMenu=false;
			      		opcionSalir=false;
			      		Institucion();
						break;
					default:
						System.out.println("Ingrese una opcion valida.-_-");
						break;
				}
			}
		}
//MENU CONSULTARMATERIAS PARA INSTITUCION PREDETERMINADA
		static public void menuConsultarMaterias(){
			int respuesta=0;
			while(consultarMaterias){
				System.out.println("1. Introduzca el nombre del la materia");
				System.out.println("2. Atras");
				System.out.println("3. Salir");
				System.out.println("-------------------------");
				System.out.print(">>> ");
				respuesta=T.nextInt();
				T.nextLine();
				switch(respuesta){
					case 1:
						A.consultarMateria();
						break;
					case 2:
						consultarMaterias=false;
					case 3:
						consultarMaterias=false;
						opcionMenuConsultar2=false;
						menuConsultarPrincipal=false;
						opcionMenu=false;
			      		opcionSalir=false;
			      		Institucion();
						break;
					default:
						System.out.println("Ingrese una opcion valida.-_-");
						break;
				}
			}
		}
// MENU PARA INGRESAR LA INFORMACION
		static public void ingresarInformacion(){
			int respuesta=0;

			while(IngInf){
				System.out.println("");
		        System.out.println("1. Ingresar Alumnos");
		        System.out.println("2. Ingresar Maestros");
		        System.out.println("3. Ingresar Materias");
		        System.out.println("4. Ingresar Curso");
		        System.out.println("5. Ingresar Informacion Facultad");
		        System.out.println("6. Atras");
		        System.out.println("7. Salir");
		        System.out.println("-------------------------");
		        System.out.print(">>> ");
		        respuesta=T.nextInt();
		        T.nextLine();
		        
		        switch(respuesta){
		        	case 1:
		        		 numAlumnos();
		        		break;

		        	case 2:
		        		numProfesor();
		        		break;

		        	case 3:
		        		numMaterias();
		        		break;
		        		
		        	case 4:
		        		numCurso();
		        		break;
		        	case 5:
		        		nomFacultad=A.ponerNombreInstitucion();
		        		anioFundacion=A.ponerAnioFundacion();
		        		break;
		        		
		        	case 6:
		        		IngInf=false;
		        		break;
		        	case 7:
		        		IngInf=false;
		        		opcionMenu=false;
			      		opcionSalir=false;
			      		Institucion();
		        		break;

		        	default:
		        		System.out.println("Ingrese1 una opcion valida.-_-");
		        		break;
		        }
			}
		}
//MENU PARA INGRESAR EL NUMERO DE ALUMNOS
		static public void numAlumnos(){
			int respuesta=0;
			while(numerAlumnos){
				System.out.println("1. Ingresar el numero de alumnos:");
				System.out.println("2. Atras");
		        System.out.println("3. Salir");
		        System.out.println("-------------------------");
		    	System.out.print(">>> ");
		        respuesta=T.nextInt();
		        T.nextLine();
		        switch(respuesta){
	        	case 1:
	        		A.Alumnos();
	        		break;
	        	case 2:
	        		numerAlumnos=false;
	        		break;
	        	case 3:
	        		numerAlumnos=false;
	        		IngInf=false;
	        		opcionMenu=false;
		      		opcionSalir=false;
		      		Institucion();
	        		break;

	        	default:
	        		System.out.println("Ingrese1 una opcion valida.-_-");
	        		break;
		        }
			}
		}
//MENU PARA INGRESAR EL NUMERO DE  PROFESORES
		static public void numProfesor(){
			int respuesta=0;
			while(numProfesor){
				System.out.println("1. Ingresar el numero de profesor:");
				System.out.println("2. Atras");
		        System.out.println("3. Salir");
		        System.out.println("-------------------------");
		    	System.out.print(">>> ");
		        respuesta=T.nextInt();
		        T.nextLine();
		        switch(respuesta){
	        	case 1:
	        		A.Maestros();
	        		break;
	        	case 2:
	        		numProfesor=false;
	        		break;
	        	case 3:
	        		numProfesor=false;
	        		IngInf=false;
	        		opcionMenu=false;
		      		opcionSalir=false;
		      		Institucion();
	        		break;

	        	default:
	        		System.out.println("Ingrese1 una opcion valida.-_-");
	        		break;
		        }
			}
		}
//MENU PARA INGRESAR EL NUMERO DE MATERIAS
		static public void numMaterias(){
			int respuesta=0;
			while(numeMaterias){
				System.out.println("1. Ingresar el numero de Materias:");
				System.out.println("2. Atras");
		        System.out.println("3. Salir");
		        System.out.println("-------------------------");
		    	System.out.print(">>> ");
		        respuesta=T.nextInt();
		        T.nextLine();
		        switch(respuesta){
	        	case 1:
	        		A.materias();
	        		break;
	        	case 2:
	        		numeMaterias=false;
	        		break;
	        	case 3:
	        		numeMaterias=false;
	        		IngInf=false;
	        		opcionMenu=false;
		      		opcionSalir=false;
		      		Institucion();
	        		break;

	        	default:
	        		System.out.println("Ingrese1 una opcion valida.-_-");
	        		break;
		        }
			}
		}
//MENU PARA INGRESAR LA INFORMACION DEL ALUMNO		
		static public void Informacionalumno(int numAlumno){
			int numeroAlunmos=numAlumno;
			int respuesta=0;
			while(InfAlumno){
				System.out.println("Ingresar");
		        System.out.println("1. Nombre Alumno");
		        System.out.println("2. FechaNacimiento");
		        System.out.println("3. Año de Ingreso");
		        System.out.println("4. Año de Egreso");
		        System.out.println("5. Matricula");
		        System.out.println("6. Atras");
		        System.out.println("7. Salir");
		        System.out.println("-------------------------");
		        System.out.print(">>> ");
		        respuesta=T.nextInt();
		        T.nextLine();
		        switch(respuesta){
		        	case 1:
		        		A.ponerNombre(numeroAlunmos);
		        		break;

		        	case 2:
		        		A.ponerFechaNaci(numeroAlunmos);
		        		break;

		        	case 3:
		        		A.ponerAnioIngreso(numeroAlunmos);
		        		break;
		        		
		        	case 4:
		        		A.ponerAnioEgreso(numeroAlunmos);
		        		break;
		        	case 5:
		        		PreguntarMatricula(numAlumno);
		        		break;
		        		
		        	case 6:
		        		InfAlumno=false;
		        		break;
		        	case 7:
		        		InfAlumno=false;
		        		numerAlumnos=false;
		        		IngInf=false;
		        		opcionMenu=false;
			      		opcionSalir=false;
		        		break;

		        	default:
		        		System.out.println("Ingrese1 una opcion valida.-_-");
		        		break;
		        }
			}
		}
//MENU PARA PREGUNTAR SI LA MATRICULA SERA INGRESADA MANUALMENTE O SI SE GENERE ALEATORIAMENTE
		static public void PreguntarMatricula(int numAlumnos){
			int respuesta=0;
			while(pregMatricula){
		        System.out.println("1. Poner Manualmente");
		        System.out.println("2. Generar AleatoriaMente");
		        System.out.println("3. Atras");
		        System.out.println("4. Salir");
		        System.out.println("-------------------------");
		        System.out.print(">>> ");
		        respuesta=T.nextInt();
		        T.nextLine();
		        switch(respuesta){
		        	case 1:
		        		A.matriculaManualmente(numAlumnos);
		        		break;
		        	case 2:
		        		A.generarMatricula(numAlumnos);
		        		break;
		        	case 3:
		        		pregMatricula=false;
		        		break;
		        	case 4:
		        		pregMatricula=false;
		        		InfAlumno=false;
		        		numerAlumnos=false;
		        		IngInf=false;
		        		opcionMenu=false;
			      		opcionSalir=false;
		        		break;
		        		
		        	default:
		        		System.out.println("Ingrese una opcion valida.-_-");
		        		break;
		        }
			}
		}
//MENU PARA INGRESAR LA INFORMACION DEL MAESTRO
		static public void ingresarInformacionMaestros(int numeroProfesores){
			int respuesta=0;
			while(InfMaestros){
				System.out.println("");
		        System.out.println("1. Ingresar Nombre del Maestro");
		        System.out.println("2. Ingresar Numero de profesor");
		        System.out.println("3. Ingresar Año de nacimiento");
		        System.out.println("4. Ingresar Año de ingreso");
		        System.out.println("5. Atras");
		        System.out.println("6. Salir");
		        System.out.println("-------------------------");
		        System.out.print(">>> ");
		        respuesta=T.nextInt();
		        T.nextLine();
		        switch(respuesta){
		        	case 1:
		        		A.ponerNombreProfesor(numeroProfesores);
		        		break;

		        	case 2:
		        		A.ponerNumeroProfesor(numeroProfesores);
		        		break;
		        	case 3:
		        		A.ponerAnioNacimientoMaestros(numeroProfesores);
		        		break;
		        	case 4:
		        		A.ponerAnioIngresoMaestros(numeroProfesores);
		        		break;

		        	case 5:
		        		InfMaestros=false;
		        		break;
		        	case 6:
		        		InfMaestros=false;
		        		numProfesor=false;
		        		IngInf=false;
		        		opcionMenu=false;
			      		opcionSalir=false;
		        		break;
		        		
		        	default:
		        		System.out.println("Ingrese una opcion valida.-_-");
		        		break;
		        }
			}
		}
//MENU PARA INGRESAR LA INFORMACION DE LAS MATERIAS
		static public void ingresarInformacionMaterias(int numMaterias){
			int respuesta=0;
			while(InfMaterias){
				System.out.println("");
		        System.out.println("1. Ingresar Nombre del Materia");
		        System.out.println("2. Ingresar Clave de Materia");
		        System.out.println("3. Ingresar Horas por semana");
		        System.out.println("4. Ingresar Creditos");
		        System.out.println("5. Ingresar Calificaciones");
		        System.out.println("6. Atras");
		        System.out.println("7. Salir");
		        System.out.println("-------------------------");
		        System.out.print(">>> ");
		        respuesta=T.nextInt();
		        T.nextLine();
		        switch(respuesta){
		        	case 1:
		        		A.ponerNombreMateria(numMaterias);
		        		break;

		        	case 2:
		        		A.ponerClaveMateria(numMaterias);
		        		break;
		        		
		        	case 3:
		        		A.ponerHorasSemana(numMaterias);
		        		break;
		        		
		        	case 4:
		        		A.ponerCreditos(numMaterias);
		        		break;
		        		
		        	case 5:
		        		PreguntarCalificaciones(numMaterias);
		        		break;		        		
		        		
		        	case 6:
		        		InfMaterias=false;
		        		break;
		        	case 7:
		        		InfMaterias=false;
		        		numeMaterias=false;
		        		IngInf=false;
		        		opcionMenu=false;
			      		opcionSalir=false;
		        		break;
		        		
		        	default:
		        		System.out.println("Ingrese una opcion valida.-_-");
		        		break;
		        }
			}
		}
//MENU PARA PREGUNTAR SI LAS CALIFICACIONES SE PONDRAN MANUALMENTE O SI SE GENERAN ALEATORIAMENTE
		static public void PreguntarCalificaciones(int numMaterias){
			int respuesta=0;
			while(pregCalificacion){
		        System.out.println("1. Poner Manualmente");
		        System.out.println("2. Generar AleatoriaMente");
		        System.out.println("3. Atras");
		        System.out.println("4. Salir");
		        System.out.println("-------------------------");
		        System.out.print(">>> ");
		        respuesta=T.nextInt();
		        T.nextLine();
		        switch(respuesta){
		        	case 1:
		        		A.ponerCalificacion(numMaterias);
		        		break;
		        	case 2:
		        		A.ponerCalificacionAleatorio(numMaterias);
		        		break;
		        	case 3:
		        		pregCalificacion=false;
		        		break;
		        	case 4:
		        		pregCalificacion=false;
		        		InfMaterias=false;
		        		numeMaterias=false;
		        		IngInf=false;
		        		opcionMenu=false;
			      		opcionSalir=false;
		        		break;
		        		
		        	default:
		        		System.out.println("Ingrese una opcion valida.-_-");
		        		break;
		        }
			}
		}
//MENU PARA INGRESAR EL NUMERO DE ALUMNOS		
		static public void numCurso(){
			int respuesta=0;
			while(numerosCursos){
				System.out.println("1. Ingresar el numero de curso:");
				System.out.println("2. Atras");
		        System.out.println("3. Salir");
		        System.out.println("-------------------------");
		    	System.out.print(">>> ");
		        respuesta=T.nextInt();
		        T.nextLine();
		        switch(respuesta){
	        	case 1:
	        		A.curso();
	        		break;
	        	case 2:
	        		numerosCursos=false;
	        		break;
	        	case 3:
	        		numerosCursos=false;
	        		IngInf=false;
	        		opcionMenu=false;
		      		opcionSalir=false;
	        		break;

	        	default:
	        		System.out.println("Ingrese una opcion valida.-_-");
	        		break;
		        	}
		        }
			}
//MENU PARA INGRESAR EL NUMERO DE CURSOS
		static void ingresarInformacionCurso(int numCursos){
			int respuesta=0;
			while(InfCursos){
				System.out.println("");
		        System.out.println("1. Ingresar Nombre del Curso");
		        System.out.println("2. Ingresar Clave de Curso");
		        System.out.println("3. Ingresar Profesor");
		        System.out.println("4. Ingresar Alumnos inscritos");
		        System.out.println("5. Atras");
		        System.out.println("6. Salir");
		        System.out.println("-------------------------");
		        System.out.print(">>> ");
		        respuesta=T.nextInt();
		        T.nextLine();
		        switch(respuesta){
		        	case 1:
		        		A.ponerNombreCurso(numCursos);
		        		break;
		        		
		        	case 2:
		        		A.ponerClaveCurso(numCursos);
		        		break;
		        		
		        	case 3:
		        		A.ponerProfesorCurso(numCursos);
		        		break;
		        	case 4:
		        		A.ponerAlumnosCurso(numCursos);
		        		break;
		        				        		
		        	case 5:
		        		InfCursos=false;
		        		break;
		        	case 6:
		        		InfCursos=false;
		        		numerosCursos=false;
		        		IngInf=false;
		        		opcionMenu=false;
			      		opcionSalir=false;
		        		break;
		        		
		        	default:
		        		System.out.println("Ingrese una opcion valida.-_-");
		        		break;
		        }
			}
		}
}
