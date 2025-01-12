package Creational.FactoryMethod;

public abstract class CookingFactory {
    public abstract Cooking doCooking();

    void sendFeedbackForm() {
        System.out.println("Thanks For choosing us, We would love to serve you in future");
    }
}
