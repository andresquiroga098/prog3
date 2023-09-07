
package arreglos;
import static arreglos.operaciones.burbuja;
import static arreglos.operaciones.imprimir;
import static arreglos.operaciones.insercion;
import static arreglos.operaciones.leerInt;
import static arreglos.operaciones.mergeSort;
import static arreglos.operaciones.rellenar;
import static arreglos.operaciones.seleccion;
import java.io.IOException;
import java.util.Scanner;

public class Arreglos {
    static Scanner in= new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       int s=1, a=0;
       do{
           int op=0;
           System.out.println("\nIngrese la longitud del arreglo: ");  a=leerInt(a);
           double []arreglo= new double[a];
           arreglo= rellenar(arreglo);
           imprimir(arreglo);
           
           System.out.println("\n\n\tMetodos de ordenamiento\n");
           System.out.println("1. Burbuja\n2. Insercion\n3. Seleccion\n"
                   + "4. MergeSort\n5. Salir");   
           
           op=leerInt(op);
           switch(op){
               case 1 -> {
                    arreglo=burbuja(arreglo);
                    imprimir(arreglo);
                }
               case 2 -> {
                   arreglo=insercion(arreglo);
                   imprimir(arreglo);
               }
               case 3 -> {
                   arreglo=seleccion(arreglo);
                   imprimir(arreglo);
               }
               case 4 -> {
                   arreglo=mergeSort(arreglo);
                   imprimir(arreglo);
               }
               case 5 ->  {
                   s=0;
               }
           }
            if(s==0){
                break;
            }else{
                System.in.read();
                System.out.print("\nDesea continuar?\n1.SI\n0.NO"); 
                s=leerInt(s);
            }
            
        }while(s!=0);
    }
    
}
