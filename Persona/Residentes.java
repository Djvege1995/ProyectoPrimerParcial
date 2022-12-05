package Persona;
import Persona.Personas;
import java.util.ArrayList;
import java.util.Scanner;
import Permisos.Permiso;

public class Residentes extends Personas{
    private Estado estado;
    public String mz;
    public int villa;
    public ArrayList<Permiso> lista_permisos;

    public Residentes(Estado estado, String cedula, String nombre, String telefono, String email,String mz,int villa, ArrayList<Permiso> lista_permisos) {
        super(cedula, nombre, telefono, email);
        this.estado = estado;
        this.lista_permisos=lista_permisos;
        this.mz=mz;
        this.villa=villa;
    }
    public ArrayList<Permiso> getListaPermisos(){
      return lista_permisos;
    }
    public void setListaPermisos(ArrayList<Permiso> lista_permisos){
      this.lista_permisos=lista_permisos;
    }
    public String getMz(){
      return mz;
    }
    public void setMz(String mz){
      this.mz=mz;
    }
    public int getVilla(){
      return villa;
    }
    public void setVilla(int villa){
      this.villa=villa;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public static void informacionResidentes(ArrayList<Residentes> lista_Residentes){
        Scanner opcion=new Scanner(System.in);
        System.out.println("Informacion residentes");
        System.out.println("1. Mostrar residentes");
        System.out.println("2. Agregar residentes");
        System.out.println("3. Editar informacion");
        System.out.println("4. Eliminar residente");
        System.out.println("ingrese una opcion");
        int op=opcion.nextInt();
        if(op==1){
            for(Residentes r:lista_Residentes){
                System.out.println(r);
            }
        
        }
        if(op==2){
            System.out.println("Ingrese la informacion.- ");
            System.out.println("ingrese la cedula del residente: ");
            String nuevaCedula = opcion.nextLine();
            System.out.println("ingrese el nombre del residente: ");
            String nuevoNombre= opcion.nextLine();
            System.out.println("ingrese el telefono del residente: ");
            String nuevoTelefono= opcion.nextLine();
            System.out.println("Ingrese la manzana del residente: ");
            String nuevaMz=opcion.nextLine();
            System.out.println("Ingrese la villa del residente: ");
            int nuevaVilla=opcion.nextInt();
            System.out.println("ingrese el email del residente: ");
            String nuevoEmail= opcion.nextLine();
            System.out.println("ingrese el estado del residente: ");
            String nTipo= opcion.nextLine();
            ArrayList <Permiso> lista_permisos=new ArrayList<Permiso>();
          if(nTipo.equals("ACTIVO")){
              lista_Residentes.add(new Residentes(Estado.ACTIVO,nuevaCedula,nuevoNombre,nuevoTelefono,nuevoEmail,nuevaMz,nuevaVilla,lista_permisos));
          }
          if(nTipo.equals("INACTIVO")){
            lista_Residentes.add(new Residentes(Estado.INACTIVO,nuevaCedula,nuevoNombre,nuevoTelefono,nuevoEmail,,nuevaMz,nuevaVilla,lista_permisos));
          }
                    
                    
        }
        if(op==3){
          System.out.println("Editar");
          for(Residentes r:lista_Residentes){
            System.out.println(r.getCedula());
          
            
          }
          System.out.println("Ingrese la cedula del residente: ");
          String residenteEscogido=opcion.nextLine();
          boolean confirmacion=false;
          Residentes residente_modificado=null;
          for(Residentes r:lista_Residentes){
            if(r.getCedula().equals(residenteEscogido)){
              confirmacion=true;
              residente_modificado=r;
            }
                     
          }
          if(!confirmacion){
            System.out.println("No se encontro el residente.");
            return;
          }
          informacionResidentes(residente_modificado);
        } 
        if(op==4){
            System.out.println("Ingrese la cedula del residente: ");
            String cedulaResidente=opcion.nextLine();
            boolean confir=false;
            Residentes residentes=null;
            System.out.println("Eliminar un residente de la urbanizacion");
            for(Residentes r:lista_Residentes){
                System.out.println(r.getCedula());
            }
            for(Residentes r:lista_Residentes){
                if(r.getCedula().equals(cedulaResidente)){
                    confir=true;
                    residentes=r;
                }
            }
            if(!confir){
            System.out.println("No se encontro el residente.");
            return;
            }
            eliminarResidente(lista_Residentes,residentes);
           
        }
    }
    public static void informacionResidentes(Residentes r){
      Scanner opcion=new Scanner(System.in);
      System.out.println("ingrese el nuevo nombre del residente: ");
              String nuevoResidente= opcion.nextLine();
              r.setNombre(nuevoResidente);
              System.out.println("ingrese el nuevo telefono del residente: ");
              String nuevoTelefono= opcion.nextLine();
              r.setTelefono(nuevoTelefono);
              System.out.println("ingrese el nuevo email del cliente");
              String nuevoEmail= opcion.nextLine();
              r.setEmail(nuevoEmail);
    }
    
    
    
    public static void eliminarResidente(ArrayList<Residentes> lista_Residentes,Residentes residente){
      for(Residentes r:lista_Residentes){
        if(r.getCedula().equals(residente.getCedula())){
          r.setEstado(Estado.INACTIVO);
        }
      }
    }


  
}

      
