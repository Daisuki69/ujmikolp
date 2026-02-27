package Kh;

import w.C2360b;

/* JADX INFO: renamed from: Kh.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0299d extends Ah.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.h[] f2722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2360b f2723b;
    public final int c;

    public C0299d(Ah.h[] hVarArr, C2360b c2360b, int i) {
        this.f2722a = hVarArr;
        this.f2723b = c2360b;
        this.c = i;
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        Ah.h[] hVarArr = this.f2722a;
        int length = hVarArr.length;
        if (length == 0) {
            jVar.a(Dh.b.f1156a);
            jVar.onComplete();
            return;
        }
        C0298c c0298c = new C0298c(jVar, this.f2723b, length, this.c);
        C0297b[] c0297bArr = c0298c.c;
        int length2 = c0297bArr.length;
        c0298c.f2718a.a(c0298c);
        for (int i = 0; i < length2 && !c0298c.f2721g && !c0298c.f; i++) {
            hVarArr[i].g(c0297bArr[i]);
        }
    }
}
