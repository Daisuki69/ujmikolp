package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import yf.C2531a;
import yf.k;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Df.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2531a f16065a;

    public c() {
        C2531a c2531a = new C2531a();
        this.f16065a = c2531a;
        k kVar = k.f21269a;
        c2531a.f(kVar);
        c2531a.f(kVar);
        c2531a.f(kVar);
        c2531a.f(kVar);
    }

    private Hf.d d(int i) {
        yf.b bVarK = this.f16065a.k(i);
        if (bVarK instanceof C2531a) {
            return new Hf.d((C2531a) bVarK);
        }
        return null;
    }

    private void i(int i, Hf.d dVar) {
        this.f16065a.f21151a.set(i, dVar == null ? k.f21269a : dVar.f2171a);
    }

    public Hf.d a() {
        return d(1);
    }

    public Hf.d b() {
        return d(0);
    }

    @Override // Df.c
    public yf.b c() {
        return this.f16065a;
    }

    public Hf.d e() {
        return d(3);
    }

    public Hf.d f() {
        return d(2);
    }

    public void g(Hf.d dVar) {
        i(1, dVar);
    }

    public void h(Hf.d dVar) {
        i(0, dVar);
    }

    public void j(Hf.d dVar) {
        i(3, dVar);
    }

    public void k(Hf.d dVar) {
        i(2, dVar);
    }

    public c(C2531a c2531a) {
        this.f16065a = c2531a;
        if (c2531a.f21151a.size() < 4) {
            for (int size = c2531a.f21151a.size() - 1; size < 4; size++) {
                this.f16065a.f(k.f21269a);
            }
        }
    }
}
