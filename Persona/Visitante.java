package Persona;
import java.util.ArrayList;
import java.util.Scanner;
public class Visitante extends Personas{
  String historial, empresa;
  public Visitante (String cedula, String nombre, String telefono, String email,String empresa,String historial){
    super(cedula, nombre, telefono, email);
    this.empresa=empresa;
    this.historial=historial;
    
  }
  public String getHistorial(){
    return historial;
  
  }
  public String getEmpresa(){
    return empresa;
  }
  public void setHistorial(String historial){
    this.historial=historial;
  }
  public void setEmpresa(String empresa){
    this.empresa=empresa;
  }
  //creacion de menu para visitantes.
  public static void informacionVisitantes(ArrayList<Visitante> lista_Visitantes){
     Scanner opcion=new Scanner(System.in);
     System.out.println("Informacion visitante");
     System.out.println("1.Agregar visitante");
     System.out.println("2.Editar visitante");
     int op=opcion.nextLine();
     for(Visitante v:lista_Visitantes){
       System.out.println(v.getCedula());   
      }
     if(op==1){
      System.out.println("Ingrese la informacion.- ");
      System.out.println("ingrese la cedula del visitante: ");
      String nuevaCedula = opcion.nextLine();
      System.out.println("ingrese el nombre del visitante: ");
      String nuevoNombre= opcion.nextLine();
      System.out.println("ingrese el telefono del visitante: ");
      String nuevoTelefono= opcion.nextLine();
      System.out.println("ingrese el email del visitante: ");
      String nuevoEmail= opcion.nextLine();
      System.out.println("¿Es un repartidor?");
      String repartidor=opcion.nextLine();
       if(repartidor.equals("Si")){
         System.out.println("Ingrese el nombre de la empresa donde trabaja");
         String nomEmpresa=opcion.nextLine();
        
       }else(repartidor.equals("No")){
         System.out.println("No es repartidor");
       }
      System.out.println("ingrese el historial del visitante: ");
      String historial= opcion.nextLine();
     if(op==2){
       System.out.println("Editar");
       for(Visitante v:lista_Visitantes){
         System.out.println(v.getCedula());
       }
       System.out.println("Ingrese la cedula del visitante: ");
       String visitanteteEscogido=opcion.nextLine();
       boolean confirmacion=false;
       Residentes visitante_modificado=null;
       for(Visitante r:lista_Visitantes){
         if(r.getCedula().equals(visitanteEscogido)){
           confirmacion=true;
           visitante_modificado=v;
         }
                     
       }
       if(!confirmacion){
         System.out.println("No se encontro el visitante.");
         return;
       }
     }

  // Modulacion para modificar visitante  y ahorrar lineas de codigo     
  public static void informacionVisitantes(Visitante v){
    Scanner opcion=new Scanner(System.in);
       System.out.println("ingrese el nuevo nombre del visitante: ");
       String nuevoVisitante= opcion.nextLine();
       v.setNombre(nuevoResidente);
       System.out.println("ingrese el nuevo telefono del visitante: ");
       String nuevoTelefono= opcion.nextLine();
       v.setTelefono(nuevoTelefono);
       System.out.println("ingrese el nuevo email del cliente");
       String nuevoEmail= opcion.nextLine();
       v.setEmail(nuevoEmail);
  }
  
}