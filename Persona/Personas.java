public class Personas {
    private String cédula, nombre, teléfono, email;

    public Personas(String cédula, String nombre, String teléfono, String email) {
        this.cédula = cédula;
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.email = email;
    }

    public String getCédula() {
        return cédula;
    }

    public void setCédula(String cédula) {
        this.cédula = cédula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "cedula=" + cédula + ", nombre=" + nombre + ", telefono=" + teléfono + ", email=" + email;
    }
    


}