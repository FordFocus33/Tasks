package trickyTasks;

public class SideEffectSurprise {
    static int x = 10;

    public static void main(String[] args) {
        int result = x + increment() + x;
        System.out.println("result = " + result);
        System.out.println("x = " + x);
    }

    static int increment() {
        return ++x;
    }
}