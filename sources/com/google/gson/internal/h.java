package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f9983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f9984b = null;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f9985d;
    public final /* synthetic */ int e;

    public h(k kVar, int i) {
        this.e = i;
        this.f9985d = kVar;
        this.f9983a = kVar.f.f9990d;
        this.c = kVar.e;
    }

    public final Object a() {
        return b();
    }

    public final j b() {
        j jVar = this.f9983a;
        k kVar = this.f9985d;
        if (jVar == kVar.f) {
            throw new NoSuchElementException();
        }
        if (kVar.e != this.c) {
            throw new ConcurrentModificationException();
        }
        this.f9983a = jVar.f9990d;
        this.f9984b = jVar;
        return jVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9983a != this.f9985d.f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        j jVar = this.f9984b;
        if (jVar == null) {
            throw new IllegalStateException();
        }
        k kVar = this.f9985d;
        kVar.c(jVar, true);
        this.f9984b = null;
        this.c = kVar.e;
    }
}
