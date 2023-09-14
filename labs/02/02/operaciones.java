
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
    
    public static long mostrarTiempo(){
        long tiempo;
        tiempo = System.nanoTime();
        
        return tiempo;
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
           for(int j=i-1; j>=0 && x[j]>aux; j--){
               x[j+1]=x[j];
               x[j]=aux;
           }
        }
        return x;
    }
    
    public static double[] seleccion(double[]x){
        int aux, min;
        for(int i=0; i<x.length; i++){
           min=i;
           for(int j=i+1; j<x.length; j++){
               if(x[j]<x[min]){
                   min=j;
               }
           }
           aux=(int)x[i];  x[i]=x[min];    x[min]=aux;
        }
        return x;
    }
    
    public static double[] mergeSort(double[]x){
       if(x.length<2){
           return x;
       }
       
       int mid= (int) Math.ceil((double)x.length/2);
       double[] left= new double[mid];
       
       int rigthLength=0;
       if(x.length%2 == 0){
           rigthLength=mid;
       }else{
           rigthLength=mid-1;
       }
       
       double[] rigth= new double[rigthLength];
       
       int leftIndex=0;
       int rigthIndex=0;
       
       for(int i=0; i<x.length; i++){
           if(i<mid){
               left[leftIndex]= x[i];
               leftIndex++;
           }else{
               rigth[rigthIndex]= x[i];
               rigthIndex++;
           }
       }
       
       left=mergeSort(left);
       rigth=mergeSort(rigth);
      
        return merge(left, rigth);
    }
    
    public static double[] merge(double[]left, double[]rigth){
        double[] result= new double[left.length + rigth.length];
        int leftIndex=0;
        int rigthIndex=0;
        int resultIndex=0;
        
        while(leftIndex < left.length || rigthIndex < rigth.length){
            
            if(leftIndex < left.length && rigthIndex < rigth.length){
                if(left[leftIndex] < rigth[rigthIndex]){
                    result[resultIndex]= left[leftIndex];
                    leftIndex++;
                    resultIndex++;
                }
                else{
                    result[resultIndex]= rigth[rigthIndex];
                    rigthIndex++;
                    resultIndex++;
                }
            }
            else if(leftIndex < left.length){
                for(int i=resultIndex; i<result.length; i++){
                    result[i] = left[leftIndex];
                    leftIndex++;
                }
            }
            else if(rigthIndex < rigth.length){
                for(int i= resultIndex; i<result.length; i++){
                    result[i]= rigth[rigthIndex];
                    rigthIndex++;
                }
            }
        }
        return result;
        
    }
}
