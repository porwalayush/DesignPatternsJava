package Creational.FactoryMethod;

public class PizzaCooking implements Cooking{
    @Override
    public void cook() {
        System.out.println("Pizza Cooking");
    }
}
