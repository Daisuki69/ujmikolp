package androidx.datastore.preferences.core;

import Bj.A;
import Bj.U;
import Ij.d;
import Ij.e;
import androidx.annotation.RestrictTo;
import cj.C1110A;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Actual_jvmAndroidKt {
    public static final <T> Set<T> immutableCopyOfSet(Set<? extends T> set) {
        j.g(set, "set");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(C1110A.Z(set));
        j.f(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final <K, V> Map<K, V> immutableMap(Map<K, ? extends V> map) {
        j.g(map, "map");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        j.f(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public static final A ioDispatcher() {
        e eVar = U.f603a;
        return d.f2362a;
    }
}
