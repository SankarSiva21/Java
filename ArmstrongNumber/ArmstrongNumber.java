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
        
        tempNumber = number;
        int powerSum = 0, r=0;

        while(tempNumber > 0){
            r = tempNumber % 10;
            tempNumber = tempNumber/10;
            int sum = 1;
            for(int i=0; i<digitCount; i++){
                sum = sum*r;
            }
            powerSum+=sum;
        }

        if(number == powerSum) System.out.print("The number "+number+" is Armstrong Number");
        else System.out.print("The number "+number+" is not Armstrong number");



    }
}