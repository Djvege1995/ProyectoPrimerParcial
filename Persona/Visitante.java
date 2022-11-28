package Persona;
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
  
  
}