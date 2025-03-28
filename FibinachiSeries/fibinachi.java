import java.util.Scanner;
public class fibinachi
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the last number of series:");
        int lastNumber = sc.nextInt();

        int firstNum = 0;
        int secondNum = 1;

        while(firstNum <= lastNumber){
            int temp = firstNum+secondNum;
            System.out.print(firstNum+" ");
            firstNum = secondNum;
            secondNum = temp;
        }
    }
}