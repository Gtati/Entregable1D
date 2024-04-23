package Repaso;



public class Paciente {
    private int cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
    private String fechaNacimiento;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Paciente(){

    }
    public Paciente(int cedulaPaciente){
        this.cedula = cedulaPaciente;
    }
    public Paciente(int cedulaPaciente, String nombrePaciente, String apellidoPaciente){
        this.cedula = cedulaPaciente;
        this.nombre = nombrePaciente;
        this.apellido = apellidoPaciente;
    }
    public Paciente(int cedulaPaciente, String nombrePaciente, String apellidoPaciente, String correoPaciente, String celularPaciente, String fechaNacimientoPaciente){
        this.cedula = cedulaPaciente;
        this.nombre = nombrePaciente;
        this.apellido = apellidoPaciente;
        this.correo = correoPaciente;
        this.celular = celularPaciente;
        this.fechaNacimiento = fechaNacimientoPaciente;
    }

    public static void main(String[] args) {
        Paciente Diana = new Paciente();
        Paciente Jeovany = new Paciente(123489);
        Paciente Nicol = new Paciente(23456781, "Jeovany", "Gutierrez");
        Paciente Juan = new Paciente(123478955, "Juan", "Gonzales", "juango@gmail.com", "3225678543", "23/01/2000");


    }

    @Override
    public String toString() {
        return "Paciente{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", celular='" + celular + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}

