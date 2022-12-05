import Persona.Colaboradores;
import Persona.Estado;
import Persona.Personas;
import Persona.TipoEmpleado;
import Persona.Visitante;
import Persona.Residentes;
import Permisos.Permiso;


import java.util.Scanner;
import java.util.ArrayList;


public class Main {

  //Creacion de lista 
  static ArrayList<Residentes> lista_Residentes=new ArrayList<>();
  static ArrayList<Colaboradores> lista_colaboradores=new ArrayList<>();
  static ArrayList<Visitante> lista_Visitante=new ArrayList<>();
  static ArrayList<Permiso> lista_permiso=new ArrayList<>();
  static ArrayList<Urbanizacion> lista_urbanizacion=new ArrayList<>();
  static ArrayList<Permiso> lista_Permisos=new ArrayList<>();
  static ArrayList<Personas> lista_Persona = new ArrayList<>();
  static ArrayList<Revision> lista_Actual = new ArrayList<>();


  
  public static void inicializarSistema(){
    // residentes
    Residentes r1=new Residentes("0956778807","Maria Fernanda","0987563452","Mfernanda@gmail.com","206","8",Estado.ACTIVO);
    //colaboradores
    Colaboradores c1=new Colaboradores("20/07/2019","3/06/2023",TipoEmpleado.GUARDIA,Estado.ACTIVO,"MantenimientoPlantas","0987534256","Pedro","2022945","Pedro28@hotmail.es");

    Colaboradores c2=new Colaboradores("20/07/2020","3/06/2025",TipoEmpleado.GUARDIA,Estado.ACTIVO,"Guardia de seguridad","0969986787","Fernando","095678345","ferhernandez@outlook.com");
    
    //visitantes
  
    Visitante v1=new Visitante("0956789305","Jefferson","0987867566","jeff22@hotmail.com","No pertenece a empresa","Sin sancion");
    Visitante v2=new Visitante("0934567856","Wilson","0945687221","Wcsanchez@hotmail.com","Doltrex","Sin sancion");
    //añadimos los objetos a la lista que pertenesca.
    
    lista_Residentes.add(r1);
    

    lista_colaboradores.add(c1);
    lista_colaboradores.add(c2);


    lista_Visitante.add(v1);
    lista_Visitante.add(v2);


  }
  
    public static ArrayList<Personas> getLista_persona(){
    return lista_Persona;
    }





 //Creamos el menu para la visualizacion del usuario.
  
  public static void menuOpciones(){
    int opcion=0;
    do{
      Scanner opcion_menu=new Scanner(System.in);
      System.out.println("1. Urbanizacion");
      System.out.println("2. Residentes");
      System.out.println("3. Visitantes");
      System.out.println("4. Colaboradores de la urbanizacion");
      System.out.println("5. Permisos de entrada");
      System.out.println("6. Revision de entrada");
      System.out.println("7. Reportes");
      System.out.println("8. Salir");
      
      //Ingreso para la opcion del usuario
      System.out.println("Ingrese una opcion: ");
      opcion= opcion_menu.nextInt();
      if (opcion==1){
        Urbanizacion.informacionUrbanicacion(lista_urbanizacion, lista_colaboradores);

      }else if (opcion==2){
        Residentes.informacionResidentes(lista_Residentes);
        
        
      }else if (opcion==3){
        Visitante.informacionVisitantes(lista_Visitante);
        
      }else if (opcion==4){
        Colaboradores.informacionEmpleado(lista_colaboradores);
        
      }else if (opcion==5){
          Permiso.modificarPermiso(lista_Permisos,lista_Visitante,lista_Residentes);

      }else if (opcion==6){
        verificarvisitante(lista_Visitante,lista_Permisos, lista_Actual);
            
      }else if (opcion==7){
            
      }
    }while(opcion!=8);
      
    
        
  }
  

   
    

  public static void main(String[] args) {
    inicializarSistema();
    menuOpciones();
        
  }
}
    