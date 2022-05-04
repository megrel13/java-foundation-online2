package homework.indivIdentityHashMap;

public interface MyHashMap {

    // размер
    int size();

    // пусто
    boolean isEmpty();

    // Получить элементы на основе ключа
    Object get(Object key);

    // Добавить элементы
    Object put(Object key, Object value);

    // Внутренний интерфейс
    interface Entry<k, v> {
        k getKey();

        v getValue();
    }
}
