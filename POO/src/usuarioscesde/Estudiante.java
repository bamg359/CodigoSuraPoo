package usuarioscesde;

public class Estudiante extends Usuario{


    //Atributos
    private String carrera;


    // Constructores
    public Estudiante(){

    }

    public Estudiante(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono, String carrera) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono);
        this.carrera = carrera;
    }

    //Getter and Setter


    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Metodos


}
