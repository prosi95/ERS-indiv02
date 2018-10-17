
package ers.indiv02;
import java.util.Scanner;

public class ejercicio5 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca el numero de la operacion que quiere realizar\n 1. Suma\n 2. Resta\n 3. Multiplicacion\n 4. Division\n 5. Salir");  
        int numero = keyboard.nextInt();
        String operacion;
        switch(numero){
            case 1: operacion = "Suma";
                break;
            case 2: operacion = "Resta";
                break;
            case 3: operacion = "Multiplicacion";
                break;
            case 4: operacion = "Division";
                break;
            case 5: operacion = "Salir";
                break;
            default: operacion = "Este número no coincide con ninguna de las opciones disponibles";
                break;
        }
         System.out.println(operacion);
    }
}