package androidx.collection;

import java.util.Map;
import kotlin.jvm.internal.j;
import rj.InterfaceC2213d;

/* JADX INFO: loaded from: classes.dex */
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, InterfaceC2213d {
    private final int index;
    private final Object[] keys;
    private final Object[] values;

    public MutableMapEntry(Object[] keys, Object[] values, int i) {
        j.g(keys, "keys");
        j.g(values, "values");
        this.keys = keys;
        this.values = values;
        this.index = i;
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.keys[this.index];
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.values[this.index];
    }

    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v7) {
        Object[] objArr = this.values;
        int i = this.index;
        V v8 = (V) objArr[i];
        objArr[i] = v7;
        return v8;
    }
}
