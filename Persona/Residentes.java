package Persona;
import Persona.Personas;
import java.util.ArrayList;
import java.util.Scanner;

public class Residentes extends Personas{
    private Estado estado;

    public Residentes(Estado estado, String cedula, String nombre, String telefono, String email) {
        super(cedula, nombre, telefono, email);
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public static void informacionResidentes(ArrayList<Residentes> lista_Residentes){
        Scanner opcion=new Scanner(System.in);
        System.out.println("Informacion residentes");
        System.out.println("1. Mostrar residentes");
        System.out.println("2. Agregar residentes");
        System.out.println("3. Editar informacion");
        System.out.println("4. Eliminar residente");
        System.out.println("ingrese una opcion");
        int op=opcion.nextInt();
        if(op==1){
            for(Residentes r:lista_Residentes){
                System.out.println(r);
            }
        
        }if(op==2){
            System.out.println("Ingrese la informacion.- ");
            System.out.println("Ingrese la cedula del residente: ");
            String nuevaCedula = opcion.nextLine();
            System.out.println("Ingrese el nombre del residente: ");
            String nuevoNombre= opcion.nextLine();
            System.out.println("Ingrese el telefono del residente: ");
            String nuevoTelefono= opcion.nextLine();
            System.out.println("Ingrese el email del residente: ");
            String nuevoEmail= opcion.nextLine();
        }if(op==3){
          System.out.println("Editar");
          for(Residentes r:lista_Residentes){
            System.out.println(r.getCedula());
          
            
          }
          System.out.println("Ingrese la informacion");
          String residenteEscogido=opcion.nextLine();
          boolean confirmacion=false;
          Residentes residente_modificado=null;
          for(Residentes r:lista_Residentes){
            if(r.getCedula().equals(residenteEscogido)){
              confirmacion=true;
              residenteEscogido = r;
            }
                     
          }
          if(!confirmacion){
            System.out.println("No se encontro el cliente.");
            return;
          }
          informacionResidentes(residenteEscogido);
        } 
    }



  
}
