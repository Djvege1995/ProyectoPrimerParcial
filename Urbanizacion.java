import Persona.Colaboradores;
import Persona.TipoEmpleado;
import java.util.ArrayList;
import java.util.Scanner;

public class Urbanizacion {
  private String nombre,etapa, emailAdministrador,direccion,constructora;
  private Colaboradores personaResponsable;
  public Urbanizacion(String nombre, String etapa, String emailAdministrador, String direccion, String constructora, Colaboradores personaResponsable) {
    this.nombre = nombre;
    this.etapa = etapa;
    this.emailAdministrador = emailAdministrador;
    this.direccion = direccion;
    this.constructora = constructora;
    this.personaResponsable = personaResponsable;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEtapa() {
        return etapa;
  }

  public void setEtapa(String etapa) {
        this.etapa = etapa;
  }

  public String getEmailAdministrador() {
        return emailAdministrador;
  }

  public void setEmailAdministrador(String emailAdministrador) {
        this.emailAdministrador = emailAdministrador;
  }

  public String getDireccion() {
        return direccion;
  }

  public void setDireccion(String direccion) {
        this.direccion = direccion;
  }

  public String getConstructora() {
        return constructora;
  }

  public void setConstructora(String constructora) {
        this.constructora = constructora;
  }

  public Colaboradores getPersonaResponsable() {
        return personaResponsable;
  }

  public void setPersonaResponsable(Colaboradores personaResponsable) {
        this.personaResponsable = personaResponsable;
  }
   
  public static void informacionUrbanicacion(ArrayList<Urbanizacion> lista_urbanizacion,ArrayList<Colaboradores> lista_colaboradores){
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu Urbanizacion");
        System.out.println("1. Mostrar informacion");
        System.out.println("2. Editar informacion");
        System.out.println("ingrese una opcion");
        int op=sc.nextInt();
        
        if(op==1){
            for(Urbanizacion u:lista_urbanizacion){
                System.out.println(u);
            }        
        }if(op==2){
           System.out.println("Administradores Registrados");
           for(Colaboradores c:lista_colaboradores){
            if(c.getTipoEmpleado().equals(TipoEmpleado.ADMINISTRADOR)){
                System.out.println(c.getCedula());}
           }
           System.out.println("Seleccione su nuevo administrador");
           String elegido=sc.nextLine();
           boolean confirmacion=false;
           Urbanizacion urbmod=null;
           for(Urbanizacion u:lista_urbanizacion){
               if(u.getPersonaResponsable().getCedula().equals(elegido)){
                   confirmacion=true;
                   urbmod=u;
               
               }
           }
               
           
           
           
   
        if(!confirmacion){
                System.out.println("No se encontro administrador");
                return;
            }
               
        modificador(urbmod);   
        
          
       }
    } 
    
    public static void modificador(Urbanizacion u){
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Ingrese el nuevo nombre: ");
        String nuevoNombre= sc.nextLine();
        u.setNombre(nuevoNombre);
        System.out.println("Ingrese la nueva etapa: ");
        String nuevaEtapa= sc.nextLine();
        u.setEtapa(nuevaEtapa);
        System.out.println("Ingrese la nueva emailAdministrador: ");
        String nuevoEmailAdministrador= sc.nextLine();
        u.setEmailAdministrador(nuevoEmailAdministrador);
        System.out.println("Ingrese nueva direccion: ");
        String nuevaDireccion=sc.nextLine();
        u.setDireccion(nuevaDireccion);
        System.out.println("Ingrese nueva constructora: ");
        String nuevaConstructora=sc.nextLine();
        u.setConstructora(nuevaConstructora);
        sc.close();
    }
        
        
      
        
        
        
        
}
    
    
   
   