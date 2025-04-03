import java.util.Scanner;

public class FindNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the Array: ");
        int size = sc.nextInt();

        int number[] = new int[size];

        System.out.print("Enter elements of Array: ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        System.out.print("Enter the number to check that is present in array or not: ");
        int target = sc.nextInt();

        if(check(target, number)) System.out.println("The is present in the array");
        else System.out.print("The number is not present in the array");
    }

    static Boolean check(int target,int[] numbers){

        for(int i=0; i<numbers.length; i++) if(numbers[i] == target) return true;
        
        return false;
    }
}