class Account{
private int accountNumber;
private double balance;
public void setAccountNumber(int accountNumber){
this.accountNumber=accountNumber;
}
public int getAccountNumber(){
return accountNumber;
}
public double getBalance(){
return balance;
}
public void deposit(double amount){
if(amount>0){
balance+=amount;
}
}
public void withdraw(double amount){
if(amount>0 && amount<=balance){
balance-=amount;
}
}
}

public class Main{
public static void main(String[] args){
Account acc=new Account();
acc.setAccountNumber(12345);
acc.deposit(1000);
acc.withdraw(200);
System.out.println(acc.getAccountNumber());
System.out.println(acc.getBalance());
}
}