
public class Estudiante {
    private String nombre;
    private int codigo;
    private String correo;
    private int semestre;

    public Estudiante(String nombre, int codigo, String correo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correo = correo;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    

}
