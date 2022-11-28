
package Permisos;
import java.util.Scanner;
import Persona.Personas;
import Persona.Residentes;
import Persona.Visitante;
import java.util.ArrayList;
public class Permiso{
  Scanner sc=new Scanner(System.in);
  String fecha, hora, fechaIngreso,horaIngreso;
  protected Residentes residente;
  protected Visitante visitante;
  int duracion;
  String sanción=visitante.getHistorial();
  public Permiso(String fecha,String hora,String fechaIngreso,String horaIngreso,Residentes residente,Visitante visitante){
    this.fecha=fecha;
    this.hora=hora;
    this.fechaIngreso=fechaIngreso;
    this.horaIngreso=horaIngreso;
    this.residente=residente;
    this.visitante=visitante;
    
  }
  public void menu(ArrayList<Residentes> lista_Residentes,ArrayList<Visitante> Lista_visitantes){
    int op=0;
  
    do{    
      System.out.println("1.Crear permiso de entrada \n2. Eliminar permiso \n3.Consultar permisos por manzana y villa\n4. Salir");
    System.out.println("Ingrese una opcion: ");
      
      
      op=sc.nextInt();
      if (op==1){
          System.out.println("Ingrese la fecha:");
        fecha=sc.nextLine();
        System.out.println("Ingrese la hora:");
        hora=sc.nextLine();
        System.out.println("Ingrese la fecha del ingreso:");
        fechaIngreso=sc.nextLine();
        System.out.println("Ingrese la hora del ingreso:");
        horaIngreso=sc.nextLine();
        System.out.println("Ingrese la duración de la visita:");
        duracion=sc.nextInt();
        System
        
        
              
      }else if (op==2){
            
      }else if (op==3){
        
      }
    }while(op!=4);

  }
}