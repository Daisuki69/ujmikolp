package com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent;

import Df.c;
import yf.d;
import yf.j;

/* JADX INFO: loaded from: classes4.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final d f16058a;

    public b() {
        this.f16058a = new d();
    }

    public static b a(d dVar) {
        yf.b bVarW = dVar.w(j.f21262x1);
        return j.f21190Q0.equals(bVarW) ? new Kf.a(dVar, 0) : j.R0.equals(bVarW) ? new Kf.a(dVar, 1) : new b(dVar);
    }

    @Override // Df.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d c() {
        return this.f16058a;
    }

    public b(d dVar) {
        this.f16058a = dVar;
    }
}
