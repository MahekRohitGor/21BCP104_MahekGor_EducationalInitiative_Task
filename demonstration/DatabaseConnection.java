package demonstration;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Private constructor prevents instantiation from other classes
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Database Connected.");
    }

    public void disconnect() {
        System.out.println("Database Disconnected.");
    }
}

class SingletonExample {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.connect();

        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.disconnect();

        // Both connection1 and connection2 should refer to the same instance.
        System.out.println("Are both instances the same? " + (connection1 == connection2));
    }
}