package homework.indivIdentityHashMap;


import java.util.HashMap;
import java.util.Map;

public class IdentityHashMap implements MyHashMap {

    //1. Node состоящий из key, value и ссылкой на след Node
    static class Node implements MyHashMap.Entry {
        int hash;
        Object key;
        Object value;
        IdentityHashMap.Node next;

        Node(int hash, Object key, Object value, IdentityHashMap.Node next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public Object getKey() {
            return key;
        }

        @Override
        public Object getValue() {
            return value;
        }
    }
    //2. Конструктор. Внутри наша мапа это массив Node (Node[] map = new Node[(начальное значение)];
    private final int DEFAULT_INITIAL_CAPACITY = 16;
    private final float DEFAULT_LOAD_FACTOR = 0.75f;

    Node[] table = new Node[DEFAULT_INITIAL_CAPACITY];

    HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

  //  private int size = 0;


    //3. Написать функцию hash. !Контр вопрос Почему не исопльзуют просто hashCode?!
    public int hash(Object key) {
        int h;
        return key == null ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    //4. Метод put: Как найти индекс в который вставляем?
    @Override
    public Object put(Object key, Object value) {
        // Рассчитать хеш-значение ключа
        int hashValue = hash(key);
        // Рассчитать место, где он должен храниться
        int i = (table.length - 1) & hash(table);
        // Если в i есть данные и ключ тот же, перезаписать
        for (Node node = table[i]; node != null; node = node.next) {
            Object k;
            if (node.hash == hashValue && ((k = node.key) == key || key.equals(k))) {
                Object oldValue = node.value;
                node.value = value;
                return oldValue;
            }
        }
        // Если в позиции i нет данных или есть данные в позиции i, но ключ - это новый ключ, добавьте узел
        (key, value, hashValue, i);
        return null;
    }


    //      public int indexFor(int hashValue, int length) {
    //          return hashValue % length;
    //  }


}