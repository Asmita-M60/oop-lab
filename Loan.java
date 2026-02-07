import java.util.Scanner;
public class Loan{
public static void main(String[]args){
   String name;
   int credit_score;
   int income;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter name:");
   name=sc.nextLine();
   System.out.println("enter credit score:");
   credit_score=sc.nextInt();
   System.out.println("enter income:");
   income=sc.nextInt();
   if (credit_score>=750 && income>=50000){
     System.out.println("Approve loan upto 10 lakh");
   }
   else if(credit_score>=650 && income>=30000){
     System.out.println("Approve loan upto 5 lakh");
   }
   else{ 
     System.out.println("the loan application should be rejected");
   }
}
}
