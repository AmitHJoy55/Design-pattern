package Pizza_Toppings_with_abstract_method;

public class Client {
    public static void main(String[] args) {

        Pizza pepperoni = new PepperoniPizza();
        pepperoni.prepare();
        pepperoni.addTopping("cheese");
        pepperoni.addTopping("tomato");
        pepperoni.addTopping("pepperoni");

        System.out.println();

        Pizza vegetarian = new VegetarianPizza();
        vegetarian.prepare();
        vegetarian.addTopping("cheese");
        vegetarian.addTopping("tomato");
        vegetarian.addTopping("vegetables");
    }
}
