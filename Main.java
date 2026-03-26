class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    protected void display() {
        System.out.println("This is Calculator class");
    }

    private void show() {
        System.out.println("Private method in Calculator");
    }

    public void accessPrivate() {
        show();
    }
}

// separate class
class AdvancedCalculator extends Calculator {

    public int add(int a, int b) {
        return a + b + 5;
    }

    protected void display() {
        System.out.println("This is AdvancedCalculator class");
    }

    public void show() {
        System.out.println("Show method in AdvancedCalculator");
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));
        c.display();
        c.accessPrivate();

        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println(ac.add(2, 3));
        ac.display();
        ac.show();

        // runtime polymorphism
        Calculator ref = new AdvancedCalculator();
        System.out.println(ref.add(2, 3));
        ref.display();
        ref.accessPrivate();
    }
}