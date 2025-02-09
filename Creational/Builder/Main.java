package Creational.Builder;


public class Main {
    static class Car{
        private final String engine;
        private final int wheels;
        private final boolean airbags;

        public Car(CarBuilder carBuilder) {
            this.engine = carBuilder.engine;
            this.wheels = carBuilder.wheels;
            this.airbags = carBuilder.airbags;
        }
        @Override
        public String toString() {
            return "Car [Engine=" + engine + ", Wheels=" + wheels + ", Airbags=" + airbags + "]";
        }
    }

    static class CarBuilder {
        public String engine;
        public int wheels;
        public boolean airbags;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }
        public CarBuilder setAirbags(boolean airbags) {
            this.airbags = airbags;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
    public static void main(String[] args) {
        Car car = new CarBuilder().setAirbags(true).setEngine("V6").setWheels(4).build();
        System.out.println(car.toString());
    }
}
