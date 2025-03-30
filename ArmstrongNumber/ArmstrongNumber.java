import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int digitCount = 0, tempNumber = number;

        while(tempNumber > 0){ // never use tempNumber >= 0 it will crate infinite loop....!
            digitCount++;
            tempNumber = tempNumber/10;
        }

        System.out.println(digitCount);

    }
}