package ers.indiv02;
import java.util.Scanner;

public class ejercicio8
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numero = keyboard.nextInt();
        for(int numero2 = 1;numero2 <=10;numero2 ++)
        {
            System.out.println(numero+" x "+ numero2 +" = "+numero * numero2);
        }
        /*
        int numero2 = 1;
        while(numero2 <= 10){
            System.out.println(numero+" x "+ numero2 +" = "+numero * numero2);
            numero2 ++;
        }
        */
    }
}