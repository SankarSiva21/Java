import java.util.Scanner;
public class PerfectNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check the number is perfect or not: ");
        int number = sc.nextInt();
        int factorsSum = 1;
        if(number == 1) factorsSum = 0;
        for( int i=2; i<number; i++){
            if(number%i == 0) factorsSum += i;
        }
        if(factorsSum == number) System.out.println("The given number "+number+" is perfect number..!");
        else System.out.println("The given number "+number+" is not Perfect number..");
    }
}