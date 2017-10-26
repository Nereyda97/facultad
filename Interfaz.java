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
    }
    switch(respuesta){
      case 1:
      System.out.println("1. Crear");
      break;

      case 2:
      System.out.println("2. Modificar");
      break;

      case 3:
      System.out.println("3. Consultar");
      break;

      case 4:
      opcion=false;
      break;

      default:
      break;
    }
  }
}
