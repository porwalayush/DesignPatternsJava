package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        // Create multiple threads to test Singleton behavior
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 trying to get instance...");
            DatabaseConnection instance1 = DatabaseConnection.getInstance();
            System.out.println("Instance memory address (Thread 1): " + System.identityHashCode(instance1));
            instance1.makeConnection();
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 trying to get instance...");
            DatabaseConnection instance2 = DatabaseConnection.getInstance();
            System.out.println("Instance memory address (Thread 2): " + System.identityHashCode(instance2));
            instance2.makeConnection();
        });

        Thread thread3 = new Thread(() -> {
            System.out.println("Thread 3 trying to get instance...");
            DatabaseConnection instance3 = DatabaseConnection.getInstance();
            System.out.println("Instance memory address (Thread 3): " + System.identityHashCode(instance3));
            instance3.makeConnection();
        });

        // Start threads simultaneously
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
