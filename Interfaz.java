import java.util.Scanner;
class Interfaz{

  //PROGRAMA PRINCIPAL PARA MATERIAS Y ALUMNOS
  public static void main(String[] args){
    boolean opcion=true;
    Scanner T=new Scanner(System.in);
    int respuesta=0;
    while(opcion){
      System.out.println("Facultad");
      System.out.println("1. Crear");
      System.out.println("2. Modificar");
      System.out.println("3. Consultar");
      System.out.println("4. Salir");
      System.out.println("-------------------------");
      System.out.print(">>> ");
      respuesta=T.nextInt();
      
      switch(respuesta){
      	case 1:
      		menuCrear();
      		break;

      	case 2:
      		menuModificar();
      		break;

      	case 3:
      		menuConsultar();
      		break;

      	case 4:
      		opcion=false;
      		break;

      	default:
      		break;
      }
    } 
  }
  
//MENU CREAR
  
  static public void menuCrear(){
	  Scanner T=new Scanner(System.in);
      int respuesta=0;
      boolean opcion=true;
      while(opcion){
        System.out.println("Crear");
        System.out.println("1. Prepa");
        System.out.println("2. Facultad");
        System.out.println("3. Instituto");
        System.out.println("4. Escuela");
        System.out.println("5. Otro");
        System.out.println("7. Atras");
        System.out.println("-------------------------");
        System.out.print(">>> ");
        respuesta=T.nextInt();
        
        switch(respuesta){
        	case 1:
        		System.out.println("1. Crear");
        		break;

        	case 2:
        		System.out.println("2. Modificar");
        		break;

        	case 4:
        		System.out.println("3. Consultar");
        		break;
        		
        	case 5:
        		System.out.println("3. Consultar");
        		break;
        		
        	case 6:
        		System.out.println("3. Consultar");
        		break;
        		
        	case 7:
        		opcion=false;
        		break;

        	default:
        		break;
        }
      }
  }
  
//MENU MODIFICAR
  
  static public void menuModificar(){
	  Scanner T=new Scanner(System.in);
      int respuesta=0;
      boolean opcion=true;
      while(opcion){
        System.out.println("Modificar");
        System.out.println("1. Modificar Nombre Facultad");
        System.out.println("2. Modificar Cursos");
        System.out.println("3. Modificar Maestros");
        System.out.println("4. Modificar Alumnos");
        System.out.println("5. Modificar Materias");
        System.out.println("6. Modificar Salones");
        System.out.println("7. Atras");
        System.out.println("-------------------------");
        System.out.print(">>> ");
        respuesta=T.nextInt();
        
        switch(respuesta){
        	case 1:
        		System.out.println("1. Crear");
        		break;

        	case 2:
        		System.out.println("2. Modificar");
        		break;

        	case 4:
        		System.out.println("3. Consultar");
        		break;
        		
        	case 5:
        		System.out.println("3. Consultar");
        		break;
        		
        	case 6:
        		System.out.println("3. Consultar");
        		break;
        		
        	case 7:
        		opcion=false;
        		break;

        	default:
        		break;
        }
      }
  }
  static public void menuConsultar(){
	  Scanner T=new Scanner(System.in);
      int respuesta=0;
      boolean opcion=true;
      while(opcion){
        System.out.println("Consultar");
        System.out.println("1. Consultar Nombre Facultad");
        System.out.println("2. Consultar Cursos");
        System.out.println("3. Consultar Maestros");
        System.out.println("4. Consultar Alumnos");
        System.out.println("5. Consultar Materias");
        System.out.println("6. Consultar Salones");
        System.out.println("7. Atras");
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

        	case 4:
        		menuConsultarAlumnos();
        		break;
        		
        	case 5:
        		System.out.println("3. Consultar");
        		break;
        		
        	case 6:
        		System.out.println("3. Consultar");
        		break;
        		
        	case 7:
        		opcion=false;
        		break;

        	default:
        		break;
        }
      }
  }
  static public void menuConsultarNomFacu(){
	  Scanner T=new Scanner(System.in);
      int respuesta=0;
      boolean opcion=true;
      while(opcion){
        System.out.println("La facultas es: Fismat");
        System.out.println("1. Atras");
        System.out.println("-------------------------");
        System.out.print(">>> ");
        respuesta=T.nextInt();
        
        switch(respuesta){
        	case 1:
        		opcion=false;
        		break;

        	default:
        		break;
        }
      }
  }
  static public void menuConsultarAlumnos(){
	  Scanner T=new Scanner(System.in);
	  Scanner S=new Scanner(System.in);
      int respuesta=0;
      boolean opcion=true;
      while(opcion){
        System.out.println("1. Introduzca el nombre del alumno");
        System.out.println("2. Atras");
        System.out.println("-------------------------");
        System.out.print(">>> ");
        respuesta=T.nextInt();
        //no me deja entrar al arreglo me da null
        switch(respuesta){
        	case 1:
        		alumno A=new alumno();
        		System.out.print(">> ");
        		String nombre=S.nextLine();
        		A.importar(nombre);
        		break;

        	default:
        		break;
        }
      }
  }
}
