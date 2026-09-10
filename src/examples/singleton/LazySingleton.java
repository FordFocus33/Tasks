package examples.singleton;

/**
 * Singleton:
 * - enum — лучший вариант
 * - double-checked locking — потокобезопасный
 * - lazy — простой, но не потокобезопасный
 */

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
