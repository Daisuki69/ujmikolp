package Df;

import java.util.Arrays;
import yf.C2531a;
import yf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2531a f1131a;

    static {
        new g(612.0f, 792.0f);
        new g(612.0f, 1008.0f);
        new g(2383.937f, 3370.3938f);
        new g(1683.7795f, 2383.937f);
        new g(1190.5513f, 1683.7795f);
        new g(841.8898f, 1190.5513f);
        new g(595.27563f, 841.8898f);
        new g(419.52756f, 595.27563f);
        new g(297.63782f, 419.52756f);
    }

    public g(float f, float f3) {
        C2531a c2531a = new C2531a();
        this.f1131a = c2531a;
        c2531a.f(new yf.f(0.0f));
        c2531a.f(new yf.f(0.0f));
        c2531a.f(new yf.f(f + 0.0f));
        c2531a.f(new yf.f(0.0f + f3));
    }

    @Override // Df.c
    public final yf.b c() {
        return this.f1131a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        C2531a c2531a = this.f1131a;
        sb2.append(((l) c2531a.g(0)).f());
        sb2.append(",");
        sb2.append(((l) c2531a.g(1)).f());
        sb2.append(",");
        sb2.append(((l) c2531a.g(2)).f());
        sb2.append(",");
        sb2.append(((l) c2531a.g(3)).f());
        sb2.append("]");
        return sb2.toString();
    }

    public g(C2531a c2531a) {
        float[] fArrCopyOf = Arrays.copyOf(c2531a.r(), 4);
        C2531a c2531a2 = new C2531a();
        this.f1131a = c2531a2;
        c2531a2.f(new yf.f(Math.min(fArrCopyOf[0], fArrCopyOf[2])));
        c2531a2.f(new yf.f(Math.min(fArrCopyOf[1], fArrCopyOf[3])));
        c2531a2.f(new yf.f(Math.max(fArrCopyOf[0], fArrCopyOf[2])));
        c2531a2.f(new yf.f(Math.max(fArrCopyOf[1], fArrCopyOf[3])));
    }
}
