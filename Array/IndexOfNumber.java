import java.util.Scanner;

public class IndexOfNumber
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the Array: ");
        int size = sc.nextInt();

        int number[] = new int[size];

        System.out.print("Enter elements of Array: ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        System.out.print("Enter the number to get index: ");
        int target = sc.nextInt(); 
    }
}