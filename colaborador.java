class colaborador extends personas{
  String puesto;
  tipoEmpleado tipo;
  public colaborador(String ci,String nombre,String mail,String telefono,String puesto,tipoEmpleado tipo){
    super(ci,nombre,mail,telefono);
    this.puesto=puesto;
    this.tipo=tipo;
    
  }
  
}