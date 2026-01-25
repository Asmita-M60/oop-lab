import java.util.Scanner;
public class Swap{
public static void main(String[]args){
Scanner x=new Scanner(System.in);
System.out.println("enter no 1:");
int a=x.nextInt();
System.out.println("enter no 2:");
int b=x.nextInt();
int c;
c=a;
a=b;
b=c;
System.out.println("after swap");
System.out.println("no 1 is"+a);
System.out.println("no 2 is "+b);
}
}