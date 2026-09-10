package examples.immutable_class;


/**
 * Immutable:
 * - final поля
 * - нет сеттеров
 * - защитное копирование коллекций
 */
public final class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
