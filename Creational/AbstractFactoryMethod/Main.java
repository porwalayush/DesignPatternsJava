package Creational.AbstractFactoryMethod;

public class Main {

    // Interfaces
    interface Food {
        void prepare();
    }
    interface Drink {
        void serve();
    }

    // Implementations of Food items
    static class Pizza implements Food {
        @Override
        public void prepare() {
            System.out.println("Preparing Pizza");
        }
    }
    static class Burger implements Food {
        @Override
        public void prepare() {
            System.out.println("Preparing Burger");
        }
    }

    // Implementations of Drink Items
    static class Softdrink implements Drink {
        @Override
        public void serve() {
            System.out.println("Serving Softdrink");
        }
    }
    static class Wine implements Drink {
        @Override
        public void serve() {
            System.out.println("Serving Wine");
        }
    }

    interface MealFactory {
        Food createFood();
        Drink serveDrink();
    }

    // Implementation of Meal Factories
    static class BurgerMealFactory implements MealFactory {
        @Override
        public Food createFood() {
            return new Burger();
        }
        @Override
        public Drink serveDrink() {
            return new Softdrink();
        }
    }

    static class PizzaMealFactory implements MealFactory {
        @Override
        public Food createFood() {
            return new Pizza();
        }
        @Override
        public Drink serveDrink() {
            return new Wine();
        }
    }

    // client application
    static class Restaurant {
        private Food food;
        private Drink drink;
        Restaurant(MealFactory mealFactory) {
            this.food = mealFactory.createFood();
            this.drink = mealFactory.serveDrink();
        }
        void prepareMeal() {
            food.prepare();
            drink.serve();
        }
    }

    public static void main(String[] args) {
        PizzaMealFactory pizzaMealFactory = new PizzaMealFactory();
        Restaurant pizzaRestaurant = new Restaurant(pizzaMealFactory);
        pizzaRestaurant.prepareMeal();

        BurgerMealFactory burgerMealFactory = new BurgerMealFactory();
        Restaurant burgerRestaurant = new Restaurant(burgerMealFactory);
        burgerRestaurant.prepareMeal();
    }
}
