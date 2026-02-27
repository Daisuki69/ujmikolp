package androidx.collection;

import java.util.Map;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes.dex */
final class MapEntry<K, V> implements Map.Entry<K, V>, InterfaceC2210a {
    private final K key;
    private final V value;

    public MapEntry(K k8, V v7) {
        this.key = k8;
        this.value = v7;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
