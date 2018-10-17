 package ers.indiv02;  
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        String numeroIntroducido = keyboard.nextLine();
        int numeroParseado = Integer.parseInt(numeroIntroducido);
        if(numeroParseado >= 0){
            System.out.println("El numero es positivo");
        } 
        else System.out.println("El numero es negativo");
    }
}
