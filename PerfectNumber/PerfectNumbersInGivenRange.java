import java.util.Scanner;
// Print all the perfect numbers in given Range.
public class PerfectNumbersInGivenRange
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range Starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the range End number: ");
        int end = sc.nextInt();

        int factorsSum = 0;
        for(int i = start; i<= end; i++){
            factorsSum = 0;
            for( int j=1; j<i; j++){
                if(i%j == 0) factorsSum+=j;
            }
            if(factorsSum == i) System.out.print(i+" ");
        }

    }
}