import java.util.Scanner;
public class NumberPattern
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int number = sc.nextInt();

        for(int i = 1; i<=number; i++){
            for(int j=1; j<=number; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}