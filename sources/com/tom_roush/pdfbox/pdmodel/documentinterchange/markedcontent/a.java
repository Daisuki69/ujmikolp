package com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent;

import Gf.c;
import java.util.ArrayList;
import java.util.List;
import yf.d;
import yf.j;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f16057b;
    private final List<Object> c;

    public a(j jVar, d dVar) {
        this.f16056a = jVar == null ? null : jVar.f21267a;
        this.f16057b = dVar;
        this.c = new ArrayList();
    }

    public static a d(j jVar, d dVar) {
        return j.f21229k.equals(jVar) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.a(dVar) : new a(jVar, dVar);
    }

    public void a(a aVar) {
        g().add(aVar);
    }

    public void b(Mf.a aVar) {
        g().add(aVar);
    }

    public void c(c cVar) {
        g().add(cVar);
    }

    public String e() {
        if (k() == null) {
            return null;
        }
        return k().B(j.f);
    }

    public String f() {
        if (k() == null) {
            return null;
        }
        return k().B(j.i);
    }

    public List<Object> g() {
        return this.c;
    }

    public String h() {
        if (k() == null) {
            return null;
        }
        return k().B(j.f21222g0);
    }

    public String i() {
        if (k() == null) {
            return null;
        }
        return k().z(j.f21175E0);
    }

    public int j() {
        if (k() == null) {
            return -1;
        }
        return k().t(j.I0, null, -1);
    }

    public d k() {
        return this.f16057b;
    }

    public String l() {
        return this.f16056a;
    }

    public String toString() {
        return "tag=" + this.f16056a + ", properties=" + this.f16057b + ", contents=" + this.c;
    }
}
