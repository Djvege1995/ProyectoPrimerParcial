
package Permisos;
import Persona.Personas;
import Persona.Residentes;
import Persona.Visitante;
public class Permiso{
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
  public void menuPermisos(){
    System.out.println("1.Crear permiso de entrada \n2. Eliminar permiso \n3.Consultar permisos por manzana y villa");
  }
}