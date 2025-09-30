
/*
 * Class, Blueprint/instructionss, just describes
Instances, Actual object created from blueprint, can actually do work
Methods, Capabilities/actions defined in class	Only work when called on instances
 */

 class FoodOrder {
    //Properties (what each order has)
    String customerName;
    String foodItem;
    double price;
 
    // Method...what we can do with each order. 

    //1. Method to prepare the food. 
    public void prepare(){
        System.out.println("Cooking: " + foodItem + " for " + customerName);
    }

    //2. Method to serve food
    public void serve() {
        System.out.println("Serving: " + foodItem + " to " 
        + customerName);
    }
 }
public class MethodsInstances {
    public static void main(String[] args) {
        System.out.println("Restaurant Menu");
        //Create instances (actual food orders)
        FoodOrder order1 = new FoodOrder();
        FoodOrder order2 = new FoodOrder();

        order1.customerName = "Precious";
        order1.foodItem = "Burger";
        order1.price = 5000.00;

        //use the method on the instance
        order1.prepare();
        order1.serve();
    }
}