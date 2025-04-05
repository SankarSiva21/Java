import java.util.Scanner;

public class SmallestInArray{
    public static void main (String args[]){
        int numbers[] = {9,5,2,11, 15,1,99, 85, 7};

        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < smallest) smallest = numbers[i];
        }
        System.out.print(smallest);
    }
}