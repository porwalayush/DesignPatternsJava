package Creational.FactoryMethod;

public class PizzaCookingFactory extends CookingFactory{
    @Override
    public Food doCooking() {
        return new Pizza();
    }
}
