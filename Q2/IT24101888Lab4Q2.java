import java.util.Scanner;
public class IT24101888Lab4Q2
{
       public static void main(String[]args)
   {
       Scanner scanner=new Scanner(System.in);
       int ExamMarks, LabMarks, ExamPercentage, LabPercentage;
    
       double FinalMark;
      
       System.out.print("Please enter exam marks (out of 100): ");
       ExamMarks=scanner.nextInt();
       if(ExamMarks<0 || ExamMarks>100)
     {
       System.out.print("Invalid input for exam marks. Terminating program.");
       return;
     }
      
      System.out.print("Please enter lab submission marks (out of 100): ");
      LabMarks=scanner.nextInt();
      if(LabMarks<0 || LabMarks>100)
     {
       System.out.print("Invalid input for lab submission marks. Terminating program.");
       return;
     }
     
      System.out.print("Please enter the percentage given for the exam: ");
      ExamPercentage=scanner.nextInt();
      
      System.out.print("Please enter the percentage given for the lab submission: ");
      LabPercentage=scanner.nextInt();

      if(ExamPercentage+LabPercentage!=100)
     {
       System.out.print("The percentage must add up to 100. Terminating program.");
       return;
     }
   
      FinalMark=(ExamMarks*ExamPercentage/100.0)+(LabMarks*LabPercentage/100.0);
      System.out.print("Final Exam Mark is : " +FinalMark);
   }
}

