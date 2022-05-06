package homework.indivIdentityHashMap;

import java.util.HashSet;

public interface MyHashMap {

    Object put(Object key, Object value);
    
    interface Entry<k, v> {
        k getKey();

        v getValue();
    }
}
