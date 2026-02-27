package ui;

import Oi.n;
import bi.C1026d;
import bi.i;
import dOYHB6.tiZVw8.numX49;
import java.util.Objects;
import ki.InterfaceC1782c;
import p2.C2009e;

/* JADX INFO: renamed from: ui.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2319f implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.split.android.client.storage.splits.c f20338b;
    public final Mi.d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2318e f20339d;
    public final C1026d e;
    public final C2009e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Qi.c f20340g;
    public final int h;

    public C2319f(C2318e c2318e, io.split.android.client.storage.splits.c cVar, Mi.d dVar, String str, Qi.c cVar2, C1026d c1026d, int i) {
        Objects.requireNonNull(cVar);
        this.f20338b = cVar;
        Objects.requireNonNull(c2318e);
        this.f20339d = c2318e;
        Objects.requireNonNull(dVar);
        this.c = dVar;
        this.f20337a = str;
        this.e = c1026d;
        this.f = new C2009e();
        Objects.requireNonNull(cVar2);
        this.f20340g = cVar2;
        this.h = i;
    }

    @Override // ki.InterfaceC1782c
    public final Ff.f execute() throws Throwable {
        io.split.android.client.storage.splits.c cVar = this.f20338b;
        long till = cVar.getTill();
        long jA = this.c.a();
        String strF = cVar.f();
        String str = this.f20337a;
        String strTnTj78 = numX49.tnTj78("bHPL");
        String str2 = str != null ? str : strTnTj78;
        if (strF == null) {
            strF = strTnTj78;
        }
        boolean zEquals = str2.equals(strF);
        boolean z4 = !zEquals;
        if (!zEquals) {
            cVar.g(str);
            till = -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ff.f fVarD = this.f20339d.d(new C2317d(till, Long.valueOf(jA)), z4, false, z4, this.h);
        n nVar = n.f4869a;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        Qi.c cVar2 = this.f20340g;
        cVar2.c(nVar, jCurrentTimeMillis2);
        if (fVarD.c == 1) {
            cVar2.p(nVar, System.currentTimeMillis());
            C1026d c1026d = this.e;
            if (c1026d != null) {
                i iVar = i.e;
                long till2 = cVar.getTill();
                this.f.getClass();
                if (till < till2) {
                    iVar = i.f;
                }
                c1026d.a(iVar);
            }
        }
        return fVarD;
    }
}
