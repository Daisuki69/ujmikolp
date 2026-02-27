package androidx.collection;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectLongMapKt {
    private static final MutableObjectLongMap<Object> EmptyObjectLongMap = new MutableObjectLongMap<>(0);

    public static final <K> ObjectLongMap<K> emptyObjectLongMap() {
        MutableObjectLongMap<Object> mutableObjectLongMap = EmptyObjectLongMap;
        j.e(mutableObjectLongMap, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.emptyObjectLongMap>");
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf() {
        return new MutableObjectLongMap<>(0, 1, null);
    }

    public static final <K> ObjectLongMap<K> objectLongMap() {
        MutableObjectLongMap<Object> mutableObjectLongMap = EmptyObjectLongMap;
        j.e(mutableObjectLongMap, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.objectLongMap>");
        return mutableObjectLongMap;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K k8, long j) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k8, j);
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k8, long j) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k8, j);
        return mutableObjectLongMap;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K k8, long j, K k10, long j6) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k8, j);
        mutableObjectLongMap.set(k10, j6);
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k8, long j, K k10, long j6) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k8, j);
        mutableObjectLongMap.set(k10, j6);
        return mutableObjectLongMap;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K k8, long j, K k10, long j6, K k11, long j7) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k8, j);
        mutableObjectLongMap.set(k10, j6);
        mutableObjectLongMap.set(k11, j7);
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k8, long j, K k10, long j6, K k11, long j7) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k8, j);
        mutableObjectLongMap.set(k10, j6);
        mutableObjectLongMap.set(k11, j7);
        return mutableObjectLongMap;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K k8, long j, K k10, long j6, K k11, long j7, K k12, long j9) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k8, j);
        mutableObjectLongMap.set(k10, j6);
        mutableObjectLongMap.set(k11, j7);
        mutableObjectLongMap.set(k12, j9);
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k8, long j, K k10, long j6, K k11, long j7, K k12, long j9) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k8, j);
        mutableObjectLongMap.set(k10, j6);
        mutableObjectLongMap.set(k11, j7);
        mutableObjectLongMap.set(k12, j9);
        return mutableObjectLongMap;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K k8, long j, K k10, long j6, K k11, long j7, K k12, long j9, K k13, long j10) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k8, j);
        mutableObjectLongMap.set(k10, j6);
        mutableObjectLongMap.set(k11, j7);
        mutableObjectLongMap.set(k12, j9);
        mutableObjectLongMap.set(k13, j10);
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k8, long j, K k10, long j6, K k11, long j7, K k12, long j9, K k13, long j10) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k8, j);
        mutableObjectLongMap.set(k10, j6);
        mutableObjectLongMap.set(k11, j7);
        mutableObjectLongMap.set(k12, j9);
        mutableObjectLongMap.set(k13, j10);
        return mutableObjectLongMap;
    }
}
