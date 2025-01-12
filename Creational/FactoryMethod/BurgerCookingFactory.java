package Creational.FactoryMethod;

public class BurgerCookingFactory extends CookingFactory {
    @Override
    public Food doCooking() {
        return new Burger();
    }
}
