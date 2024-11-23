package CreationalDesignPattern.Singleton;

public class DoubleLocking {
    private static DoubleLocking instance;

    private DoubleLocking() {
    }

    public static synchronized DoubleLocking getInstance() {
        if (instance == null) { // 1
            synchronized (DoubleLocking.class) {
                if (instance == null) {
                    instance = new DoubleLocking();
                }
            }
        }

        return instance;
    }
}
