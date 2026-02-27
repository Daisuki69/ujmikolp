package Gf;

import java.util.Arrays;
import yf.C2531a;
import yf.f;
import yf.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Df.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f1968a;

    public a(C2531a c2531a) {
        this.f1968a = c2531a.r();
    }

    @Override // Df.c
    public final yf.b c() {
        C2531a c2531a = new C2531a();
        C2531a c2531a2 = new C2531a();
        c2531a2.f21151a.clear();
        for (float f : this.f1968a) {
            c2531a2.f(new f(f));
        }
        c2531a.f(c2531a2);
        c2531a.f(i.m(0));
        return c2531a;
    }

    public final String toString() {
        return "PDLineDashPattern{array=" + Arrays.toString(this.f1968a) + ", phase=0}";
    }
}
