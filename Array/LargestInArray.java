import java.util.Scanner;

public class LargestInArray
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the Array: ");
        int length = sc.nextInt();

        int[] numbers =new int[length];

        System.out.print("Enter the Array: ");
        for(int i=0; i<length; i++){
            numbers[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;

        for(int j=0; j<length; j++) if(numbers[j] > largest) largest = numbers[j];

        System.out.println("The Largst number in Array is "+largest);
    }
}