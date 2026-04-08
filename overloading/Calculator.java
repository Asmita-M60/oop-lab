class Calculator {
public int add(int a,int b){
return a+b;
}
protected int add(int a,int b,int c){
return a+b+c;
}
private double add(double a,double b){
return a+b;
}
public void displayDecimalAddition(double a,double b){
double result=add(a,b);
System.out.println("Sum of decimals: "+result);
}
}

public class Calculator {
public static void main(String[] args){
Calculator calc=new Calculator();
System.out.println("Sum of 2 integers: "+calc.add(10,20));
System.out.println("Sum of 3 integers: "+calc.add(10,20,30));
calc.displayDecimalAddition(5.5,4.5);
}
}