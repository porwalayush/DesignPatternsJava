package Creational.FactoryMethod;

public class BurgerCooking implements Cooking {
    @Override
    public void cook() {
        System.out.println("Burger Cooking");
    }
}
