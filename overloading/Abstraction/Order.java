abstract class FoodOrder{
abstract void prepareOrder();
public void orderStatus(){
System.out.println("Order is being processed");
}
}

class VegOrder extends FoodOrder{
void prepareOrder(){
System.out.println("Preparing Veg Order");
}
}

class NonVegOrder extends FoodOrder{
void prepareOrder(){
System.out.println("Preparing Non-Veg Order");
}
}

public class Order{
public static void main(String[] args){
FoodOrder f;
f=new VegOrder();
f.orderStatus();
f.prepareOrder();
f=new NonVegOrder();
f.orderStatus();
f.prepareOrder();
}
}