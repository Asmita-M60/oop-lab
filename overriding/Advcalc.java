class Calculator1 {
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

class AdvancedCalculator extends Calculator1 {
    @Override
    public int add(int a, int b) {
        return a + b + 10;
    }

    @Override
    protected void display() {
        System.out.println("This is AdvancedCalculator class");
    }

    public void show() {
        System.out.println("Show method in AdvancedCalculator");
    }
}

public class Advcalc {
    public static void main(String[] args) {

        Calculator1 c = new Calculator1();
        AdvancedCalculator ac = new AdvancedCalculator();
        Calculator1 ref = new AdvancedCalculator();

        System.out.println("Calculator add: " + c.add(5, 3));
        c.display();
        c.accessPrivate();

        System.out.println("AdvancedCalculator add: " + ac.add(5, 3));
        ac.display();
        ac.show();

        System.out.println("Runtime Polymorphism add: " + ref.add(5, 3));
        ref.display();
    }
}