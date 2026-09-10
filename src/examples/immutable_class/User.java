package examples.immutable_class;

import java.util.List;

/**
 * Пример иммутабельного класса с коллекцией
 * Immutable:
 * - final поля
 * - нет сеттеров
 * - защитное копирование коллекций
 */
public final class User {
    private final List<String> roles;

    public User(List<String> roles) {
        this.roles = List.copyOf(roles); // защитное копирование
    }

    public List<String> getRoles() {
        return List.copyOf(roles); // возвращаем копию
    }
}
