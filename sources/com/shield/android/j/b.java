package com.shield.android.j;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public int ob;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public long f15434oc;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public List<X509Certificate> f15435od = new ArrayList();
    public List<X509Certificate> oe = new ArrayList();

    /* JADX INFO: renamed from: of, reason: collision with root package name */
    private final List<com.shield.android.p.a> f15436of = new ArrayList();

    /* JADX INFO: renamed from: og, reason: collision with root package name */
    private final List<com.shield.android.p.a> f15437og = new ArrayList();

    /* JADX INFO: renamed from: oh, reason: collision with root package name */
    private final List<com.shield.android.p.a> f15438oh = new ArrayList();

    public final void a(int i, Object... objArr) {
        this.f15437og.add(new com.shield.android.p.a(i, objArr));
    }

    public final void b(int i, Object... objArr) {
        this.f15436of.add(new com.shield.android.p.a(i, objArr));
    }

    public boolean cP() {
        return !this.f15438oh.isEmpty();
    }

    public boolean dl() {
        return !this.f15437og.isEmpty();
    }

    public List<? extends com.shield.android.p.a> dm() {
        return this.f15438oh;
    }

    public List<? extends com.shield.android.p.a> dn() {
        return this.f15437og;
    }

    public final List<? extends com.shield.android.p.a> dv() {
        return this.f15436of;
    }
}
