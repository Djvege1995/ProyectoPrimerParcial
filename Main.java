import Persona.Colaboradores;
import Persona.Estado;
import Persona.Personas;
import Persona.TipoEmpleado;
import Persona.Visitante;
import Persona.Residentes;
import Permisos.Permiso;
import Permisos.EstadoPermiso;

import java.util.Scanner;
import java.util.ArrayList;



public class Main{
  //Creacion de lista 
  static ArrayList<Residentes> lista_Residentes=new ArrayList<>();
  static ArrayList<Colaboradores> lista_Colaboradores=new ArrayList<>();
  static ArrayList<Visitante> lista_Visitante=new ArrayList<>();

  
  public static void inicializarSistema(){
    // residentes
    Residentes r1=new Residentes(Estado.ACTIVO,"0967893451","Maria Fernanda","0987563452","Mfernanda@gmail.com");
    Residentes r2=new Residentes(Estado.INACTIVO,"0938926745","Claudia","0923765486","Clau2000@hotmail.com");
    Residentes r3=new Residentes(Estado.ACTIVO,"0956439873","Arlett","0923211245","Arlett5@gmail.com");
  
  
  //colaboradores
  Colaboradores c1=new Colaboradores("20/07/2019","3/06/2023",TipoEmpleado.JARDINERO,Estado.ACTIVO,"MantenimientoPlantas","0987534256","Pedro","2022945","Pedro28@hotmail.es");
  Colaboradores c2=new
  Colaboradores("4/09/2010","23/09/2018",TipoEmpleado.ADMINISTRADOR,Estado.INACTIVO,"Supervisor","0984564434","Camila","09878765","Cami34@hotmail.es");
  Colaboradores c3=new Colaboradores("20/07/2020","3/06/2025",TipoEmpleado.GUARDIA,Estado.ACTIVO,"Guardia de seguridad","0969986787","Fernando","095678345","ferhernandez@outlook.com");
    Colaboradores c4=new Colaboradores("25/01/2016","12/12/2024",TipoEmpleado.ADMINISTRADOR,Estado.ACTIVO,"contable","0969923456","Ivon","0945223452","IVON45@hotmail.es");


  //visitantes
  
  Visitante v1=new Visitante("0956789305","Jefferson","0987867566","jeff22@hotmail.com","No pertenece a empresa","Sin sancion");
    Visitante v2=new Visitante("0934567856","Wilson","0945687221","Wcsanchez@hotmail.com","Doltrex","Sin sancion");
    //añadimos los objetos a la lista que pertenesca.
    
    lista_Residentes.add(r1);
    

    lista_Colaboradores.add(c1);
    lista_Colaboradores.add(c2);


    lista_Visitante.add(v1);
    lista_Visitante.add(v2);


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
        
        
      }else if (opcion==2){
        Residentes.informacionResidentes(lista_Residentes);
        
        
      }else if (opcion==3){
        Visitante.informacionVisitantes(lista_Visitante);
        
      }else if (opcion==4){
        Colaboradores.informacionEmpleado(lista_Colaboradores);
        
      }else if (opcion==5){
        Permiso nuevoPermiso;
        nuevoPermiso.menu(lista_Residentes,lista_Visitante);
      }else if (opcion==6){
            
      }else if (opcion==7){
            
      }
    }while(opcion!=8);
      
    
        
  }
  

   
    

  public static void main(String[] args) {
    inicializarSistema();
    menuOpciones();
        
  }
}