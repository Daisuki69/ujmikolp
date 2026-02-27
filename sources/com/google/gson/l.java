package com.google.gson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends o implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10032a = new ArrayList();

    @Override // com.google.gson.o
    public final BigDecimal a() {
        return l().a();
    }

    @Override // com.google.gson.o
    public final boolean c() {
        return l().c();
    }

    @Override // com.google.gson.o
    public final double d() {
        return l().d();
    }

    @Override // com.google.gson.o
    public final int e() {
        return l().e();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof l) && ((l) obj).f10032a.equals(this.f10032a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f10032a.hashCode();
    }

    @Override // com.google.gson.o
    public final long i() {
        return l().i();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f10032a.iterator();
    }

    @Override // com.google.gson.o
    public final String j() {
        return l().j();
    }

    public final o k(int i) {
        return (o) this.f10032a.get(i);
    }

    public final o l() {
        ArrayList arrayList = this.f10032a;
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        throw new IllegalStateException(We.s.f(size, "Array must have size 1, but has size "));
    }
}
