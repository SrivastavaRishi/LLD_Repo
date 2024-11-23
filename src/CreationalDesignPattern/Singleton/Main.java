package CreationalDesignPattern.Singleton;

import java.util.ArrayList;
import java.util.List;

class SingletonClass{
    int a;
    SingletonClass(){
        System.out.println("Singleton class created !!");
    }
    public void print(){
        System.out.println("Value of a is " + a);
    }
}

class Connection{
    String connectionString;
}

class DatabaseConnectionManager {
    private static final int MAX_CONNECTIONS = 10;
    private static DatabaseConnectionManager instance;
    private List<Connection> connectionPool;

    private DatabaseConnectionManager() {
        connectionPool = new ArrayList<>(MAX_CONNECTIONS);
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            connectionPool.add(createConnection());
        }
    }

    private Connection createConnection() {
        // Create and return a new db connection
        return connectionPool.getFirst();
    }

    synchronized public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public Connection getConnection() {
        // Return a connection from the pool
        return connectionPool.getFirst();
    }

    public void releaseConnection(Connection connection) {
        // Release the connection back to the pool
    }
}

public class Main {
    public static void main(String[] args) {
        // Access the Singleton instance
        EagerInit singleton1 = EagerInit.getInstance();

        // Call methods on the Singleton instance
        singleton1.showMessage("Hello from Singleton!");
        System.out.println("Addition: " + singleton1.add(10, 20));
        System.out.println("Multiplication: " + singleton1.multiply(5, 4));
        System.out.println("Singleton Instance Hash Code: " + singleton1.getInstanceHashCode());

        // Access the Singleton instance again
        EagerInit singleton2 = EagerInit.getInstance();
        System.out.println("Is the same instance? " + (singleton1 == singleton2));
        System.out.println("Hash Code of Second Access: " + singleton2.getInstanceHashCode());
    }
}
