
package matrices;
import static matrices.Matrices.in;

public class operaciones {
    public static int[] tamaño(int[] x){
       int  a, b;
       System.out.print("Ingrese el numero de filas: ");   a=in.nextInt();
       System.out.print("Ingrese el numero de columnas: ");  b=in.nextInt();
       
       x= new int[2];
       x[0]=a;    x[1]=b;
        
        return x;
    }
    
    public static double[][] crearMatriz(double[][] x){
        System.out.println("\nIngrese valores de la matriz: ");
        
        for (int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                x[i][j]= in.nextInt();
            }
        }
        return x;
    }
    
    
    public static void imprimir(double[][] x){
        for (int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+"    ");
            }
            System.out.println("\t");
        }

    }
    
    public static void sumaMatriz(double[][] x,double [][] y){
        
        if((x.length==y.length) && (x[1].length==y[1].length)){
            
            for (int i=0;i<x.length;i++){
                for(int j=0;j<x[i].length;j++){
                    x[i][j]= x[i][j]+y[i][j];
                }
            }
            imprimir(x);
            
        }else{
            System.out.println("Para poder sumar matrices estas deben tener el mismo"
                    + "numero de filas y columnas");
        }
    }
    
    
    public static void productoMatriz(double[][] x,double [][] y){
        
        if(y.length==x[1].length){
            
            for (int i=0;i<x.length;i++){
                for(int j=0;j<x[i].length;j++){
                    x[i][j]= (x[i][j]*y[i][j]);
                }
            }
            imprimir(x);
            
        }else{
            System.out.println("Para poder multiplicar matrices, la primera matriz debe"
                    + " tener el mismo nujmero de columnas que las filas de la segunda");
        }
    }
}
