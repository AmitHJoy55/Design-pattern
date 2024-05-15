package Pizza_Toppings_with_abstract_method;

public abstract class Pizza 
{
    public abstract void addTopping(String topping);;
    public void prepare() {
        System.out.println("Pizza is preparing...Please wait!");
        bake();
    }
    private void bake() {
        System.out.println("Pizza is baking...Please wait!");
    }


}
