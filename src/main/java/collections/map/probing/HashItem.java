package collections.map.probing;

import lombok.Data;
import lombok.NonNull;

@Data
public class HashItem<K, V> {

    private final K key;

    @NonNull
    private V value;

}
