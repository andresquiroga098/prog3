
import java.util.Scanner;

public class Entrada {
    private static Scanner input= new Scanner(System.in);
    
    public static int leerInt(String mss){
        System.out.print(mss);
        return input.nextInt();
    }
    
    public static String leerTexto(String mss){
        System.out.print(mss);
        return input.nextLine();
    }
}
