import java.util.Scanner;
public class Evenodd{
public static void main(String[]args){
Scanner x=new Scanner(System.in);
System.out.println("enter a number");
int a=x.nextInt();
if (a%2==0){
System.out.println("this is even number");
}
else{
System.out.println("this is odd number");
}
}
} 