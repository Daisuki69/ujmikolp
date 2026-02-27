package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.a;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@Nullable Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k8, @NonNull V v7, @NonNull K k10, @NonNull V v8, @NonNull K k11, @NonNull V v10) {
        Map mapZza = zza(3, false);
        mapZza.put(k8, v7);
        mapZza.put(k10, v8);
        mapZza.put(k11, v10);
        return Collections.unmodifiableMap(mapZza);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException(a.c(length, length2, "Key and values array lengths not equal: ", " != "));
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZza = zza(length, false);
        for (int i = 0; i < kArr.length; i++) {
            mapZza.put(kArr[i], vArr[i]);
        }
        return Collections.unmodifiableMap(mapZza);
    }

    @NonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i) {
        return i == 0 ? new ArraySet() : zzb(i, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T t5, @NonNull T t10, @NonNull T t11) {
        Set setZzb = zzb(3, false);
        setZzb.add(t5);
        setZzb.add(t10);
        setZzb.add(t11);
        return Collections.unmodifiableSet(setZzb);
    }

    private static Map zza(int i, boolean z4) {
        return i <= 256 ? new ArrayMap(i) : new HashMap(i, 1.0f);
    }

    private static Set zzb(int i, boolean z4) {
        if (i <= (true != z4 ? 256 : 128)) {
            return new ArraySet(i);
        }
        return new HashSet(i, true != z4 ? 1.0f : 0.75f);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T t5) {
        return Collections.singletonList(t5);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k8, @NonNull V v7, @NonNull K k10, @NonNull V v8, @NonNull K k11, @NonNull V v10, @NonNull K k12, @NonNull V v11, @NonNull K k13, @NonNull V v12, @NonNull K k14, @NonNull V v13) {
        Map mapZza = zza(6, false);
        mapZza.put(k8, v7);
        mapZza.put(k10, v8);
        mapZza.put(k11, v10);
        mapZza.put(k12, v11);
        mapZza.put(k13, v12);
        mapZza.put(k14, v13);
        return Collections.unmodifiableMap(mapZza);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t5 = tArr[0];
            T t10 = tArr[1];
            Set setZzb = zzb(2, false);
            setZzb.add(t5);
            setZzb.add(t10);
            return Collections.unmodifiableSet(setZzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZzb2 = zzb(length, false);
            Collections.addAll(setZzb2, tArr);
            return Collections.unmodifiableSet(setZzb2);
        }
        T t11 = tArr[0];
        T t12 = tArr[1];
        T t13 = tArr[2];
        T t14 = tArr[3];
        Set setZzb3 = zzb(4, false);
        setZzb3.add(t11);
        setZzb3.add(t12);
        setZzb3.add(t13);
        setZzb3.add(t14);
        return Collections.unmodifiableSet(setZzb3);
    }
}
