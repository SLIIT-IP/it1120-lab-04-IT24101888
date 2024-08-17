import java.util.Scanner;

public class IT24101888Lab4Q3 
{
    public static void main(String[] args) 
   {
        int no;
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        no = scanner.nextInt();

        result = (no > 0) ? "The number is: Positive" : (no < 0) ? "The number is Negative" : "Number is Zero";

        System.out.println(result);
    }
}