package collections.map.chaining;

import lombok.Data;
import lombok.NonNull;

@Data
public class HashItem<K, V> {

    private final K key;

    @NonNull
    private V value;

    private HashItem<K, V> nextHashItem;

}
