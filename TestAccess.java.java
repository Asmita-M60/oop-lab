class Person {
    private int age = 21;          
    int id = 101;                  
    protected String name = "Ram"; 
    public String city = "Delhi"; 

    public void display() {
        System.out.println("Age: " + age);   
    }
}

public class TestAccess {
    public static void main(String[] args) {
        Person p = new Person();

        p.display();                 
        System.out.println(p.id);   
        System.out.println(p.name);  
        System.out.println(p.city);  

        // System.out.println(p.age); 
    }
}