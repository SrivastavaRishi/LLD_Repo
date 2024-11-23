package CreationalDesignPattern.Singleton;

public class EagerInit {

    // Eager initialization of the singleton instance
    private static final EagerInit instance = new EagerInit();

    // Private constructor to prevent external instantiation
    private EagerInit() {
        System.out.println("EagerInit instance created");
    }

    // Public method to provide global access to the singleton instance
    public static EagerInit getInstance() {
        return instance;
    }

    // Example method 1: Display a message
    public void showMessage(String message) {
        System.out.println("Message: " + message);
    }

    // Example method 2: Add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Example method 3: Multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Example method 4: Get the instance's hash code (for demonstration purposes)
    public int getInstanceHashCode() {
        return System.identityHashCode(this);
    }
}
