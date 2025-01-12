package Creational.Singleton;

public class DatabaseConnection {
    private static volatile DatabaseConnection dbConnection;

    private DatabaseConnection() {
        System.out.println("Singleton.DatabaseConnection Instantiated");
    }

    public static DatabaseConnection getInstance() {
        if (dbConnection == null) {
            synchronized (DatabaseConnection.class) {
                if (dbConnection == null) {
                    try {
                        // Simulate delay for the first thread
                        System.out.println("Initializing instance... (10 seconds delay)");
                        Thread.sleep(10000); // 10-second delay
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Thread interrupted during initialization");
                    }
                    dbConnection = new DatabaseConnection();
                }
            }
        }
        return dbConnection;
    }

    public static void makeConnection() {
        System.out.println("Connection completed");
    }
}
