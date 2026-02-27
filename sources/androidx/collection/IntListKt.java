package androidx.collection;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class IntListKt {
    private static final IntList EmptyIntList = new MutableIntList(0);

    public static final IntList emptyIntList() {
        return EmptyIntList;
    }

    public static final IntList intListOf() {
        return EmptyIntList;
    }

    public static final MutableIntList mutableIntListOf() {
        return new MutableIntList(0, 1, null);
    }

    public static final IntList intListOf(int i) {
        return mutableIntListOf(i);
    }

    public static final MutableIntList mutableIntListOf(int i) {
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.add(i);
        return mutableIntList;
    }

    public static final IntList intListOf(int i, int i4) {
        return mutableIntListOf(i, i4);
    }

    public static final IntList intListOf(int i, int i4, int i6) {
        return mutableIntListOf(i, i4, i6);
    }

    public static final MutableIntList mutableIntListOf(int i, int i4) {
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.add(i);
        mutableIntList.add(i4);
        return mutableIntList;
    }

    public static final IntList intListOf(int... elements) {
        j.g(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.plusAssign(elements);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int i, int i4, int i6) {
        MutableIntList mutableIntList = new MutableIntList(3);
        mutableIntList.add(i);
        mutableIntList.add(i4);
        mutableIntList.add(i6);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int... elements) {
        j.g(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.plusAssign(elements);
        return mutableIntList;
    }
}
