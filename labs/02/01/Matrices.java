
package matrices;

import static matrices.operaciones.crearMatriz;
import static matrices.operaciones.imprimir;
import static matrices.operaciones.tamaño;
import static matrices.operaciones.sumaMatriz;
import java.io.IOException;
import java.util.Scanner;
import static matrices.operaciones.productoEscalar;
import static matrices.operaciones.productoMatriz;
import static matrices.operaciones.traspuesta;

public class Matrices {

    static Scanner in= new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int s=1;
        do{
            int op;

            System.out.println("\n\t\tMenu deoperaciones\n");
            System.out.println("1. Suma\n2. Producto\n3. Producto por escalar\n4. Traspuesta\n5. Salir");
            System.out.print("Ingrese una opcion: "); op=in.nextInt();

            switch(op){
                case 1 -> {
                    sumaMatrices();
                }
                case 2 -> {
                    productoMatrices();
                }
                case 3 -> {
                    productoEscalarMatriz();
                }
                case 4 -> {
                    matrizTraspuesta(); 
                }
                case 5 -> {
                    s=0;
                }
            }

            System.in.read();
            if(s==0){
                break;
            }else{
                System.out.print("\nDesea continuar?\n1.SI\n0.NO"); s=in.nextInt();
            }

        }while(s!=0);
       
    }

    private static void sumaMatrices() {
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
    }
    
    private static void productoMatrices() {
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
        System.out.println("\n");
                    
        productoMatriz(matriz_1, matriz_2);
    }
    
    private static void productoEscalarMatriz() {
        
        int[] x=null;
        double escalar;
                    
        System.out.println("\nMatriz\n");
        x= tamaño(x);
        double [][]matriz_1= new double [x[0]][x[1]];
        matriz_1=crearMatriz(matriz_1);
        imprimir(matriz_1);
                    
        System.out.print("Escalar: "); escalar= in.nextDouble();
                    
        System.out.println("\nEl producto es\n");
        productoEscalar(matriz_1,escalar);
    }
    
    private static void matrizTraspuesta() {
        int[] x=null;
                    
        System.out.println("\nMatriz\n");
        x= tamaño(x);
        double [][]matriz_1= new double [x[0]][x[1]];
        matriz_1=crearMatriz(matriz_1);
                    
        imprimir(matriz_1);
                    
        System.out.println("\nLa matriz traspuesta es\n");
        traspuesta(matriz_1);
    }
    
}
