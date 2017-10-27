import java.util.Scanner;
//falta relacionar las materias con los alumnos 
//falta relacionar los creditos con los alumnos
//falta preguntar al usuario si va a poner las calificaciones o sera aleatoriamente
//despues de las calificaciones sacar el promedio
// crear constructores de prepas
//IDEAS: crear instituciones y despues asignar si es prepa o alguno de los otros campos
//   ir asignando un 1 cuando se cree una prepa o un instituto para asi tener 
//	 los contador cuando se crea cada institucion

public class crearPrepa {
	String nombrePre;
	static int numeroAlumnos;
	static int numeroMaestros;
	static int numeroMaterias;
	
	String[] Nombres=null;
	int[] anioNacimiento=null;
	int[] anioIngreso=null;
	int[] anioEgreso=null;
	int[] matricula=null;
	String[] NombreProf=null;
	int[] NumeroProf=null;
	String[] NombreMateria=null;
	int[] claveMateria=null;
	int[] horasSemanas=null;
	int[] creditos=null;
	
	Scanner T=new Scanner(System.in);
	crearPrepa(){
		
	}
	
	public void materias(){
		System.out.println("Ingrese la cantidad de Materias ");
		numeroMaterias=T.nextInt();
		ingresarInformacionMaterias();
	}
	public void Alumnos(){
		System.out.println("Ingrese la cantidad de alumnos: ");
		numeroAlumnos=T.nextInt();
		ingresarInformacion();
	}
	public void Maestros(){
		System.out.println("Ingrese la cantidad de alumnos: ");
		numeroMaestros=T.nextInt();
		ingresarInformacionMaestros();
	}
	public void CalificaionesAlea(){
		
	}
	public void Promedio(){
		
	}
	
	public void ingresarInformacion(){
		int respuesta=0;
	      boolean opcion=true;
	      while(opcion){
	        System.out.println("Ingresar");
	        System.out.println("1. Nombre del alumno");
	        System.out.println("2. Fecha de Nacimiento");
	        System.out.println("3. Anio de Ingreso");
	        System.out.println("4. Anio de Egreso");
	        System.out.println("5. Matricula");
	        System.out.println("6. Atras");
	        System.out.println("-------------------------");
	        System.out.print(">>> ");
	        respuesta=T.nextInt();
	        
	        switch(respuesta){
	        	case 1:
	        		ponerNombre();
	        		break;

	        	case 2:
	        		ponerFechaNaci();
	        		break;

	        	case 3:
	        		ponerAnioIngreso();
	        		break;
	        		
	        	case 4:
	        		ponerAnioEgreso();
	        		break;
	        	case 5:
	        		PreguntarMatricula();
	        		break;
	        		
	        	case 6:
	        		opcion=false;
	        		break;

	        	default:
	        		break;
	        }
	      }
	}
	 public void ponerNombre(){
		for(int i=0;i<numeroAlumnos;i++){
			System.out.println("Ingrese el nombre del alumno "+(i+1)+": ");
			String nombre=T.nextLine();
			this.Nombres[i]=nombre;
		}
	}
	 public void ponerFechaNaci(){
		for(int i=0;i<numeroAlumnos;i++){
			System.out.println("Ingrese el anio de nacimiento del alumno "+(i+1)+": ");
			int anio=T.nextInt();
			this.anioNacimiento[i]=anio;
		}
	}
	 public void ponerAnioIngreso(){
			for(int i=0;i<numeroAlumnos;i++){
				System.out.println("Ingrese el anio de Ingreso del alumno "+(i+1)+": ");
				int anio=T.nextInt();
				this.anioIngreso[i]=anio;
			}
		}
	 public void ponerAnioEgreso(){
			for(int i=0;i<numeroAlumnos;i++){
				System.out.println("Ingrese el anio de Ingreso del alumno "+(i+1)+": ");
				int anio=T.nextInt();
				this.anioEgreso[i]=anio;
			}
		}
	 public void PreguntarMatricula(){
		 int respuesta=0;
	      boolean opcion=true;
	      while(opcion){
	        System.out.println("1. Poner Manualmente");
	        System.out.println("1. Generar AleatoriaMente");
	        System.out.println("-------------------------");
	        System.out.print(">>> ");
	        respuesta=T.nextInt();
	        
	        switch(respuesta){
	        	case 1:
	        		matriculaManualmente();
	        	break;
	        	case 2:
	        		generaMatricula();
	        	break;
	        		
	        	default:
	        		break;
	        }
	      }
	 }
	 public void matriculaManualmente(){
		 for(int i=0;i<numeroAlumnos;i++){
				System.out.println("Ingrese la matricula del alumno "+(i+1)+": ");
				int anio=T.nextInt();
				this.matricula[i]=anio;
			}
	 }
	 private void generaMatricula(){
		 for(int i=0;i<numeroAlumnos;i++){
		 int Matricula=(int)(Math.random()*1000000);
		 this.matricula[i]=Matricula;
		 }
	 }
	 public void ingresarInformacionMaestros(){
			int respuesta=0;
		      boolean opcion=true;
		      while(opcion){
		        System.out.println("Ingresar");
		        System.out.println("1. Nombre del Maestro");
		        System.out.println("2. Numero de profesor");
		        System.out.println("3. Atras");
		        System.out.println("-------------------------");
		        System.out.print(">>> ");
		        respuesta=T.nextInt();
		        
		        switch(respuesta){
		        	case 1:
		        		ponerNombreProfesor();
		        		break;

		        	case 2:
		        		ponerNumeroProfesor();
		        		break;

		        	case 3:
		        		opcion=false;
		        		break;
		        		
		        	default:
		        		break;
		        }
		      }
		}
	 public void ponerNombreProfesor(){
			for(int i=0;i<numeroMaestros;i++){
				System.out.println("Ingrese el nombre del Maestro "+(i+1)+": ");
				String nombre=T.nextLine();
				this.NombreProf[i]=nombre;
			}
		}
	 public void ponerNumeroProfesor(){
			for(int i=0;i<numeroMaestros;i++){
				System.out.println("Ingrese el numero del Maestro "+(i+1)+": ");
				int nombre=T.nextInt();
				this.NumeroProf[i]=nombre;
			}
		}
	 public void ingresarInformacionMaterias(){
			int respuesta=0;
		      boolean opcion=true;
		      while(opcion){
		        System.out.println("Ingresar");
		        System.out.println("1. Nombre del Materia");
		        System.out.println("2. Clave de Materia");
		        System.out.println("3. Horas por semana");
		        System.out.println("4. Creditos");
		        System.out.println("5. Atras");
		        System.out.println("-------------------------");
		        System.out.print(">>> ");
		        respuesta=T.nextInt();
		        
		        switch(respuesta){
		        	case 1:
		        		ponerNombreMateria();
		        		break;

		        	case 2:
		        		ponerClaveMateria();
		        		break;
		        		
		        	case 3:
		        		ponerHorasSemana();
		        		break;
		        		
		        	case 4:
		        		ponerCreditos();
		        		break;
		        		
		        	case 5:
		        		opcion=false;
		        		break;
		        		
		        	default:
		        		break;
		        }
		      }
		}
	 public void ponerNombreMateria(){
			for(int i=0;i<numeroMaterias;i++){
				System.out.println("Ingrese el nombre de la Materia "+(i+1)+": ");
				String nombre=T.nextLine();
				this.NombreMateria[i]=nombre;
			}
		}
	 public void ponerClaveMateria(){
			for(int i=0;i<numeroMaterias;i++){
				System.out.println("Ingrese la clave de la Materia "+(i+1)+": ");
				int nombre=T.nextInt();
				this.claveMateria[i]=nombre;
			}
		}
	 public void ponerHorasSemana(){
			for(int i=0;i<numeroMaterias;i++){
				System.out.println("Ingrese las horas por semana de la Materia "+(i+1)+": ");
				int nombre=T.nextInt();
				this.horasSemanas[i]=nombre;
			}
		}
	 public void ponerCreditos(){
			for(int i=0;i<numeroMaterias;i++){
				System.out.println("Ingrese los creditos de la Materia "+(i+1)+": ");
				int nombre=T.nextInt();
				this.creditos[i]=nombre;
			}
		}
}
