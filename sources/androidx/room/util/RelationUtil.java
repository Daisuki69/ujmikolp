package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class RelationUtil {
    public static final <K, V> void recursiveFetchArrayMap(ArrayMap<K, V> map, boolean z4, Function1<? super ArrayMap<K, V>, Unit> fetchBlock) {
        j.g(map, "map");
        j.g(fetchBlock, "fetchBlock");
        ArrayMap arrayMap = new ArrayMap(999);
        int size = map.size();
        int i = 0;
        int i4 = 0;
        while (i < size) {
            if (z4) {
                arrayMap.put(map.keyAt(i), map.valueAt(i));
            } else {
                arrayMap.put(map.keyAt(i), null);
            }
            i++;
            i4++;
            if (i4 == 999) {
                fetchBlock.invoke(arrayMap);
                if (!z4) {
                    map.putAll((Map) arrayMap);
                }
                arrayMap.clear();
                i4 = 0;
            }
        }
        if (i4 > 0) {
            fetchBlock.invoke(arrayMap);
            if (z4) {
                return;
            }
            map.putAll((Map) arrayMap);
        }
    }

    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> map, boolean z4, Function1<? super HashMap<K, V>, Unit> fetchBlock) {
        int i;
        j.g(map, "map");
        j.g(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i = 0;
            for (K key : map.keySet()) {
                if (z4) {
                    j.f(key, "key");
                    map2.put(key, map.get(key));
                } else {
                    j.f(key, "key");
                    map2.put(key, null);
                }
                i++;
                if (i == 999) {
                    fetchBlock.invoke(map2);
                    if (!z4) {
                        map.putAll(map2);
                    }
                    map2.clear();
                }
            }
            break loop0;
        }
        if (i > 0) {
            fetchBlock.invoke(map2);
            if (z4) {
                return;
            }
            map.putAll(map2);
        }
    }

    public static final <V> void recursiveFetchLongSparseArray(LongSparseArray<V> map, boolean z4, Function1<? super LongSparseArray<V>, Unit> fetchBlock) {
        j.g(map, "map");
        j.g(fetchBlock, "fetchBlock");
        LongSparseArray<? extends V> longSparseArray = new LongSparseArray<>(999);
        int size = map.size();
        int i = 0;
        int i4 = 0;
        while (i < size) {
            if (z4) {
                longSparseArray.put(map.keyAt(i), map.valueAt(i));
            } else {
                longSparseArray.put(map.keyAt(i), null);
            }
            i++;
            i4++;
            if (i4 == 999) {
                fetchBlock.invoke(longSparseArray);
                if (!z4) {
                    map.putAll(longSparseArray);
                }
                longSparseArray.clear();
                i4 = 0;
            }
        }
        if (i4 > 0) {
            fetchBlock.invoke(longSparseArray);
            if (z4) {
                return;
            }
            map.putAll(longSparseArray);
        }
    }
}
