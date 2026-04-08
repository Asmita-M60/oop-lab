class Notifier {
public void send(String msg){
System.out.println("General Notification: "+msg);
}
protected void send(String msg,String email){
System.out.println("Email to "+email+": "+msg);
}
void send(String msg,long phone){
System.out.println("SMS to "+phone+": "+msg);
}
private void send(String msg,String email,long phone){
System.out.println("Internal Notification: "+msg+" "+email+" "+phone);
}
public void accessPrivate(String msg,String email,long phone){
send(msg,email,phone);
}
}

class AppNotifier extends Notifier {
public void useMethods(){
send("Hello");
send("Hello","test@mail.com");
send("Hello",9876543210L);
accessPrivate("Hello","test@mail.com",9876543210L);
}
}

public class Notify {
public static void main(String[] args){
AppNotifier obj=new AppNotifier();
obj.useMethods();
}
}