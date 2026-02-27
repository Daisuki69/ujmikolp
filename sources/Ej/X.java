package Ej;

import Bj.C0151l;
import Fj.AbstractC0248a;
import Fj.AbstractC0250c;
import gj.InterfaceC1526a;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends AbstractC0250c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0151l f1425b;

    @Override // Fj.AbstractC0250c
    public final boolean a(AbstractC0248a abstractC0248a) {
        V v7 = (V) abstractC0248a;
        if (this.f1424a >= 0) {
            return false;
        }
        long j = v7.i;
        if (j < v7.j) {
            v7.j = j;
        }
        this.f1424a = j;
        return true;
    }

    @Override // Fj.AbstractC0250c
    public final InterfaceC1526a[] b(AbstractC0248a abstractC0248a) {
        long j = this.f1424a;
        this.f1424a = -1L;
        this.f1425b = null;
        return ((V) abstractC0248a).t(j);
    }
}
