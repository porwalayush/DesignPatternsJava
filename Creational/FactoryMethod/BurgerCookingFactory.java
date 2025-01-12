package Creational.FactoryMethod;

public class BurgerCookingFactory extends CookingFactory {
    @Override
    public Cooking doCooking() {
        return new BurgerCooking();
    }
}
