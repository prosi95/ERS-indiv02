package ers.indiv02;  
import java.util.Scanner;
public class ejercicio2 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numeroIntroducido = keyboard.nextInt();
        //int numeroParseado = Integer.parseInt(numeroIntroducido);
        if(numeroIntroducido == 0){
            System.out.println("El numero es 0");
        } 
        else if(numeroIntroducido > 0){
            System.out.println("El numero es positivo");
        }
        else {
            System.out.println("El numero es negativo");
        }
    }
}
