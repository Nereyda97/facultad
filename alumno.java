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
    public void Imprimir(){
    System.out.println(this.nombre + this.anioIngreso + this.anioEgreso + this.anioDeNacimiento+this.matricula);
    }

//METODO PARA GENERAR MATRICULA comentado
    //private int generaMatricula(){
    //  return (int)(Math.random()*1000000);
    //}
    public void importar(String nombres){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      try {
           archivo = new File ("personas.csv");
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);

           String linea;
           int i=0;
           while((linea=br.readLine())!=null){
             arreglo[i]=new alumno(linea);
             i++;
           }
           for(int j=0;j<37;j++){
       		
       		if(nombres.equals(arreglo[i].nombre)){
       			System.out.println(nombre);
       		}
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
        //for(int i=0;i<36;i++){
          //arreglo[i].Imprimir();
        //}
    }
}//Fin de la clase
