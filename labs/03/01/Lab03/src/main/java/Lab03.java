
import java.util.LinkedList;
import java.util.Queue;


public class Lab03 {

    static Queue<Registro> regis= new LinkedList<>();

    public static void main(String[] args) {
        registro_estudiante();
        registro_asignatura();
        reporte_registro_final();
    }
    
    private static void registro_estudiante() {
        int codigo= Entrada.leerInt("Codigo estudiante: ");
        String nombre= Entrada.leerTexto("Nombre estudiante: ");
        String correo= Entrada.leerTexto("Correo estudiante: ");
        int semestre= Entrada.leerInt("Semestre: ");
        
        Estudiante est= new Estudiante(nombre,codigo,correo,semestre);
        //crear registro con el codigo del estudiante(por ahora);
        //agregar asignaturas 
        regis.add(new Registro(est));
    }
    
    private static void registro_asignatura() {

    }

    private static void reporte_registro_final() {
        
    }    
}
