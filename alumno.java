import java.io.*;

public class alumno {
    static int numeroAlumnos=0;
    String nombre;
    int matricula, creditos, anioIngreso, anioEgreso,anioDeNacimiento, materiasCursadas;
    double promedio, sumaCalificaciones;
    static alumno[] arreglo=new alumno[38];

//CONSTRUCTOR RECIBE ARCHIVO DE TEXTO
    alumno(){

    }
    alumno(String linea){
      String Temporal[]=linea.split(",");
      this.nombre=Temporal[1];
      this.anioIngreso=Integer.parseInt(Temporal[2]);
      this.anioEgreso=Integer.parseInt(Temporal[3]);
      this.anioDeNacimiento=Integer.parseInt(Temporal[4]);
      this.matricula=Integer.parseInt(Temporal[5]);
    }
    public void imprimir(){
    System.out.println(this.nombre + this.anioIngreso + this.anioEgreso + this.anioDeNacimiento+this.matricula);
    }

//METODO PARA GENERAR MATRICULA comentado
    //private int generaMatricula(){
    //  return (int)(Math.random()*1000000);
    //}
    public void importar(String nombreArchivos){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
           archivo = new File (nombreArchivos);
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);

           String linea;
           int i=0;
           while((linea=br.readLine())!=null){
             arreglo[i]=new alumno(linea);
             i++;
           }

       	}

        catch(Exception e){
           e.printStackTrace();
        }finally{
           try{
              if( null != fr ){
                 fr.close();
              }
           }catch (Exception e2){
              e2.printStackTrace();
           }
    }
  }
    public void buscar(String nombre){
      if(arreglo.length==0){
        System.out.println("Nesecitas crear o importar alumnos. ");
      }else{
        for(int i=0;i<arreglo.length;i++){
          if(nombre==arreglo[i].nombre){
            System.out.println(arreglo[i].nombre);
          }
        }
      }
  }
}//Fin de la clase
