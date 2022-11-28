package Persona;
class Residentes extends Personas{
  String estado,mz;
  int villa,cantidadPersonas;
  public residente(String ci,String nombre,String mail,String telefono,String estado,String mz,int villa,int cantidadPersonas){
    super(ci,nombre,mail,telefono);
    this.estado=estado;
    this.mz=mz;
    this.villa=villa;
    this.cantidadPersonas=cantidadPersonas;
  }
  
}