import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the to check weather prime not not: ");
        int number = sc.nextInt();

        int i = 0;
        for(i = 2; i<number; i++){
            if(number%i == 0) break;
        }
        if( i == number) System.out.println("The given number "+number+" is Prime number");
        else System.out.print("The number "+number+" is not prime");
    }
}