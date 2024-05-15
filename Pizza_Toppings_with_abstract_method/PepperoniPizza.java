package Pizza_Toppings_with_abstract_method;

public class PepperoniPizza extends Pizza {
    @Override
    public void addTopping(String topping) {

        // Pepperoni pizza has pepperoni, cheese, and tomato as toppings
        System.out.println("Adding " + topping + " to Base pizza");
    }
}
