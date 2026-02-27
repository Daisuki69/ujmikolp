package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import ph.C2059c2;

/* JADX INFO: loaded from: classes2.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        C2059c2 c2059c2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c2059c2.add(arrayList.get(i).freeze());
        }
        return c2059c2;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        C2059c2 c2059c2 = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            c2059c2.add(it.next().freeze());
        }
        return c2059c2;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        C2059c2 c2059c2 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            c2059c2.add(e.freeze());
        }
        return c2059c2;
    }
}
