package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends AbstractList implements InterfaceC1210y, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1209x f10103a;

    public j0(C1209x c1209x) {
        this.f10103a = c1209x;
    }

    @Override // com.google.protobuf.InterfaceC1210y
    public final void b(C1192f c1192f) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f10103a.get(i);
    }

    @Override // com.google.protobuf.InterfaceC1210y
    public final Object getRaw(int i) {
        return this.f10103a.f10134b.get(i);
    }

    @Override // com.google.protobuf.InterfaceC1210y
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f10103a.f10134b);
    }

    @Override // com.google.protobuf.InterfaceC1210y
    public final InterfaceC1210y getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        i0 i0Var = new i0();
        i0Var.f10102a = this.f10103a.iterator();
        return i0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h0 h0Var = new h0();
        h0Var.f10099a = this.f10103a.listIterator(i);
        return h0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10103a.f10134b.size();
    }
}
