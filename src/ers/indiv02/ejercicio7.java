package ers.indiv02;
import java.util.Scanner;

public class ejercicio7 
{
      public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int numero = 50;
        while (numero < 97)
        {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
            numero ++;
        }
        
    }
}