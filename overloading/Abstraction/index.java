abstract class Transport {
    abstract public double calculateFare(double distance);

    public void displayType() {
        System.out.println("Transport System");
    }
}

class Bus extends Transport {
    @Override
    public double calculateFare(double distance) {
        return distance * 5;
    }
}

class Train extends Transport {
    @Override
    public double calculateFare(double distance) {
        return distance * 3;
    }
}

public class Index {
    public static void main(String[] args) {

        Transport t;

        t = new Bus();
        t.displayType();
        System.out.println("Bus Fare: " + t.calculateFare(10));

        t = new Train();
        t.displayType();
        System.out.println("Train Fare: " + t.calculateFare(10));
    }
}