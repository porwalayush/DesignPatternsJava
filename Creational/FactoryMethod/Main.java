package Creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PizzaCookingFactory pizzaCookingFactory = new PizzaCookingFactory();
        pizzaCookingFactory.doCooking().prepare();
        pizzaCookingFactory.sendFeedbackForm();

        BurgerCookingFactory burgerCookingFactory = new BurgerCookingFactory();
        burgerCookingFactory.doCooking().prepare();
        burgerCookingFactory.sendFeedbackForm();

    }
}
