class colaborador extends personas{
  String puesto;
  tipoEmpleado tipo;
  public colaborador(String ci,String nombre,String mail,String telefono,String puesto,tipoEmpleado tipo){
    super(ci,nombre,mail,telefono);
    this.puesto=puesto;
    this.tipo=tipo;
    
  }
  public String getPuesto(){
    return puesto;
  }
  public String getCedula(){
    return ci;
  }
  public String getNombre(){
    return nombre;
  }
  public String getPuesto(){
    return puesto;
  }
  public String getMail(){
    return mail;
  }
  public String getTelefono(){
    return telefono;
  }
  public tipoEmpleado getTipo(){
    return tipoEmpleado;
  }
  public void mostrarInfo(){
    System.out.printl("Nombre:"+nombre+"\nCédula:"+c)
  }
}