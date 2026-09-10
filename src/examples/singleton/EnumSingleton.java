package examples.singleton;

/**
 * Singleton:
 * - enum — лучший вариант
 * - double-checked locking — потокобезопасный
 * - lazy — простой, но не потокобезопасный
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Hello!");
    }
}
