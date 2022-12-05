package Permisos;
import java.util.ArrayList;
import java.util.Scanner;

import Persona.Residentes;
import Persona.Visitante;
import Persona.Colaboradores;




public class Permiso{
  String fecha,mz, hora, fechaIngreso,horaIngreso,ciR,ciV,codigo,observacion,sancion,nombreEmpresa;
    protected Residentes residente;
    protected Visitante visitante;
    protected Colaboradores colaborador;
    int duracion,villa;
    protected EstadoPermiso estado;
  
/*constructor de permisos*/
  public Permiso(String fecha,String hora,String fechaIngreso,String horaIngreso,String observacion,Residentes residente,Visitante visitante,Colaboradores colaborador,String codigo,EstadoPermiso estado,int duracion,String mz,int villa){
    this.fecha=fecha;
    this.hora=hora;
    this.fechaIngreso=fechaIngreso;
    this.horaIngreso=horaIngreso;
    this.observacion=observacion;
    this.residente=residente;
    this.visitante=visitante;
    this.colaborador=colaborador;
    this.codigo=codigo;
    this.estado=estado;
    this.duracion=duracion;
    this.villa=villa;
    this.mz=mz;
    
  }
  /*getters y setters*/
  public void setMz(String mz){
    this.mz=mz;
  }
  public int getVilla(){
      return villa;
  }
  public String getMz(){
      return mz;
  }
  public String observacion(){
    return observacion;
  }
  public void setVilla(int villa){
      this.villa=villa;
  }

  public EstadoPermiso getEstado(){
    return estado;
  }
  public String getFecha(){
    return fecha;
  }
  public String getHora(){
    return hora;
  }
   public String getFechaIngreso(){
    return fechaIngreso;
  }
  public String getHoraIngreso(){
    return horaIngreso;
  }
  public Residentes getResidente(){
    return residente;
  }
  public Visitante getVisitante(){
    return visitante;
  }
  public Colaboradores getColaborador(){
    return colaborador;
  }
  public String getCode(){
    return codigo;
  }
  public int getDuracionVisita(){
    return duracion;
  }
  public void setFecha(String fecha){
    this.fecha=fecha;
  }
  public void setHora(String hora){
    this.hora=hora;
  }
   public void setFechaIngreso(String fechaIngreso){
    this.fechaIngreso=fechaIngreso;
  }
  public void setHoraIngreso(String horaIngreso ){
    this.horaIngreso=horaIngreso;
  }
  public void setObservacion(String observacion){
    this.observacion=observacion;
  }
  public void setResidente(Residentes residente){
    this.residente=residente;
  }
  public void setVisitante(Visitante visitante){
    this.visitante=visitante;
  }
  public void setcolaborador(Colaboradores colaborador){
    this.colaborador=colaborador;
  }
  public void setCode(String codigo){
    this.codigo=codigo;
  }
  public void setEstado(EstadoPermiso estado){
    this.estado=estado;
  }
  public void setDuracionVisita(int duracion){
    this.duracion=duracion;
  }
  @Override
  public String toString(){/*Definimos el toString para nuestra clase*/
    return "Nombre del residente:"+residente.getNombre()+"Nombre del visitante:"+visitante.getNombre()+"Cédula del visitante:"+visitante.getCedula()+"Código del permiso:"+codigo+"Fecha de creación del permiso:"+fecha+"Hora de creación del permiso"+hora+"Fecha de la visita:"+fechaIngreso+"Hora de la visita"+horaIngreso;
  }
  /* Menu de permisos*/
  public static void modificarPermiso(ArrayList<Permiso>lista_permisos, ArrayList<Residentes>lista_residentes,Colaboradores colaborador){
    Scanner opcion =new Scanner(System.in);
      System.out.println("1. Agregar permiso");
      System.out.println("2. Eliminar permiso");
      System.out.println("3. Consultar permiso");
        System.out.println("4. Salir");
      System.out.println("Cual es su opcion: ");
      int op=opcion.nextInt();
      opcion.nextLine();
          //Agregando un permiso   
    /*Se registra la fecha y hora de creación del permiso, se registrará al residente que aprueba y
crea el permiso, persona(visitante) que va a ingresar, fecha que va a ingresar, hora que va a
ingresar (dar un rango de 15 minutos antes y después), duración aproximada de visita,
creación de código único.*/ 
      if(op==1){
        System.out.println("Ingrese la fecha de creación de permiso:");
        String nuevaFecha=opcion.nextLine();
        System.out.println("Ingrese la hora de creación del permiso:");
        String nuevaHora=opcion.nextLine();
        System.out.println("Ingrese la fecha de la visita:");
        String fechaVisita=opcion.nextLine();
        System.out.println("Ingrese la hora de la visita:");
        String horaVisita=opcion.nextLine();
        System.out.println("Ingrese nombre del residente anfitrión: ");
        String nombreResidente=opcion.nextLine();
        System.out.println("Ingrese nombre del visitante: ");
        String nombreVisita=opcion.nextLine();
        System.out.println("Ingrese la cédula del visitante:");
        String nuevaCiVisitante=opcion.nextLine();
        System.out.println("Ingrese el número de teléfono del visitante:");
        String telefonoVisita=opcion.nextLine();
        System.out.println("Ingrese el correo electrónico del visitante:");
        String nuevoCorreo=opcion.nextLine();
        System.out.println("¿Es repartidor[true/false]:");
        boolean yesOrNo=opcion.nextBoolean();
        String nombreEmpresa=new String();
        if(yesOrNo==false){
          nombreEmpresa="No es repartidor";
        }
        while(yesOrNo==true){
          System.out.println("Ingrese el nombre de la empresa:");
          nombreEmpresa=opcion.nextLine();
          
        }  
        System.out.println("¿Tiene sanciones[true/false]:");
        boolean siOrNo=opcion.nextBoolean();
        String sancion;
        if(siOrNo==true){
          
          sancion="Tiene sanción";
          
        }else{
          sancion="No tiene sanción";
        }  
        Visitante nuevaVisita=new Visitante(nuevaCiVisitante,nombreVisita,telefonoVisita,nuevoCorreo,nombreEmpresa,sancion);/*creacion de nuevo visitante en el registro*Visitante (String cedula, String nombre, String telefono, String email,String empresa,String historial)*/
        System.out.println("Ingrese el tiempo que estará la visita:");
        int tiempoDeEstadia=opcion.nextInt();
        String nuevoCodigo=nombreResidente+nuevaCiVisitante;
        String obs="No hay observación por el momento";
        
        
        for(Residentes r:lista_residentes){
          do{
            /*Permiso(String fecha,String hora,String fechaIngreso,String horaIngreso,Residentes residente,Visitante visitante,String codigo,EstadoPermiso estado,int duracion,String mz,int villa){*/
            Permiso nuevoPermiso=new Permiso(nuevaFecha,nuevaHora,fechaVisita,horaVisita,obs,r,nuevaVisita,colaborador,nuevoCodigo,EstadoPermiso.ACTIVO,tiempoDeEstadia,r.getMz(),r.getVilla());/*creación del nuevo elemento de la lista de permisos*/
            
          lista_permisos.add(nuevoPermiso);
          }while(r.getNombre().equals(nombreResidente));
            
          
        }
        
        
          /*Eliminar un permiso*/
        
      }else if(op==2){
        System.out.println("Que permiso desea eliminar ");
          for(Permiso p:lista_permisos){
              if(p.getEstado().equals(EstadoPermiso.ACTIVO)){
                String code=p.getCode();
              System.out.println("Resgistro:"+code);
              }
          }
          System.out.println("ingreselo: ");
          String permisoSeleccionado=opcion.nextLine();
          for(Permiso pp:lista_permisos){
            if(pp.getCode().equals(permisoSeleccionado)){
              pp.setEstado(EstadoPermiso.INACTIVO);
            }
          }
      }
      else{/*Buscar permisos por manzana y villa*/
        System.out.println("Ingrese la manzana:");
        String manzana=opcion.nextLine();
        System.out.println("Ingrese la villa:");
        int casa=opcion.nextInt();
        for(Permiso permiso:lista_permisos){
          if(permiso.getMz().equals(manzana)&&permiso.getVilla()==(casa)){
            permiso.toString();/*Imprime la información del permiso buscado*/
          }else{
            System.out.println("No se encuentra el permiso buscado.");
          }
        }
        
      }
  }
}

