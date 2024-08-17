import java.util.Scanner;
public class IT24101888Lab4Q1
{
       public static void main(String[]args)
   {
       Scanner scanner=new Scanner(System.in);
       int No;
       System.out.print("Enter a number: ");
       No=scanner.nextInt();
       if(No>0)
     {
       System.out.print("The number is: Positive");
     }
       else if(No<0)
     {
       System.out.print("The number is: Negative");
     }
       else
     {
       System.out.print("The number is zero");
     }
  }
} 