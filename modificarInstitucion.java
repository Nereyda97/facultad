import java.util.Scanner;
public class modificarInstitucion {
	Scanner T=new Scanner(System.in);
	public void ModificarInformacion(){
		int respuesta=0;
	      boolean opcion=true;
	      while(opcion){
	        System.out.println("Modificar");
	        System.out.println("1. Informacion Alumno");
	        System.out.println("2. Informacion Maestros");
	        System.out.println("3. Informacion Materias");
	        System.out.println("4. Informacion Cursos");
	        System.out.println("5. Informacion Salones");
	        System.out.println("6. Atras");
	        System.out.println("-------------------------");
	        System.out.print(">>> ");
	        respuesta=T.nextInt();
	        
	        switch(respuesta){
	        	case 1:
	        		
	        		break;

	        	case 2:
	        		
	        		break;

	        	case 3:
	        		
	        		break;
	        		
	        	case 4:
	        		
	        		break;
	        	case 5:
	        		
	        		break;
	        		
	        	case 6:
	        		opcion=false;
	        		break;

	        	default:
	        		break;
	        }
	      }
	}
}
