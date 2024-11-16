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
        // Create and return a new database connection
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
        SingletonClass sc = new SingletonClass();
        sc.print();
    }
}
