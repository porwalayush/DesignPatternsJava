package Creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PizzaCookingFactory pizzaCookingFactory = new PizzaCookingFactory();
        pizzaCookingFactory.doCooking().cook();
        pizzaCookingFactory.sendFeedbackForm();

        BurgerCookingFactory burgerCookingFactory = new BurgerCookingFactory();
        burgerCookingFactory.doCooking().cook();
        burgerCookingFactory.sendFeedbackForm();

    }
}
