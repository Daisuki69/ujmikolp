package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import yf.C2531a;

/* JADX INFO: loaded from: classes4.dex */
public class i extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16052b = "StructTreeRoot";

    public i() {
        super(f16052b);
    }

    public void A(int i) {
        c().D(yf.j.f21205Y0, i);
    }

    public void B(Map<String, String> map) {
        yf.d dVar = new yf.d();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            dVar.G(yf.j.f(key), entry.getValue());
        }
        c().F(yf.j.f21224h1, dVar);
    }

    public Df.e r() {
        yf.b bVarQ = c().q(yf.j.f21256v0);
        if (bVarQ instanceof yf.d) {
            return new Cf.c((yf.d) bVarQ);
        }
        return null;
    }

    public yf.b s() {
        return c().q(yf.j.f21170B0);
    }

    @Deprecated
    public C2531a t() {
        yf.d dVarH = c();
        yf.j jVar = yf.j.f21170B0;
        yf.b bVarQ = dVarH.q(jVar);
        if (!(bVarQ instanceof yf.d)) {
            if (bVarQ instanceof C2531a) {
                return (C2531a) bVarQ;
            }
            return null;
        }
        yf.b bVarQ2 = ((yf.d) bVarQ).q(jVar);
        if (bVarQ2 instanceof C2531a) {
            return (C2531a) bVarQ2;
        }
        return null;
    }

    public Df.f u() {
        yf.b bVarQ = c().q(yf.j.f21203X0);
        if (bVarQ instanceof yf.d) {
            return new Df.f((yf.d) bVarQ);
        }
        return null;
    }

    public int v() {
        return c().t(yf.j.f21205Y0, null, -1);
    }

    public Map<String, Object> w() {
        yf.b bVarQ = c().q(yf.j.f21224h1);
        if (bVarQ instanceof yf.d) {
            try {
                return Df.b.a((yf.d) bVarQ);
            } catch (IOException e) {
                Log.e("PdfBox-Android", e.getMessage(), e);
            }
        }
        return new HashMap();
    }

    public void x(Df.e eVar) {
        c().E(yf.j.f21256v0, eVar);
    }

    public void y(yf.b bVar) {
        c().F(yf.j.f21170B0, bVar);
    }

    public void z(Df.f fVar) {
        c().E(yf.j.f21203X0, fVar);
    }

    public i(yf.d dVar) {
        super(dVar);
    }
}
