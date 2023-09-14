
public class Asignatura {
    
    private int codigoAsignatura;
    private String nombreAsignatura;
    private int semestre;
    private int creditos;
    private String horario;

    public Asignatura(int codigoAsignatura, String nombreAsignatura, int semestre, int creditos, String horario) {
        this.codigoAsignatura = codigoAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.semestre = semestre;
        this.creditos = creditos;
        this.horario = horario;
    }

    public int getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(int codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
