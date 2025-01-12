package Creational.FactoryMethod;

public class PizzaCookingFactory extends CookingFactory{
    @Override
    public Cooking doCooking() {
        return new PizzaCooking();
    }
}
