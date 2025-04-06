import java.util.Scanner;

public class SecondLargeNumber{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of n array: ");
        int length = sc.nextInt();

        int[] numbers = new int[length];

        System.out.print("Enter the array: ");
        for(int i = 0; i < length; i++){
            numbers[i] = sc.nextInt();
        }
        if(numbers.length == 0){
            System.out.print("The array has no values to get second large number");
            return;
        } 
        System.out.print(secondLargeNumber(numbers));
    }
    static int secondLargeNumber(int[] numbers){
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            if(num > large){
                secondLarge = large;
                large = num;
            }
            else if(num > secondLarge && num != large){
                secondLarge = num;
            }
        }
        return secondLarge;
    }
}