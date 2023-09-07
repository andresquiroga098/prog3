
package arreglos;
import static arreglos.Arreglos.in;

public class operaciones {
    
    public static int leerInt(int x){
        x = in.nextInt();
        return x;
    }
    
    public static double[] rellenar(double[]x){
        for(int i=0; i<x.length; i++){
            x[i]= (int) (Math.random() * 100);
        }
        return x;
    }
    
    public static void imprimir(double[]x){
        for(int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
    }
    
    public static double[] burbuja(double[]x){
        double aux;
        for(int i=0; i<x.length; i++){
            for (int j=1+i; j<x.length; j++){
                
                if(x[j]<x[i]){
                    aux=x[i];   x[i]=x[j];  x[j]=aux;
                }
            }
        }
        
        return x;
    }
    
    public static double[] insercion(double[]x){
        double aux;
        for(int i=1; i<x.length; i++){
            aux=x[i];
            int j= i-i;
            while(j>=0 && x[i]>aux){
                x[j+1]=x[j];
                j--;
            }
            x[j]=aux;
        }
        return x;
    }
    
    public static double[] seleccion(double[]x){
        int aux;
        double aux_2;
        
        for(int i=0; i<x.length-1; i++){
            aux=i;
            for(int j=i+1; j<x.length; j++){
                if(x[j]<x[aux]){
                    aux=j;
                }
                aux_2=x[aux];   x[aux]=x[i];    x[i]=aux_2;
            }
        }
        return x;
    }
    
    public static double[] mergeSort(double[]x){
        
        return x;
    }
}
