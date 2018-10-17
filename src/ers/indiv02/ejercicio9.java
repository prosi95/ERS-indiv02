package ers.indiv02;
import java.util.Scanner;

public class ejercicio9
{
    public static void main(String[] args)
    {
        String letra = "s";
        while(letra.equals("s"))
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Introduzca un numero");
            int numero = keyboard.nextInt();
            for(int numero2 = 1;numero2 <=10;numero2 ++)
            {
                System.out.println(numero+" x "+ numero2 +" = "+numero * numero2);
            }
        System.out.println("Si quiere realizar otra multiplicacion introduzca la letra S");
        letra = keyboard.next();
        }
    }
}