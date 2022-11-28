import Persona.Colaboradores;
import Persona.Estado;
import Persona.Personas;
import Persona.TipoEmpleado;
import Persona.Visitante;
import Permisos.Permiso;
import Permisos.EstadoPermiso;

import java.util.Scanner;

public class Main{
  public static void menu(){
     Scanner sc=new Scanner(System.in);
    System.out.println("1. Urbanizacion");
    System.out.println("2. Residentes");
    System.out.println("3. Visitantes");
    System.out.println("4. Colaboradores de la urbanizacion");
    System.out.println("5. Permisos de entrada");
    System.out.println("6. Revision de entrada");
    System.out.println("7. Reportes");
    System.out.println("8. Salir");
        
    System.out.println("Ingrese una opcion: ");
    int opcion= sc.nextInt();
    if (opcion==1){
            
    }else if (opcion==2){
            
    }else if (opcion==3){
            
    }else if (opcion==4){
            
    }else if (opcion==5){
      Permiso nuevoPermiso;
      nuevoPermiso.menu();
        
      
    }else if (opcion==6){
            
    }else if (opcion==7){
            
    }else if (opcion==8){
            
    }else{
      
    }
    
        
  }
  
}
   
    

  public static void main(String[] args) {
        
  }
}