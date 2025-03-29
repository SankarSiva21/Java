import java.util.Scanner;

public class FibInRange
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number of the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the end number of the range: ");
        int end = sc.nextInt();

        int num1 = 0, num2 = 1, temp = 0;
        
        System.out.print("The series in Range: ");
        while(num1 <= end){
            if(num1 >= start)System.out.print(num1+" ");
            temp = num1+num2;
            num1 = num2;
            num2 = temp;
        }
    }
}