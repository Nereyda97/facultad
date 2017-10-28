import java.util.Scanner;

class Menu extends metodosMenu{
	
	static metodosMenu A=new metodosMenu();
	static int contadorPreparatoria=0;
	static int contadorFacultad=0;
	static int contadorInstituto=0;
	static int contadorEscuela=0;
	static int contadorOtro=0;
	static String variable="";
	static Scanner T=new Scanner(System.in);
	static boolean opcionSalir=true;
	static boolean opcionMenu=true;
	static boolean opcionMenuConsultar=true;
	static boolean opcionMenuConsultarNomFacu=true;
	static boolean consultarAlumnos=true;
	static boolean consultarMaterias=true;
	static boolean IngInf=true;
	static boolean pregMatricula=true;
	static boolean InfAlumno=true;
	static boolean InfMaestros=true;
	static boolean InfMaterias=true;
	
	Menu(){
		
	}
	
//METODO PRINCIPAL
	public static void Institucion(){
		boolean opcion=true;
	    
	    int respuesta=0;

	    while(opcionSalir){
	    	System.out.println("Institucion");
	    	System.out.println("1. Prepa");
	    	System.out.println("2. Facultad");
	    	System.out.println("3. Instituto");
	    	System.out.println("4. Escuela");
	    	System.out.println("5. Otro");
	    	System.out.println("6. Salir");
	    	System.out.println("-------------------------");
	    	System.out.print(">>> ");
	    	respuesta=T.nextInt();

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
	    Scanner T=new Scanner(System.in);
	    int respuesta=0;
	    while(opcionMenu){
	    	System.out.println(a);
	    	System.out.println("1. Crear");
	    	System.out.println("2. Consultar");
	    	System.out.println("3. Atras");
	    	System.out.println("4. Salir");
	    	System.out.println("-------------------------");
	    	System.out.print(">>> ");
	    	respuesta=T.nextInt();

	      switch(respuesta){
	      	case 1:
	      		ingresarInformacion();
	      		break;

	      	case 2:
	      		menuConsultar();
	      		break;

	      	case 3:
	      		opcionMenu=false;
	      		break;
	      	case 4:
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

//MENU CONSULTAR
	//falta metodos curso,nombre facultad,salones
	static public void menuConsultar(){
		Scanner T=new Scanner(System.in);
		int respuesta=0;
		while(opcionMenuConsultar){
			System.out.println("Consultar");
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

			switch(respuesta){
				case 1:
					menuConsultarNomFacu();
					break;
				case 2:
					System.out.println("3. Consultar");
					break;
				case 3:
					System.out.println("3. Consultar");
					break;
				case 4:
					menuConsultarAlumnos();
					break;
				case 5:
					menuConsultarMaterias();
					break;
				case 6:
					System.out.println("3. Consultar");
					break;
				case 7:
					opcionMenuConsultar=false;
					break;
				case 8:
					opcionMenu=false;
		      		opcionSalir=false;
		      		opcionMenuConsultar=false;
		      		Institucion();
					break;
				default:
					System.out.println("Ingrese una opcion valida.-_-");
					break;
			}
		}
	}
//EDITAR ESTE  MENU PARA QUE MUESTRE EL NOMBRE DE LA FACULTAD
	static public void menuConsultarNomFacu(){
		Scanner T=new Scanner(System.in);
		int respuesta=0;
		
		while(opcionMenuConsultarNomFacu){
			System.out.println("La facultas es: Fismat");
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
					opcionMenuConsultar=false;
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
	static public void menuConsultarAlumnos(){
		Scanner T=new Scanner(System.in);
		int respuesta=0;
		
		while(consultarAlumnos){
			System.out.println("1. Introduzca el nombre del alumno");
			System.out.println("2. Atras");
			System.out.println("3. Salir");
			System.out.println("-------------------------");
			System.out.print(">>> ");
			respuesta=T.nextInt();
			switch(respuesta){
				case 1:
					A.consultarAlumnos();
					break;
				case 2:
					consultarAlumnos=false;
				case 3:
					consultarAlumnos=false;
					opcionMenuConsultar=false;
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
	static public void menuConsultarMaterias(){
		Scanner T=new Scanner(System.in);
		int respuesta=0;
		
		while(consultarMaterias){
			System.out.println("1. Introduzca el nombre del la materia");
			System.out.println("2. Atras");
			System.out.println("3. Salir");
			System.out.println("-------------------------");
			System.out.print(">>> ");
			respuesta=T.nextInt();
			switch(respuesta){
				case 1:
					A.consultarAlumnos();
					break;
				case 2:
					consultarMaterias=false;
				case 3:
					consultarMaterias=false;
					opcionMenuConsultar=false;
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
	public static void ingresarInformacion(){
		int respuesta=0;
		while(IngInf){
			System.out.println("Ingresar");
	        System.out.println("1. Alumnos");
	        System.out.println("2. Maestros");
	        System.out.println("3. Materias");
	        System.out.println("4. Curso");
	        System.out.println("5. NombreFacultad");
	        System.out.println("6. Atras");
	        System.out.println("7. Salir");
	        System.out.println("-------------------------");
	        System.out.print(">>> ");
	        respuesta=T.nextInt();
	        
	        switch(respuesta){
	        	case 1:
	        		Informacionalumno();
	        		break;

	        	case 2:
	        		ingresarInformacionMaestros();
	        		break;

	        	case 3:
	        		ingresarInformacionMaterias();
	        		break;
	        		
	        	case 4:
	        		
	        		break;
	        	case 5:
	        		
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
	static public void Informacionalumno(){
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
	        
	        switch(respuesta){
	        	case 1:
	        		A.ponerNombre();
	        		break;

	        	case 2:
	        		A.ponerFechaNaci();
	        		break;

	        	case 3:
	        		A.ponerAnioIngreso();
	        		break;
	        		
	        	case 4:
	        		A.ponerAnioEgreso();
	        		break;
	        	case 5:
	        		PreguntarMatricula();
	        		break;
	        		
	        	case 6:
	        		InfAlumno=false;
	        		break;
	        	case 7:
	        		InfAlumno=false;
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
	static public void PreguntarMatricula(){
		int respuesta=0;
		while(pregMatricula){
	        System.out.println("1. Poner Manualmente");
	        System.out.println("2. Generar AleatoriaMente");
	        System.out.println("3. Atras");
	        System.out.println("4. Salir");
	        System.out.println("-------------------------");
	        System.out.print(">>> ");
	        respuesta=T.nextInt();
	        
	        switch(respuesta){
	        	case 1:
	        		A.matriculaManualmente();
	        		break;
	        	case 2:
	        		A.generarMatricula();
	        		break;
	        	case 3:
	        		pregMatricula=false;
	        		break;
	        	case 4:
	        		pregMatricula=false;
	        		IngInf=false;
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
	public static void ingresarInformacionMaestros(){
		int respuesta=0;
		while(InfMaestros){
			System.out.println("Ingresar");
	        System.out.println("1. Nombre del Maestro");
	        System.out.println("2. Numero de profesor");
	        System.out.println("3. Año de nacimiento");
	        System.out.println("4. Año de ingreso");
	        System.out.println("5. Atras");
	        System.out.println("6. Salir");
	        System.out.println("-------------------------");
	        System.out.print(">>> ");
	        respuesta=T.nextInt();
	        
	        switch(respuesta){
	        	case 1:
	        		A.ponerNombreProfesor();
	        		break;

	        	case 2:
	        		A.ponerNumeroProfesor();
	        		break;
	        	case 3:
	        		A.ponerAnioNacimientoMaestros();
	        		break;
	        	case 4:
	        		A.ponerAnioIngresoMaestros();
	        		break;

	        	case 5:
	        		InfMaestros=false;
	        		break;
	        	case 6:
	        		InfMaestros=false;
	        		IngInf=false;
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
	static public void ingresarInformacionMaterias(){
		int respuesta=0;
		while(InfMaterias){
			System.out.println("Ingresar");
	        System.out.println("1. Nombre del Materia");
	        System.out.println("2. Clave de Materia");
	        System.out.println("3. Horas por semana");
	        System.out.println("4. Creditos");
	        System.out.println("5. Atras");
	        System.out.println("6. Salir");
	        System.out.println("-------------------------");
	        System.out.print(">>> ");
	        respuesta=T.nextInt();
	        
	        switch(respuesta){
	        	case 1:
	        		A.ponerNombreMateria();
	        		break;

	        	case 2:
	        		A.ponerClaveMateria();
	        		break;
	        		
	        	case 3:
	        		A.ponerHorasSemana();
	        		break;
	        		
	        	case 4:
	        		A.ponerCreditos();
	        		break;
	        		
	        	case 5:
	        		InfMaterias=false;
	        		break;
	        	case 6:
	        		InfMaterias=false;
	        		IngInf=false;
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
	static void ingresarInformacionCurso(){
		
	}
}