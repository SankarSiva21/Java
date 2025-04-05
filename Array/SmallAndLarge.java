import java.util.Scanner;

public class SmallAndLarge
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int lenght = sc.nextInt();

        int[] numbers = new int[lenght];

        System.out.print("Enter the Array: ");
        for(int i=0; i<lenght; i++){
            numbers[i] = sc.nextInt();
        }

        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        for(int i=0; i<lenght; i++){
            if(numbers[i] > large) large = numbers[i];
            if(numbers[i] < small) small = numbers[i];
        }
        
        System.out.println("The smallest "+small+" The largest "+large);
    }
}