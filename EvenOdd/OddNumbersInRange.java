import java.util.Scanner;
public class OddNumbersInRange
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the end number: ");
        int num2 = sc.nextInt();

        if(num1%2 == 0) num1++;
        for(int i=num1; i<=num2; i+=2){
            System.out.print(i+" ");
        }
    }
}