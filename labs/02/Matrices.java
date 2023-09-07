
package matrices;

import static matrices.operaciones.crearMatriz;
import static matrices.operaciones.imprimir;
import static matrices.operaciones.tamaño;
import static matrices.operaciones.sumaMatriz;
import java.io.IOException;
import java.util.Scanner;

public class Matrices {

    static Scanner in= new Scanner(System.in);
     public static void main(String[] args) throws IOException {
       
       int op;
       
        System.out.println("\n\t\tMenu deoperaciones\n");
        System.out.println("1. Suma\n2. Producto\n3.Producto por escalar\n4.Traspuesta\n4. Salir");
        System.out.print("Ingrese una opcion: "); op=in.nextInt();
        
        switch(op){
            case 1:{
                int[] x=null, y=null;
                
                System.out.println("\nPrimera matriz\n");
                x= tamaño(x);
                double [][]matriz_1=new double[x[0]][x[1]];
                matriz_1=crearMatriz(matriz_1);
                imprimir(matriz_1);
                
                System.out.println("\nSegunda matriz\n");
                y= tamaño(y);
                double [][]matriz_2=new double[y[0]][y[1]];
                matriz_2=crearMatriz(matriz_2);
                imprimir(matriz_2);
                
                System.out.println("\nLa suma de matrices es");
                sumaMatriz(matriz_1,matriz_2);
                
                break;
                
            }
            case 2:{
                int[] x=null, y=null;
                
                System.out.println("\nPrimera matriz\n");
                x= tamaño(x);
                double [][]matriz_1=new double[x[0]][x[1]];
                matriz_1=crearMatriz(matriz_1);
                imprimir(matriz_1);
                
                System.out.println("\nSegunda matriz\n");
                y= tamaño(y);
                double [][]matriz_2=new double[y[0]][y[1]];
                matriz_2=crearMatriz(matriz_2);
                imprimir(matriz_2);
                
                break;
            }
            case 3:{
                
            }
            case 4:{
                
            }
            case 5:{
                
            }
        }
        
        
        System.in.read();
    }
    
}
