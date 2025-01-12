package Creational.FactoryMethod;

public class Pizza implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing a cheesy Pizza.");
    }
}
