
public class PrintNumbersWithOutNumber{
    public static void main(String[] args){
        String str = "*";
        String end = "**********";
        for(int i=str.length();i<=end.length() * end.length();i++){
            System.out.print(i+" ");
        }
    }
}