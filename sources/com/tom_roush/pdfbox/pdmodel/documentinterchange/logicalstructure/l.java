package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<T> f16054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f16055b;

    private List<T> c() {
        if (this.f16054a == null) {
            this.f16054a = new ArrayList();
        }
        return this.f16054a;
    }

    private List<Integer> e() {
        if (this.f16055b == null) {
            this.f16055b = new ArrayList();
        }
        return this.f16055b;
    }

    public void a(T t5, int i) {
        c().add(t5);
        e().add(Integer.valueOf(i));
    }

    public T b(int i) {
        return c().get(i);
    }

    public int d(int i) {
        return e().get(i).intValue();
    }

    public void f(T t5, int i) {
        int iIndexOf = c().indexOf(t5);
        if (iIndexOf > -1) {
            e().set(iIndexOf, Integer.valueOf(i));
        }
    }

    public int g() {
        return c().size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < c().size(); i++) {
            if (i > 0) {
                sb2.append("; ");
            }
            sb2.append("object=");
            sb2.append(c().get(i));
            sb2.append(", revisionNumber=");
            sb2.append(d(i));
        }
        return sb2.toString();
    }
}
