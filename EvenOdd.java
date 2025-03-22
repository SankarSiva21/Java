public class EvenOdd
{
    public static void main(String[] args)
    {
        int num = 10;
        System.out.println(evenOdd(num));
    }
    static Boolean even(int num) // will check the is even or not and return true/false 
    {
        return num%2 == 0;
    }
    static String evenOdd(int num){
        return num%2 == 0 ? "Even" : "odd";
    }
}