package com.squareup.wire.internal;

import cj.AbstractC1121g;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MutableOnWriteList<T> extends AbstractC1121g implements RandomAccess, Serializable {
    private final List<T> immutableList;
    private List<? extends T> mutableList;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableOnWriteList(List<? extends T> immutableList) {
        j.g(immutableList, "immutableList");
        this.immutableList = immutableList;
        this.mutableList = immutableList;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new ArrayList(this.mutableList);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, T t5) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        j.e(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        ((ArrayList) list).add(i, t5);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.mutableList.get(i);
    }

    public final List<T> getMutableList$wire_runtime() {
        return this.mutableList;
    }

    @Override // cj.AbstractC1121g
    public int getSize() {
        return this.mutableList.size();
    }

    @Override // cj.AbstractC1121g
    public T removeAt(int i) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        j.e(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return (T) ((ArrayList) list).remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i, T t5) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        j.e(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return (T) ((ArrayList) list).set(i, t5);
    }

    public final void setMutableList$wire_runtime(List<? extends T> list) {
        j.g(list, "<set-?>");
        this.mutableList = list;
    }
}
