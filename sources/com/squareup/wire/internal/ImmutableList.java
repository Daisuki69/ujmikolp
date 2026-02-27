package com.squareup.wire.internal;

import cj.AbstractC1117c;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ImmutableList<T> extends AbstractC1117c<T> implements RandomAccess, Serializable {
    private final ArrayList<T> list;

    public ImmutableList(List<? extends T> list) {
        j.g(list, "list");
        this.list = new ArrayList<>(list);
    }

    private final Object writeReplace() throws ObjectStreamException {
        List listUnmodifiableList = Collections.unmodifiableList(this.list);
        j.f(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    @Override // java.util.List
    public T get(int i) {
        return this.list.get(i);
    }

    @Override // cj.AbstractC1115a
    public int getSize() {
        return this.list.size();
    }

    @Override // cj.AbstractC1115a, java.util.Collection
    public Object[] toArray() {
        return this.list.toArray(new Object[0]);
    }
}
