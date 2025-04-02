import java.util.Scanner;

public class Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Number: ");

        int number = sc.nextInt();

        for(int i=1; i<=number; i++){
            for(int j=1; j<=number; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}