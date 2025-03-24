public class fibinachi
{
    public static void main(String[] args){
        int firstNum = 0;
        int secondNum = 1;

        while(firstNum <= 100){
            int temp = firstNum+secondNum;
            System.out.print(firstNum+" ");
            firstNum = secondNum;
            secondNum = temp;
        }
    }
}