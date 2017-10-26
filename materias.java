import java.io.*;
class materias{
  String nombre, clave;
  int area;//O,COMPU;1,MATEMATICAS;2,FISICA;3,OTRO
  int creditos,horasSemana;
  static int numeroMaterias=0;
  static materias[] arreglos=new arreglo
  materias(){

  }

  materias(String linea){
    String Temporal[]=linea.split(",");
    this.nombre=Temporal[0];
    this.clave=Temporal[1];
    this.horasSemana=Integer.parseInt(Temporal[2]);
    this.creditos=Integer.parseInt(Temporal[3]);
  }

  public void Imprimir(){
    System.out.println(this.nombre + this.clave + this.horasSemana + this.creditos);
  }

  public void importar(){
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    materias[] arreglo=new materias[59];
    try {
         archivo = new File ("materiasFacultad1.csv");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         String linea;
         int i=0;
         while((linea=br.readLine())!=null){

           arreglo[i]=new materias(linea);
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
      for(int i=0;i<59;i++){
        arreglo[i].Imprimir();
      }
  }
}
