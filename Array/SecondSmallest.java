import java.util.Scanner;

public class SecondSmallest{
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int lenght = sc.nextInt();

        int[] numbers = new int[lenght];

        System.out.print("Enter the Array: ");
        for(int i=0; i<lenght; i++){
            numbers[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int num : numbers){
            if( num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }
            else if(num < secondSmallest && num != smallest) secondSmallest = num;
        }
        System.out.print(secondSmallest);
    }
}