package ers.indiv02;
import java.util.Scanner;

public class ejercicio3 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
    System.out.println("Introduzca el primer numero");  
    int numero1 = keyboard.nextInt();
    System.out.println("Introduzca el segundo numero");  
    int numero2 = keyboard.nextInt();
    if(numero1 > numero2){
        System.out.println(numero1+" es mayor");
    }
    else if(numero1 == numero2){
        System.out.println("son iguales");
    }
    else {
        System.out.println(numero2+" es mayor");
                }
    }          
}
    

