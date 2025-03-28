import java.util.Scanner;
public class PrimeNumbersInRanage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number of range");
        int start = sc.nextInt();

        System.out.print("Enter the Ending number of range");
        int end = sc.nextInt();
        int i= 0,j =0;
        if( start == 0 || start == 1) start = 2;
        for (i = start; i <= end ; i++) {
            for (j = 2; j <= i; j++) {
                if(i%j == 0) break;
            }
            if(j == i) System.out.print(i+" ");
        }
    }
}
