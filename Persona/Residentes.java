package Persona;
import Persona.Personas;
import java.util.ArrayList;
import java.util.Scanner;

public class Residentes extends Personas{
    private Estado estado;

    public Residentes(Estado estado, String cédula, String nombre, String teléfono, String email) {
        super(cédula, nombre, teléfono, email);
        this.estado = estado;
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
        
        }if(op==2){
            System.out.println("Ingrese la informacion.- ");
            System.out.println("ingrese la cedula del residente: ");
            String nuevaCedula = opcion.nextLine();
            System.out.println("ingrese el nombre del residente: ");
            String nuevoNombre= opcion.nextLine();
            System.out.println("ingrese el telefono del cliente: ");
            String nuevoTelefono= opcion.nextLine();
            System.out.println("ingrese el email del cliente: ");
            String nuevoEmail= opcion.nextLine();
        }
    }
}
