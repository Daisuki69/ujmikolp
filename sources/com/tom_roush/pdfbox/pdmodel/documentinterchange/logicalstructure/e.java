package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.io.IOException;
import yf.p;

/* JADX INFO: loaded from: classes4.dex */
public class e implements Df.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16047b = "OBJR";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yf.d f16048a;

    public e() {
        yf.d dVar = new yf.d();
        this.f16048a = dVar;
        dVar.G(yf.j.f21262x1, f16047b);
    }

    @Override // Df.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yf.d c() {
        return this.f16048a;
    }

    public Df.c b() {
        Gf.c cVarA;
        yf.b bVarQ = c().q(yf.j.f21186O0);
        if (!(bVarQ instanceof yf.d)) {
            return null;
        }
        try {
            if ((bVarQ instanceof p) && (cVarA = Gf.c.a((yf.d) bVarQ)) != null) {
                return cVarA;
            }
            yf.d dVar = (yf.d) bVarQ;
            Lf.a aVarA = Lf.a.a((yf.d) bVarQ);
            if (aVarA instanceof Lf.d) {
                if (!yf.j.j.equals(dVar.q(yf.j.f21262x1))) {
                    return null;
                }
            }
            return aVarA;
        } catch (IOException unused) {
            return null;
        }
    }

    public void d(Gf.c cVar) {
        c().E(yf.j.f21186O0, cVar);
    }

    public void e(Lf.a aVar) {
        c().E(yf.j.f21186O0, aVar);
    }

    public e(yf.d dVar) {
        this.f16048a = dVar;
    }
}
